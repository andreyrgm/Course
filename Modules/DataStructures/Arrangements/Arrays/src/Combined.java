import static java.lang.System.out;

/**
 * Clase para combinar dos arreglos de enteros en un tercer arreglo de forma intercalada.
 */
public class Combined {
    public static void main(String[] args) {
        int[] a = new int[12];
        int[] b = new int[12];
        int[] c = new int[24];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0;
        for (int i = 0; i < a.length; i += 3) {
            for (int j = 0; j < 3; j++) {
                c[aux++] = a[i + j];
            }
            for (int j = 0; j < 3; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            out.println("Index " + i + ": " + c[i]);
        }
    }
}
