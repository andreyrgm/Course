package co.argm.app.ui;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.reduce para sumar una lista de números.
 */
public class Reduce {
    public static void main(String[] args) {
        Integer sum = of(5, 10, 15, 20).reduce(0, Integer::sum);
        out.println("Suma total: " + sum);
    }
}
