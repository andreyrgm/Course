package co.argm.app;

import static java.lang.System.out;
import static java.time.LocalDateTime.*;
import static java.time.Month.DECEMBER;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static java.time.format.DateTimeFormatter.ofPattern;

/**
 * Clase para trabajar con fechas y horas utilizando la clase LocalDateTime.
 */
public class DateHours {
    public static void main(String[] args) {
        out.println("Current date and time: " + now());
        out.println("Specific date and time: " + of(2020, DECEMBER, 24, 20, 45, 59));
        out.println("Parsed date and time: " + parse("2020-12-25T21:45:59.625326900"));

        out.println("Date and time one day and three hours later: " + now().plusDays(1).plusHours(3));
        out.println("Date and time five hours ago: " + now().minusHours(5));

        out.println("Current month: " + now().getMonth());
        out.println("Current day: " + now().getDayOfMonth());
        out.println("Current year: " + now().getYear());

        out.println("ISO format: " + now().format(ISO_LOCAL_DATE_TIME));
        out.println("Custom format: " + now().format(ofPattern("yyyy/MM/dd hh:mm:ss a")));
    }
}
