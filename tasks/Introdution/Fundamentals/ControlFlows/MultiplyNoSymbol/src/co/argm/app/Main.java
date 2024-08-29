package co.argm.app;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 * <p>
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(in);
        out.println("Enter the number A: ");
        int a = sc.nextInt();

        out.println("Enter the number B: ");
        int b = sc.nextInt();
        int result = 0;

        boolean positiveA = a > -1;

        int absoluteA = positiveA ? a : -a;

        for (int i = 0; i < absoluteA; i++) {
            result = result + b;
        }

        if (!positiveA) {
            result = -result;
        }

        out.println("Thr result is " + result);
    }
}
