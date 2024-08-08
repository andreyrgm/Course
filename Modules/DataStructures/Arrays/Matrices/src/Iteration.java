import static java.lang.System.out;

/**
 * Ejemplo de iteración a través de una matriz bidimensional de strings.
 */
public class Iteration {
    public static void main(String[] args) {
        String[][] names = {{"Pepe", "Pepa"}, {"Josefa", "Paco"}, {"Lucas", "Pancha"}};

        out.println("Iterating with a for");
        for (String[] strings : names) {
            for (String string : strings) {
                out.print(string + " ");
            }
            out.println();
        }

        out.println("\nIterating with a foreach");
        for (String[] row : names) {
            for (String name : row) {
                out.print(name + "\t");
            }
            out.println();
        }
    }
}
