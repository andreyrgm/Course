import static java.lang.System.out;

/**
 * Ejemplo de uso de operadores unarios en Java.
 */
public class Unary {
    public static void main(String[] args) {
        int i = -5;

        out.println("Example 1: Positive unary operator");
        int j = +i; // j = +(-5) => -5
        out.println("j = " + j); // -5

        out.println("\nExample 2: Negative Unary Operator");
        int k = -i; // k = -(-5) => 5
        out.println("k = " + k); // 5

        i = 6;

        out.println("\nExample 3: Positive unary operator with new value");
        j = +i; // j = +(6) => 6
        out.println("j = " + j); // 6

        out.println("\nExample 4: Negative unary operator with new value");
        k = -i; // k = -(6) => -6
        out.println("k = " + k); // -6
    }
}
