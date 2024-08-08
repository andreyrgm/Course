import static java.lang.System.out;

/**
 * Ejemplo de transposición de una matriz en Java.
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] a = new int[8][4]; // Matriz original de tamaño 8x4
        int[][] b = new int[4][8]; // Matriz transpuesta de tamaño 4x8

        out.println("Original matrix a:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j * 3; // Asigna valores a la matriz 'a'
                out.print(a[i][j] + "\t");
            }
            out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j]; // Transposición: intercambiar filas y columnas
            }
        }

        out.println("\nThe transposed matrix b:");
        for (int[] ints : b) {
            for (int anInt : ints) {
                out.print(anInt + "\t");
            }
            out.println();
        }
    }
}
