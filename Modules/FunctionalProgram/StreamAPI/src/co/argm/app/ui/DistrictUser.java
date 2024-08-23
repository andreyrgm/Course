package co.argm.app.ui;

import co.argm.app.model.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de Streams para calcular estadísticas sobre la longitud de nombres de usuarios únicos.
 */
public class DistrictUser {
    public static void main(String[] args) {
        IntStream lengthNames = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(out::println);

        IntSummaryStatistics stats = lengthNames.summaryStatistics();
        out.println("Total: " + stats.getSum() + "\nMax: " + stats.getMax() + "\nMin: " + stats.getMin()
                + "\nPromedio: " + stats.getAverage());
    }
}
