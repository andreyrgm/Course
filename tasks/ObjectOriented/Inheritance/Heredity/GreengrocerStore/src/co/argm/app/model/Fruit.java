package co.argm.app.model;

/**
 * Clase que representa una fruta.
 */
public class Fruit extends Product {

    private final double weight;
    private final String color;

    public Fruit(double weight, String color, String name, double price) {
        super(name, price);
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\tWeight (gr): " + weight + "\tColor: " + color;
    }
}
