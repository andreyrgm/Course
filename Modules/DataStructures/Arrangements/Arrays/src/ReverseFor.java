import java.util.Arrays;

import static java.lang.System.out;

/**
 * Ejemplo de iteración sobre un arreglo en orden normal e inverso.
 */
public class ReverseFor {
    public static void main(String[] args) {
        String[] products = {
                "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Samsung External SSD Hard Drive",
                "Asus Notebook",
                "Macbook Air",
                "Chromecast 4th generation",
                "Oxford bicycle"
        };
        int total = products.length;

        Arrays.sort(products);

        out.println("== Using for ==");
        for (int i = 0; i < total; i++) {
            out.println("For index " + i + ": " + products[i]);
        }

        out.println("\n== Using Reverse for ==");
        for (int i = 0; i < total; i++) {
            out.println("For index " + (total - 1 - i) + " value: " + products[total - 1 - i]);
        }

        out.println("\n== Using Reverse for 2 ==");
        for (int i = total - 1; i >= 0; i--) {
            out.println("For index " + i + " value: " + products[i]);
        }
    }
}
