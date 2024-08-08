import static java.lang.System.out;

/**
 * Ejemplo de suma de filas y columnas de una matriz en Java.
 */
public class AddRowColumn {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            int addRow = 0;
            int addColumn = 0;

            for (int j = 0; j < a[i].length; j++) {
                addRow += a[i][j];
                addColumn += a[j][i];
            }

            out.println("Total de la fila " + i + ": " + addRow);
            out.println("Total de la columna " + i + ": " + addColumn);
        }
    }
}
