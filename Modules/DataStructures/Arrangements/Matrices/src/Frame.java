import static java.lang.System.out;

/**
 * Crea una matriz de 5x5 con un marco de 1s en los bordes.
 */
public class Frame {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == nums.length - 1 || j == 0 || j == nums[i].length - 1 || i == j) {
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
