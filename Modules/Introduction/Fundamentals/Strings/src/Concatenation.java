import static java.lang.System.out;

/**
 * Ejemplo de concatenación de cadenas en Java.
 */
public class Concatenation {
    public static void main(String[] args) {
        String course = "Java programming";
        String teacher = "Andrés Guzmán";

        String detail = course + " with the instructor " + teacher;
        out.println(detail);

        int numA = 10;
        int numB = 5;
        out.println(detail + (numA + numB));

        out.println(numA + numB + detail);

        String detail2 = course.concat(" with ").concat(teacher);
        out.println("detail2 = " + detail2);
    }
}
