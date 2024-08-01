import java.util.Scanner;

/**
 * Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
 * <p>
 * Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
 */

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number A: ");
        int a = sc.nextInt();

        System.out.println("Enter the number B: ");
        int b = sc.nextInt();
        int result = 0;

        boolean positiveB = b > -1;
        boolean positiveA = a > -1;

        int absoluteA = positiveA ? a : -a;

        for (int i = 0; i < absoluteA; i++) {
            result = result + b;
        }

        if (!positiveA) {
            result = -result;
        }

        System.out.println("Thr result is " + result);
    }
}
