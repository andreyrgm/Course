package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza de queso estilo California.
 */
public class CheeseC extends Product {
    public CheeseC() {
        super();
        name = "California cheese pizza";
        dough = "Thin stone dough";
        sauce = "Arugula tomato sauce";
        ingredients.add("Extra mozzarella cheese");
        ingredients.add("Onion");
        ingredients.add("Blue cheese");
    }

    @Override
    public void cook() {
        out.println("Cooking for 35 min. at 100°C");
    }

    @Override
    public void cut() {
        out.println("Cut into small triangles");
    }
}
