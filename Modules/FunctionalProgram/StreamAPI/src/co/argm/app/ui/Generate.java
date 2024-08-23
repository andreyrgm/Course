package co.argm.app.ui;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.out;
import static java.util.stream.Stream.generate;

/**
 * Clase que demuestra el uso de Stream.generate para generar una secuencia infinita de números con una pausa entre ellos.
 */
public class Generate {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger(0);
        generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return counter.incrementAndGet();
        }).limit(7).forEach(out::println);
    }
}
