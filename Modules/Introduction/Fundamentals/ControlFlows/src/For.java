import static java.lang.System.out;

/**
 * Ejemplo de uso de la estructura de control 'for' en Java.
 */
public class For {
    public static void main(String[] args) {

        out.println("Example 1: Forward iteration from 0 to 10");
        for (int i = 0; i <= 10; i++) {
            out.println("i = " + i);
        }

        out.println("\nExample 2: Backward iteration from 10 to 0");
        for (int i = 10; i >= 0; i--) {
            out.println("i = " + i);
        }

        out.println("\nExample 3: Iteration with two control variables (i and j)");
        for (int i = 1, j = 10; i < j; i++, j--) {
            out.println(i + " - " + j);
        }

        out.println("\nExample 4: Iteration from 0 to 10, even numbers only");
        for (int i = 0; i <= 10; i++) {
            if (!(i % 2 == 0)) { // Si i no es par, se salta la iteración
                continue;
            }
            out.println("i = " + i); // Se imprimen sólo los números pares
        }
    }
}
