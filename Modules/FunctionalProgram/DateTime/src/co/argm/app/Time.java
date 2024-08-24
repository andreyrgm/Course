package co.argm.app;

import java.time.Duration;
import java.time.LocalDateTime;

import static java.lang.System.out;

public class Time {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.now();

        LocalDateTime date2 = LocalDateTime.now().plusHours(3).plusMinutes(20).plusDays(1);
        Duration lapse = Duration.between(date1, date2);
        out.println("lapse = " + lapse);
        out.println(lapse.toMinutes());
        out.println("We add 5 hours " + lapse.plusHours(5));
    }
}
