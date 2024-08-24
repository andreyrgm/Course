package co.argm.app.model.processor;

import co.argm.app.model.Init;
import co.argm.app.model.JsonAttribute;
import co.argm.app.model.processor.exception.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

/**
 * Clase utilitaria para serializar objetos a formato JSON.
 */
public class JsonSerializer {
    public static void initializeObject(Object obj) {
        if (Objects.isNull(obj)) {
            throw new JsonSerializerException("The object to be serialized cannot be null");
        }

        Method[] methods = obj.getClass().getDeclaredMethods();
        stream(methods)
                .filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializerException("Error while serializing, cannot initialize object: " + e.getMessage());
                    }
                });
    }

    /**
     * Convierte un objeto en su representación JSON.
     *
     * @param obj El objeto a convertir.
     * @return La representación JSON del objeto.
     * @throws JsonSerializerException Si el objeto es nulo o si ocurre un error durante la conversión.
     */
    public static String convertJson(Object obj) {
        if (Objects.isNull(obj)) {
            throw new JsonSerializerException("The object to be serialized cannot be null");
        }

        initializeObject(obj);

        Field[] fields = obj.getClass().getDeclaredFields();
        String jsonString = stream(fields)
                .filter(f -> f.isAnnotationPresent(JsonAttribute.class))
                .map(f -> {
                    f.setAccessible(true);
                    JsonAttribute annotation = f.getAnnotation(JsonAttribute.class);
                    String name = annotation.name().isEmpty() ? f.getName() : annotation.name();
                    try {
                        Object value = f.get(obj);
                        if (annotation.capitalize() && value instanceof String) {
                            String newValue = capitalizeWords((String) value);
                            f.set(obj, newValue);
                        }
                        return "\"" + name + "\":\"" + f.get(obj) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializerException("Error serializing to JSON: " + e.getMessage());
                    }
                })
                .collect(Collectors.joining(", ", "{", "}"));

        return jsonString;
    }

    /**
     * Capitaliza las palabras en una cadena de texto.
     *
     * @param input La cadena de texto a capitalizar.
     * @return La cadena con cada palabra capitalizada.
     */
    private static String capitalizeWords(String input) {
        return stream(input.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
