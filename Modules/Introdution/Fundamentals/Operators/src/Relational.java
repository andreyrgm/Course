import static java.lang.System.*;

/**
 * Ejemplo de uso de operadores relacionales en Java.
 */
public class Relational {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f; // 0.0000127
        double l = 2.1413e3; // 2141.3
        boolean m = false;

        out.println("Example 1: Equality");
        boolean b1 = i == j;
        out.println("b1 = " + b1); // false, porque i (3) no es igual a j (7)

        out.println("\nExample 2: Denial");
        boolean b2 = !b1;
        out.println("b2 = " + b2); // true, porque b1 es false

        out.println("\nExample 3: Inequality");
        boolean b3 = i != j; // <> en algunos lenguajes
        out.println("b3 = " + b3); // true, porque i (3) es diferente de j (7)

        out.println("\nExample 4: Equality with Boolean");
        boolean b4 = m == true;
        out.println("b4 = " + b4); // false, porque m es false

        out.println("\nExample 5: Inequality with Boolean");
        boolean b5 = m != true;
        out.println("b5 = " + b5); // true, porque m es false

        out.println("\nExample 6: Greater than");
        boolean b6 = i > j;
        out.println("b6 = " + b6); // false, porque i (3) no es mayor que j (7)

        out.println("\nExample 7: Less than");
        boolean b7 = j < i;
        out.println("b7 = " + b7); // false, porque j (7) no es menor que i (3)

        out.println("\nExample 8: Greater than or equal to");
        boolean b8 = (l >= k);
        out.println("b8 = " + b8); // true, porque l (2141.3) es mayor o igual que k (0.0000127)

        out.println("\nExample 9: Less than or equal to");
        boolean b9 = l <= k;
        out.println("b9 = " + b9); // false, porque l (2141.3) no es menor o igual que k (0.0000127)
    }
}
