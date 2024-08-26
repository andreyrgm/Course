package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza de pepperoni estilo California.
 */
public class PepperoniC extends Product {
    public PepperoniC() {
        super();
        name = "Pepperoni pizza California";
        dough = "Thick stone dough";
        ingredients.add("Pepperoni");
        ingredients.add("Extra mozzarella cheese");
        ingredients.add("Olives");
    }

    @Override
    public void cook() {
        out.println("Cooking for 50 min. at 55°C");
    }

    @Override
    public void cut() {
        out.println("Cut into small rectangles");
    }
}
