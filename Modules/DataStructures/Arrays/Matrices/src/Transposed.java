import static java.lang.System.out;

/**
 * Ejemplo de transposición de una matriz cuadrada en Java.
 */
public class Transposed {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        out.println("Original matrix");
        for (int[] row : nums) {
            for (int value : row) {
                out.print(value + "\t");
            }
            out.println();
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums[i].length; j++) {
                int temp = nums[i][j];
                nums[i][j] = nums[j][i];
                nums[j][i] = temp;
            }
        }

        out.println("\nTransposed matrix");
        for (int[] row : nums) {
            for (int value : row) {
                out.print(value + "\t");
            }
            out.println();
        }
    }
}
