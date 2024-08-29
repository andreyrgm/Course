package co.argm.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.System.out;
import static java.util.Calendar.*;

/**
 * Ejemplo de uso de la clase Calendar para manipular fechas y formatearlas con SimpleDateFormat.
 */
public class Calendar {
    public static void main(String[] args) {

        getInstance().set(YEAR, 2000);
        getInstance().set(MONTH, JANUARY);
        getInstance().set(DAY_OF_MONTH, 25);
        getInstance().set(HOUR, 7);
        getInstance().set(AM_PM, PM);
        getInstance().set(MINUTE, 30);
        getInstance().set(SECOND, 20);
        getInstance().set(MILLISECOND, 125);

        Date date = getInstance().getTime();
        out.println("Date without format: " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss:SSS a");
        String formattedDate = sdf.format(date);
        out.println("Date with format: " + formattedDate);
    }
}
