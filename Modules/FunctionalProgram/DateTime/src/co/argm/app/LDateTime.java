package co.argm.app;

import static java.lang.System.out;
import static java.time.LocalDateTime.*;
import static java.time.Month.DECEMBER;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static java.time.format.DateTimeFormatter.ofPattern;

public class LDateTime {
    public static void main(String[] args) {
        out.println(now());
        out.println(of(2020, DECEMBER, 24, 20, 45, 59));
        out.println(parse("2020-12-25T21:45:59.625326900"));
        out.println(now().plusDays(1).plusHours(3));
        out.println(now().minusHours(5));

        out.println("Moth: " + now().getMonth());
        out.println("Day: " + now().getDayOfMonth());
        out.println("Year: " + now().getYear());

        out.println("Format: " + now().format(ISO_LOCAL_DATE_TIME));
        out.println("Format2: " + now().format(ofPattern("yyyy/MM/dd hh:mm:ss a")));
    }
}
