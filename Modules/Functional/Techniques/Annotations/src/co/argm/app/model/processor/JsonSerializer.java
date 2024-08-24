package co.argm.app.model.processor;

import co.argm.app.model.Init;
import co.argm.app.model.JsonAttribute;
import co.argm.app.model.processor.exception.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {
    public static void initializeObject(Object obj) {
        if (Objects.isNull(obj)) {
            throw new JsonSerializerException("The object to be serialized cannot be null");
        }
        Method[] methods = obj.getClass().getDeclaredMethods();
        Arrays.stream(methods).filter(m -> m.isAnnotationPresent(Init.class)).forEach(m -> {
            m.setAccessible(true);
            try {
                m.invoke(obj);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JsonSerializerException("Error serializing, cannot initialize object" + e.getMessage());
            }
        });
    }
    public static String convertJson(Object obj) {
        if (Objects.isNull(obj)) {
            throw new JsonSerializerException("The object to be serialized cannot be null");
        }
        initializeObject(obj);
        Field[] fields = obj.getClass().getDeclaredFields();
        return Arrays.stream(fields).filter(f -> f.isAnnotationPresent(JsonAttribute.class)).map(f -> {
            f.setAccessible(true);
            String name = f.getAnnotation(JsonAttribute.class).name().isEmpty() ? f.getName() : f
                    .getAnnotation(JsonAttribute.class).name();
            try {
                Object value = f.get(obj);
                if (f.getAnnotation(JsonAttribute.class).capitalize() && value instanceof String) {
                    String newValue = (String) value;
                    newValue = Arrays.stream(newValue.split(" ")).map(word -> word.substring(0, 1).toUpperCase()
                            + word.substring(1).toLowerCase()).collect(Collectors.joining(" "));
                    f.set(obj, newValue);
                }
                return "\"" + name + "\":\"" + f.get(obj) + "\"";
            } catch (IllegalAccessException e) {
                throw new JsonSerializerException("Error serializing to json: " + e.getMessage());
            }
        }).reduce("{", (a, b) -> {
            if ("{".equals(a)) {
                return a + b;
            }
            return a + ", " + b;
        }).concat("}");
    }
}
