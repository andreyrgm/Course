package co.argm.app;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Locale;

import static java.lang.System.out;
import static java.time.LocalDate.*;
import static java.time.format.TextStyle.FULL;
import static java.time.temporal.ChronoUnit.MONTHS;

public class LDate {
    public static void main(String[] args) {

        out.println("Current date: " + now());
        out.println("Day: " + now().getDayOfMonth());
        Month month = now().getMonth();
        out.println("Month: " + month);
        out.println("Month number: " + month.getValue());
        out.println("Spanish month: " + month.getDisplayName(FULL, new Locale("es", "CO")));

        DayOfWeek dayWeek = now().getDayOfWeek();
        out.println("Day number: " + dayWeek.getValue());
        out.println("Name of the day: " + dayWeek.getDisplayName(FULL, new Locale("es", "ES")));
        out.println("Year: " + now().getYear());
        out.println("Day of the year: " + now().getDayOfYear());
        out.println("Era: " + now().getEra());

        out.println("Current date: " + of(2020, 12, 25));

        out.println("Current date: " + of(2020, Month.NOVEMBER, 11));

        out.println("Current Date: " + parse("2020-02-01"));

        out.println("Tomorrow: " + now().plusDays(1));

        out.println("Previous month same day: " + now().minus(1, MONTHS));

        out.println("Wednesday: " + parse("2020-11-11").getDayOfWeek());

        out.println(of(2020, 11, 11).getDayOfMonth());

        out.println("It's a leap year: " + now().isLeapYear());

        out.println("it's before: " + of(2020, 11, 11).isBefore(parse("2020-11-10")));

        out.println("it's after: " + parse("2020-11-11").isAfter(parse("2020-11-10")));

        out.println("it's after: " + now().isAfter(now().minusDays(1)));
    }
}
