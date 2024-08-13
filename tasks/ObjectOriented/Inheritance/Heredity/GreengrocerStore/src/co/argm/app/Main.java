package co.argm.app;

import co.argm.app.model.*;

import static java.lang.System.out;

/**
 * Clase principal que ejecuta la aplicación.
 */
public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[8];
        products[0] = new Fruit(1200, "Red", "Apple", 2500);
        products[1] = new Fruit(1000, "Green", "Grapes", 3500);
        products[2] = new Cleaning("Dishwasher", 1.2, "Blancox", 2290);
        products[3] = new Cleaning("Lavender Sanitizer", 0.9, "Full Fresh", 1330);
        products[4] = new Dairy(1000, 32, "Semi-skimmed chocolate milk", 1150);
        products[5] = new Dairy(1000, 37, "Grape-flavored whipped yogurt", 1190);
        products[6] = new NotPerishable(170, 95, "Tuna Loins in Water", 960);
        products[7] = new NotPerishable(1000, 3536, "beans", 1990);

        for (Product prod : products) {
            out.println("--- " + prod.getClass().getSimpleName() + " ---");
            out.println(prod + "\n");
        }
    }
}
