package co.argm.app.model;

/**
 * Clase que representa a un perro.
 */
public class Dog extends Canine {
    private final int biteForce;

    public Dog(int biteForce, double fangsSize, String color, String habitat, double height, double lengthy, double weight) {
        super(fangsSize, color, habitat, height, lengthy, weight);
        this.biteForce = biteForce;
    }

    @Override
    public String eat() {
        return "The African dog hunts in packs with a strong bite of " + biteForce + " PSI, has strong jaws and large rounded ears.";
    }

    @Override
    public String run() {
        return "The African dog runs on the plains bordering the savannah!";
    }

    @Override
    public String sleep() {
        return "The African dog sleeps in the African savannah.";
    }

    @Override
    public String communicate() {
        return "Dogs bark at night during night hunts.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nBite Force: " + biteForce;
    }
}
