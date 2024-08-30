package co.argm.app.factory.model.product;

import static java.lang.System.out;

/**
 * Clase que representa una pizza italiana estilo Nueva York.
 */
public class ItalianNY extends Product {
    public ItalianNY() {
        super();
        name = "Italian pizza New York";
        dough = "Thick dough";
        sauce = "Italian meat tomato sauce";
        ingredients.add("Mozzarella");
        ingredients.add("Olives");
        ingredients.add("Ham");
        ingredients.add("Sausage");
        ingredients.add("Mushrooms");
    }

    @Override
    public void cook() {
        out.println("Cooking for 30 min. at 120°C");
    }

    @Override
    public void cut() {
        out.println("Cut into large triangles");
    }
}
