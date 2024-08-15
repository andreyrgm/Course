package co.argm.app.model;

/**
 * Clase abstracta que representa a un felino.
 */
public abstract class Feline extends Mammal {
    protected double clawsSize;
    protected int speed;

    public Feline(double clawsSize, int speed, String habitat, double height, double lengthy, double weight) {
        super(habitat, height, lengthy, weight);
        this.clawsSize = clawsSize;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return super.toString() + "\nClaws Size: " + clawsSize + "\nSpeed: " + speed;
    }
}
