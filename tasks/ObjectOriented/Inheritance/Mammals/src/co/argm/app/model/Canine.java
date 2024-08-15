package co.argm.app.model;

/**
 * Clase abstracta que representa a un cánido.
 */
public abstract class Canine extends Mammal {
    protected String color;
    protected double fangSize;

    public Canine(double fangSize, String color, String habitat, double height, double lengthy, double weight) {
        super(habitat, height, lengthy, weight);
        this.color = color;
        this.fangSize = fangSize;
    }

    @Override
    public String toString() {
        return super.toString() + "\nColor: " + color + "\nFang Size: " + fangSize;
    }
}
