package co.argm.app;

import java.util.Objects;

import static java.lang.System.out;

/**
 * Ejemplo de validación y manipulación de cadenas en Java.
 */
public class Validate {
    public static void main(String[] args) {

        String course = null;

        boolean isNull = Objects.isNull(course);
        out.println("isNull = " + isNull);

        if (isNull) {
            course = "Java programming";
        }

        boolean itEmpty = course.isEmpty();
        out.println("itEmpty = " + itEmpty);

        boolean isBlank = course.isBlank();
        out.println("isBlank = " + isBlank);

        if (!isBlank) {
            out.println(course.toUpperCase());
            out.println("Welcome to the course " + course);
        }
    }
}
