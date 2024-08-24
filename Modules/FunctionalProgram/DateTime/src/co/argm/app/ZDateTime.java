package co.argm.app;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.System.out;

public class ZDateTime {
    public static void main(String[] args) {
        LocalDateTime localDate = LocalDateTime.parse("2021/09/23 12:45",
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));

        ZonedDateTime nYZone = localDate.atZone(ZoneId.of("America/New_York"));
        out.println("Departure time in New York: " + nYZone);

        ZonedDateTime madridZone = nYZone.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
        out.println("Arrival time in Madrid: " + madridZone);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        out.println("Details of the trip to Spain:");
        out.println("New York Party: " + nYZone.format(formatter));
        out.println("Arrival in Madrid: " + madridZone.format(formatter));

        ZoneId.getAvailableZoneIds().forEach(out::println);
    }
}
