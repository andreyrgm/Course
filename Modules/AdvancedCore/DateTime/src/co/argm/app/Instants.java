package co.argm.app;

import java.time.Duration;
import java.time.Instant;

import static java.lang.System.out;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Clase para trabajar con Instants (instantes) y medir la duración entre ellos.
 */
public class Instants {
    public static void main(String[] args) {
        Instant i1 = Instant.now();

        try {
            SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Instant i2 = Instant.now();
        out.println("Duration between instants: " + Duration.between(i1, i2));
    }
}
