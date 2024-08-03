import static java.lang.System.out;

/**
 * Ejemplo de uso de operadores lógicos en Java.
 */
public class Logical {
    public static void main(String[] args) {

        int i = 3;
        byte j = 3;
        float k = 127e-7f; // 0.0000127
        double l = 2.1413e3; // 2141.3
        boolean m = false;

        out.println("Example 1: Logical AND operator (&&) with multiple conditions");
        boolean b1 = i == j && k < l && m == false;
        out.println("b1 = " + b1); // true

        out.println("\nExample 2: Logical OR operator (||) with multiple conditions");
        boolean b2 = i == j || k < l;
        out.println("b2 = " + b2); // true

        out.println("\nExample 3: Combination of AND and OR operators with parentheses");
        boolean b3 = i == j && (k < l || m == true);
        out.println("b3 = " + b3); // true

        out.println("\nExample 4: Combination of AND and OR operators with parentheses and comparison");
        boolean b4 = (i == j || k < l) && m == true;
        out.println("b4 = " + b4); // false

        out.println("\nExample 5: Logical operators with Boolean constants");
        boolean b5 = (true || true) && false;
        out.println("b5 = " + b5); // false

        out.println("\nExample 6: Mixing OR (||) and AND (&&) operators");
        boolean b6 = true || false && false || false;
        out.println("b6 = " + b6); // true

        out.println("\nExample 7: Logical operators with multiple parentheses");
        boolean b7 = ((true || false) && false) || false;
        out.println("b7 = " + b7); // false
    }
}
