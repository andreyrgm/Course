package co.argm.app.factory.model.pizzeria;

import co.argm.app.factory.model.product.ItalianNY;
import co.argm.app.factory.model.product.PepperoniNY;
import co.argm.app.factory.model.product.Product;
import co.argm.app.factory.model.product.VegetarianNY;

/**
 * Clase concreta que representa una pizzería en Nueva York.
 * Implementa la creación de pizzas específicas para Nueva York.
 */
public class NewYork extends Pizzeria {
    @Override
    Product createPizza(String type) {
        return switch (type) {
            case "vegetarian" -> new VegetarianNY();
            case "pepperoni" -> new PepperoniNY();
            case "italian" -> new ItalianNY();
            default -> null;
        };
    }
}
