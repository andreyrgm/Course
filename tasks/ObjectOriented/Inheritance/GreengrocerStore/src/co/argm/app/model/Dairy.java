package co.argm.app.model;

/**
 * Clase que representa un producto lácteo.
 */
public class Dairy extends Product {

    private final int quantity;
    private final int proteins;

    public Dairy(int quantity, int proteins, String name, double price) {
        super(name, price);
        this.quantity = quantity;
        this.proteins = proteins;
    }

    @Override
    public String toString() {
        return super.toString() + "\tAmount: " + quantity + "\tProtein: " + proteins;
    }
}
