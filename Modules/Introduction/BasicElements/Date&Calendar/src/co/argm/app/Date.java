package co.argm.app;

import java.text.SimpleDateFormat;

import static java.lang.System.out;

/**
 * Ejemplo de uso de la clase Date y SimpleDateFormat para formatear fechas y medir el tiempo transcurrido.
 */
public class Date {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        out.println("Current date and time: " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("E, MMM dd, yyyy");
        String formattedDate = sdf.format(date);
        out.println("Formatted date: " + formattedDate);

        long j = 0;
        for (int i = 0; i < 100_000_000; i++) {
            j += i;
        }
        out.println("Sum from 0 to 100,000,000: " + j);

        java.util.Date date2 = new java.util.Date();
        long elapsedTime = date2.getTime() - date.getTime();
        out.println("Time spent in loop: " + elapsedTime + " ms");
    }
}
