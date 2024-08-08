import static java.lang.System.out;

/**
 * Ejemplo de verificación de sí una matriz es simétrica.
 */
public class Symmetrical {
    public static void main(String[] args) {
        boolean symmetrical = true;

        int[][] nums = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7},
        };

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] != nums[j][i]) {
                    symmetrical = false;
                    break;
                }
            }
        }

        if (symmetrical) {
            out.println("The matrix is symmetric");
        } else {
            out.println("The matrix is not symmetric");
        }
    }
}
