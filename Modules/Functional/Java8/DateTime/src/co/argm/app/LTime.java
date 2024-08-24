package co.argm.app;

import java.time.format.DateTimeFormatter;

import static java.lang.System.out;
import static java.time.LocalTime.*;

public class LTime {
    public static void main(String[] args) {

        out.println(now());
        out.println("Hour: " + now().getHour());
        out.println("Minutes: " + now().getMinute());
        out.println("Seconds: " + now().getSecond());

        out.println(of(6, 30, 59));

        out.println("sixAndThirty = " + parse("18:30:45"));
        out.println("sevenAndThirty = " + of(6, 30).plusHours(1));
        boolean esAnterior = of(6, 30, 59).isBefore(parse("07:30"));
        out.println("Is previous = " + esAnterior);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String nowFormatted = parse("18:30:45").format(df);
        out.println(nowFormatted);

        nowFormatted = df.format(now());
        out.println("nowFormatted = " + nowFormatted);

        out.println("max = " + MAX);
        out.println("min = " + MIN);
    }
}
