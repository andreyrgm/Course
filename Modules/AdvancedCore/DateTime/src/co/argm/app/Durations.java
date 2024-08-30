package co.argm.app;

import java.time.Duration;
import java.time.LocalDateTime;

import static java.lang.System.out;

/**
 * Clase para trabajar con Durations (duraciones) entre dos instancias de LocalDateTime.
 */
public class Durations {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();
        LocalDateTime date2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);

        Duration lapse = Duration.between(date1, date2);
        out.println("Duration between dates: " + lapse);
        out.println("Duration in minutes: " + lapse.toMinutes());
        out.println("Adding 5 hours: " + lapse.plusHours(5));
    }
}
