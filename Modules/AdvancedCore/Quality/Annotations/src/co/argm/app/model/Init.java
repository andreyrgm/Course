package co.argm.app.model;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Anotación para marcar métodos que deben ser invocados durante la inicialización del objeto.
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Init {
}
