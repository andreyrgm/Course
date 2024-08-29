package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza vegetariana estilo Nueva York.
 */
public class VegetarianNY extends Product {
    public VegetarianNY() {
        super();
        name = "Vegetarian pizza New York";
        dough = "Whole wheat dough";
        ingredients.add("Vegan cheese");
        ingredients.add("Tomato");
        ingredients.add("Olives");
        ingredients.add("Eggplants");
    }

    @Override
    public void cook() {
        out.println("Cooking for 25 min. at 150°C");
    }

    @Override
    public void cut() {
        out.println("Cut into square slices");
    }
}
