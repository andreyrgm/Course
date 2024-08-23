package co.argm.app.ui;

import java.util.function.BiFunction;
import java.util.function.Function;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de funciones en expresiones lambda.
 */
public class Functions {
    public static void main(String[] args) {
        // Función que saluda.
        Function<String, String> f1 = param -> "Hi how are things! " + param;
        out.println(f1.apply("Andrew"));

        // Función que convierte una cadena a mayúsculas.
        Function<String, String> f2 = String::toUpperCase;
        out.println(f2.apply("Andrew"));

        // BiFunction que concatena dos cadenas y las convierte a mayúsculas.
        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase() + b.toUpperCase();
        out.println(f3.apply("Andrey", "Gomez"));

        // BiFunction que compara dos cadenas.
        BiFunction<String, String, Integer> f4 = String::compareTo;
        out.println(f4.apply("Andrey", "Andrey"));

        // BiFunction que concatena dos cadenas.
        BiFunction<String, String, String> f5 = String::concat;
        out.println(f5.apply("Andrey", "Gomez"));
    }
}
