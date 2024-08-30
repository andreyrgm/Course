package co.argm.app.ui;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.distinct para eliminar elementos duplicados de un Stream.
 */
public class Distinct {
    public static void main(String[] args) {
        of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia", "Paco Gonzalez")
                .distinct()
                .forEach(out::println);
    }
}
