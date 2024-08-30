package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza de pepperoni estilo Nueva York.
 */
public class PepperoniNY extends Product {
    public PepperoniNY() {
        super();
        name = "Pepperoni pizza New York";
        dough = "Thin stone dough";
        ingredients.add("Mozzarella");
        ingredients.add("Extra pepperoni");
        ingredients.add("Olives");
    }

    @Override
    public void cook() {
        out.println("Cooking for 40 min. at 90°C");
    }

    @Override
    public void cut() {
        out.println("Cut into triangles");
    }
}
