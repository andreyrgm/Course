import java.util.Scanner;

import static java.lang.System.*;

/**
 * Imprime una figura de silla (o letra 'h' minúscula) en una matriz de tamaño n x n.
 *
 * <p>La figura de silla se construye usando el número 1 y el número 0 como espacio. La figura tiene la forma de una silla
 * con una base y un respaldo, como se muestra en los ejemplos a continuación.</p>
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

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == n / 2 && j != 0 && j != n - 1) || (j == n - 1 && i >= n / 2)) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                out.print(matrix[i][j]);
            }
            out.println();
        }
    }
}
