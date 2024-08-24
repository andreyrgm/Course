package co.argm.app;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Locale;

import static java.lang.System.out;
import static java.time.LocalDate.*;
import static java.time.Month.NOVEMBER;
import static java.time.format.TextStyle.FULL;
import static java.time.temporal.ChronoUnit.MONTHS;

/**
 * Clase para trabajar con fechas utilizando la clase LocalDate.
 */
public class Date {
    public static void main(String[] args) {
        out.println("Current date: " + now());
        out.println("Day: " + now().getDayOfMonth());

        Month month = now().getMonth();
        out.println("Month: " + month);
        out.println("Month number: " + month.getValue());
        out.println("Month in Spanish: " + month.getDisplayName(FULL, new Locale("es", "CO")));

        DayOfWeek dayWeek = now().getDayOfWeek();
        out.println("Day number: " + dayWeek.getValue());
        out.println("Day name: " + dayWeek.getDisplayName(FULL, new Locale("es", "ES")));
        out.println("Year: " + now().getYear());
        out.println("Day of the year: " + now().getDayOfYear());
        out.println("Era: " + now().getEra());

        out.println("Specific date: " + of(2020, 12, 25));
        out.println("Specific date: " + of(2020, NOVEMBER, 11));
        out.println("Date parsed: " + parse("2020-02-01"));

        out.println("Tomorrow: " + now().plusDays(1));
        out.println("Previous month same day: " + now().minus(1, MONTHS));
        out.println("Wednesday: " + parse("2020-11-11").getDayOfWeek());

        out.println("Day of the month: " + of(2020, 11, 11).getDayOfMonth());

        out.println("It is a leap year: " + now().isLeapYear());
        out.println("It is before: " + of(2020, 11, 11).isBefore(parse("2020-11-10")));
        out.println("It is after: " + of(2020, 11, 11).isAfter(of(2020, 11, 10)));
        out.println("It's after yesterday: " + now().isAfter(now().minusDays(1)));
    }
}
