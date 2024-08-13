package co.argm.app.model;

/**
 * Clase base que representa un producto.
 */
public abstract class Product {
    protected String name;
    protected double price;

    protected Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tPrice: " + price;
    }
}
