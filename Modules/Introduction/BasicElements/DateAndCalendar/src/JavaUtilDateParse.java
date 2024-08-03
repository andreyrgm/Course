import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Ejemplo de uso de SimpleDateFormat para analizar fechas ingresadas por el usuario
 * y compararlas con la fecha actual.
 */
public class JavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        out.println("Please enter a date in yyyy-MM-dd format:");

        try {
            Date date = sdf.parse(sc.next());
            out.println("Date entered: " + date);
            out.println("Date formatted: " + sdf.format(date));

            Date date2 = new Date();
            out.println("Current date: " + date2);

            out.println("Example 1: Comparing dates using after(), before() and equals()");
            if (date.after(date2)) {
                out.println("The date entered is after the current date.");
            } else if (date.before(date2)) {
                out.println("The date entered is before the current date.");
            } else {
                out.println("The date entered is equal to the current date.");
            }

            out.println("Example 2: Comparing dates using compareTo()");
            int comparison = date.compareTo(date2);
            if (comparison > 0) {
                out.println("The date entered is after the current date.");
            } else if (comparison < 0) {
                out.println("The date entered is before the current date.");
            } else {
                out.println("The date entered is equal to the current date.");
            }

        } catch (ParseException e) {
            err.println("Invalid date format. Please enter a date in yyyy-MM-dd format.");
            main(args);
        }
    }
}