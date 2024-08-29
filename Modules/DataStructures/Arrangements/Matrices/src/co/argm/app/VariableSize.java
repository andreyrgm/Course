package co.argm.app;

import static java.lang.System.out;

/**
 * Ejemplo de una matriz bidimensional con tamaños variables por fila.
 */
public class VariableSize {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];
        matrix[0] = new int[2]; // Fila 0 con 2 columnas
        matrix[1] = new int[3]; // Fila 1 con 3 columnas
        matrix[2] = new int[4]; // Fila 2 con 4 columnas

        out.println("matrix length: " + matrix.length +
                "\nrow 0 length: " + matrix[0].length +
                "\nrow 1 length: " + matrix[1].length +
                "\nrow 2 length: " + matrix[2].length + "\n");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        out.println("Matrix contents:");
        for (int[] row : matrix) {
            for (int value : row) {
                out.print(value + "\t");
            }
            out.println();
        }
    }
}
