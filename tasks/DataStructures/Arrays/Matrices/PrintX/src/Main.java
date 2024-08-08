import java.util.Scanner;

import static java.lang.System.*;

/**
 * Imprime una letra "X" en una matriz de tamaño n x n.
 *
 * <p>La letra "X" se construye usando el carácter 'X' en las diagonales de la matriz y el carácter guion bajo '_' para el relleno.</p>
 *
 * <p>Si el valor de n es 0, se imprime "ERROR" y se finaliza la ejecución del programa.</p>
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        out.print("Enter the size of the array (n x n): ");
        while (!sc.hasNextInt()) {
            err.println("Invalid input. Please enter a positive integer.");
            sc.next();
            out.print("Enter the size of the array (n x n): ");
        }
        int n = sc.nextInt();

        if (n <= 0) {
            err.println("ERROR: The size must be a positive integer.");
            exit(1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || j == n - i - 1) {
                    out.print("X");
                } else {
                    out.print("_");
                }
            }
            out.println();
        }
    }
}
