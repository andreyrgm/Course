import javax.swing.*;

import static java.lang.System.out;

/**
 * Ejemplo de uso de operadores aritméticos en Java.
 */
public class Arithmetic {
    public static void main(String[] args) {
        int i = 5, j = 4;

        out.println("Example 1: Addition operation");
        int addition = i + j;
        out.println("addition = " + addition);
        out.println("i + j = " + (i + j));

        out.println("\nExample 2: Subtraction operation");
        int subtraction = i - j;
        out.println("subtraction = " + subtraction);
        out.println("(i - j) = " + (i - j));

        out.println("\nExample 3: Multiplication operation");
        int multiplication = i * j;
        out.println("multiplication = " + multiplication);

        out.println("\nExample 4: Division operation");
        int division = i / j;
        double division2 = (double) i / j;
        out.println("Integer division = " + division);
        out.println("Division with decimals = " + division2);

        out.println("\nExample 5: Modulus operation rest");
        int rest = i % j;
        out.println("rest = " + rest);

        int otherRest = 8 % 5;
        out.println("rest of 8 % 5 = " + otherRest);

        out.println("\nExample 6: Data entry and parity check");
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        if (num % 2 == 0) {
            out.println("The number is even: " + num);
        } else {
            out.println("The number is odd: " + num);
        }
    }
}
