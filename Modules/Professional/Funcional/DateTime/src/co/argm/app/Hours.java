package co.argm.app;

import java.time.format.DateTimeFormatter;

import static java.lang.System.out;
import static java.time.LocalTime.*;

/**
 * Clase para trabajar con horas utilizando la clase LocalTime.
 */
public class Hours {
    public static void main(String[] args) {
        out.println("Current time: " + now());
        out.println("Hour: " + now().getHour());
        out.println("Minutes: " + now().getMinute());
        out.println("Seconds: " + now().getSecond());

        out.println("Specific time: " + of(6, 30, 59));
        out.println("Parsed time: " + parse("18:30:45"));
        out.println("One hour later: " + of(6, 30).plusHours(1));

        boolean isPrevious = of(6, 30, 59).isBefore(parse("07:30"));
        out.println("Is previous: " + isPrevious);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String nowFormatted = parse("18:30:45").format(df);
        out.println("Formatted time: " + nowFormatted);

        nowFormatted = df.format(now());
        out.println("Current formatted time: " + nowFormatted);

        out.println("Maximum time: " + MAX);
        out.println("Minimum time: " + MIN);
    }
}
