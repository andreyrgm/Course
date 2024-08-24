package co.argm.app;

import java.time.Instant;

import static java.lang.System.out;
import static java.time.Duration.between;
import static java.time.Instant.now;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Time2 {
    public static void main(String[] args) {
        Instant i1 = now();

        try {
            SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Instant i2 = now();
        out.println(between(i1, i2));
    }
}
