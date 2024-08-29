package co.argm.app;

import static java.lang.System.out;

/**
 * Genera y muestra una matriz identidad de 5x5.
 */
public class Identity {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    nums[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                out.print(nums[i][j] + "\t");
            }
            out.println();
        }
    }
}
