package co.argm.app.ui;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.filter para contar el número de cadenas vacías en un Stream.
 */
public class Filter {
    public static void main(String[] args) {
        long count = of("Pato Guzman", "Paco Gonzalez", "", "Pepe Mena", "")
                .filter(String::isEmpty)
                .count();
        out.println("Número de cadenas vacías: " + count);
    }
}
