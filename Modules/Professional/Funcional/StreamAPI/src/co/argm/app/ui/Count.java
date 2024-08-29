package co.argm.app.ui;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.count para contar el número de elementos en un Stream.
 */
public class Count {
    public static void main(String[] args) {
        long count = of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia").count();
        out.println("Número de elementos: " + count);
    }
}
