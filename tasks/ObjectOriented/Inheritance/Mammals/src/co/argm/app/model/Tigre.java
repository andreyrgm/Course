package co.argm.app.model;

/**
 * Clase que representa a un tigre.
 */
public class Tigre extends Feline {

    private final String specie;

    public Tigre(String specie, double sizeClaws, int speed, String habitat, double height, double lengthy, double weight) {
        super(sizeClaws, speed, habitat, height, lengthy, weight);
        this.specie = specie;
    }

    @Override
    public String communicate() {
        return "The tiger roars fiercely, intimidating its prey.";
    }

    @Override
    public String eat() {
        return "The tiger hunts alone, using its powerful claws and sharp teeth.";
    }

    @Override
    public String run() {
        return "The tiger sprints quickly, reaching speeds of up to " + speed + " km/h.";
    }

    @Override
    public String sleep() {
        return "The tiger sleeps in the dense forests of " + habitat + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecie: " + specie;
    }
}
