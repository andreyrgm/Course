package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo que demuestra la inmutabilidad de la clase String en Java.
 */
public class Immutable {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Andrés Guzmán";

        String result = course.concat(teacher);
        out.println("course = " + course);
        out.println("result = " + result);
        out.println("course == result = " + (course == result));

        String result2 = course.transform(c -> c + " with " + teacher);
        out.println("course = " + course);
        out.println("result2 = " + result2);

        String result3 = result.replace("a", "A");
        out.println("result = " + result);
        out.println("result3 = " + result3);
    }
}
