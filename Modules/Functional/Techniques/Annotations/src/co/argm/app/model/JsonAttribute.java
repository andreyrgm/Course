package co.argm.app.model;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Anotación para marcar los atributos de un objeto que deben ser serializados a JSON.
 */
@Documented
@Target(FIELD)
@Retention(RUNTIME)
public @interface JsonAttribute {

    /**
     * Nombre personalizado del atributo en el JSON.
     *
     * @return El nombre personalizado.
     */
    String name() default "";

    /**
     * Indica si se debe capitalizar el valor del atributo si es una cadena de texto.
     *
     * @return true si se debe capitalizar, false de lo contrario.
     */
    boolean capitalize() default false;
}
