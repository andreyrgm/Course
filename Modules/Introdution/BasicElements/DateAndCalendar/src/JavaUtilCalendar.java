import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import static java.lang.System.out;

/**
 * Ejemplo de uso de la clase Calendar para manipular fechas y formatearlas con SimpleDateFormat.
 */
public class JavaUtilCalendar {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 25);
        cal.set(Calendar.HOUR, 7);
        cal.set(Calendar.AM_PM, Calendar.PM);
        cal.set(Calendar.MINUTE, 30);
        cal.set(Calendar.SECOND, 20);
        cal.set(Calendar.MILLISECOND, 125);

        Date date = cal.getTime();
        out.println("Date without format: " + date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd hh:mm:ss:SSS a");
        String formattedDate = sdf.format(date);
        out.println("Date with format: " + formattedDate);
    }
}
