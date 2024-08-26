package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza vegetariana estilo California.
 */
public class VegetarianC extends Product {
    public VegetarianC() {
        super();
        name = "California vegetarian pizza";
        dough = "Light thin dough";
        sauce = "Light BBQ sauce";
        ingredients.add("Mozzarella");
        ingredients.add("Olives");
        ingredients.add("Spinach");
        ingredients.add("Eggplants");
    }

    @Override
    public void cook() {
        out.println("Cooking for 20 min. at 180°C");
    }

    @Override
    public void cut() {
        out.println("Cut into square slices");
    }
}
