package co.argm.app.factory.model.pizzeria;

import co.argm.app.factory.model.product.CheeseC;
import co.argm.app.factory.model.product.PepperoniC;
import co.argm.app.factory.model.product.Product;
import co.argm.app.factory.model.product.VegetarianC;

/**
 * Clase concreta que representa una pizzería en California.
 * Implementa la creación de pizzas específicas para California.
 */
public class California extends Pizzeria {
    @Override
    Product createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheeseC();
            case "pepperoni" -> new PepperoniC();
            case "vegetarian" -> new VegetarianC();
            default -> null;
        };
    }
}
