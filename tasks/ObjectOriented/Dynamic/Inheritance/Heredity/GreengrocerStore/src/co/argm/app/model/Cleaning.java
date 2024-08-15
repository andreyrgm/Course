package co.argm.app.model;

/**
 * Clase que representa un producto de limpieza.
 */
public class Cleaning extends Product {

    private final String components;
    private final double liters;

    public Cleaning(String components, double liters, String name, double price) {
        super(name, price);
        this.components = components;
        this.liters = liters;
    }

    @Override
    public String toString() {
        return super.toString() + "\tComponents: " + components + "\tLiters: " + liters;
    }
}
