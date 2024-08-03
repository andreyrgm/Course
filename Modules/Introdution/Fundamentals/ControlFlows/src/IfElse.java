import static java.lang.System.out;

/**
 * Ejemplo de uso de sentencias 'if-else' para clasificar el promedio.
 */
public class IfElse {
    public static void main(String[] args) {
        double average = 5.5f;

        if (average >= 6.5) {
            out.println("Congratulations, excellent average!");
        } else if (average >= 6.0) {
            out.println("Very good average!");
        } else if (average >= 5.5) {
            out.println("Good average!");
        } else if (average >= 5.0) {
            out.println("Average, you need to work a little harder!");
        } else if (average >= 4.0) {
            out.println("Insufficient, you need to study more!");
        } else {
            out.println("Failed!");
        }

        out.println("Your average is " + average);
    }
}
