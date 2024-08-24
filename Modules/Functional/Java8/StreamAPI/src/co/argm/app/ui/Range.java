package co.argm.app.ui;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

import static java.lang.System.out;
import static java.util.stream.IntStream.range;

/**
 * Clase que demuestra el uso de IntStream.range para generar un rango de números y calcular estadísticas sobre ellos.
 */
public class Range {
    public static void main(String[] args) {
        IntStream nums = range(5, 20).peek(out::println);
        IntSummaryStatistics stats = nums.summaryStatistics();

        out.println("Max: " + stats.getMax() + "\nMin: " + stats.getMin() + "\nSuma: " + stats.getSum()
                + "\nPromedio: " + stats.getAverage() + "\nTotal: " + stats.getCount());
    }
}
