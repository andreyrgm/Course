package co.argm.app.decorator.example.model;

/**
 * Clase que representa un café básico con un nombre y un precio base.
 */
public class Coffee implements Configurable {
    private final String name;
    private final double price;

    public Coffee(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getBasePrice() {
        return price;
    }

    @Override
    public String getIngredients() {
        return name;
    }
}
