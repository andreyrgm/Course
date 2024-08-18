import static java.lang.System.out;

/**
 * Ejemplo de suma de dos matrices en Java.
 */
public class Adding {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        int[][] add = new int[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                add[i][j] = a[i][j] + b[i][j];
            }
        }

        out.println("Resulting matrix after addition:");
        for (int[] ints : add) {
            for (int anInt : ints) {
                out.print(anInt + "\t");
            }
            out.println();
        }
    }
}
