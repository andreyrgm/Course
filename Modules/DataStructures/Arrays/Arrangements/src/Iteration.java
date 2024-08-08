import java.util.Arrays;

import static java.lang.System.out;

/**
 * Ejemplo de iteración sobre arreglos usando diferentes estructuras de control.
 */
public class Iteration {
    public static void main(String[] args) {
        String[] products = new String[7];
        products[0] = "Kingston Pendrive 64GB";
        products[1] = "Samsung Galaxy";
        products[2] = "Samsung External SSD Hard Drive";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromecast 4th generation";
        products[6] = "Oxford bicycle";

        Arrays.sort(products);

        out.println("== Using for ==");
        for (int i = 0; i < products.length; i++) {
            out.println("Index " + i + ": " + products[i]);
        }

        out.println("\n== Using foreach ==");
        for (String product : products) {
            out.println("product = " + product);
        }

        out.println("\n== Using while ==");
        int i = 0;
        while (i < products.length) {
            out.println("Index " + i + ": " + products[i]);
            i++;
        }

        out.println("\n== Using do while ==");
        int j = 0;
        do {
            out.println("Index " + j + ": " + products[j]);
            j++;
        } while (j < products.length);

        int[] nums = new int[10];
        for (int k = 0; k < nums.length; k++) {
            nums[k] = k * 3;
        }

        out.println("\n== Generated Numbers ==");
        for (int num : nums) {
            out.println("number = " + num);
        }
    }
}
