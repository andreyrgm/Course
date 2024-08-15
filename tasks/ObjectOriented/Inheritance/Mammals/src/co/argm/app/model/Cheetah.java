package co.argm.app.model;

/**
 * Clase que representa a un guepardo.
 */
public class Cheetah extends Feline {
    public Cheetah(double clawsSize, int speed, String habitat, double height, double lengthy, double weight) {
        super(clawsSize, speed, habitat, height, lengthy, weight);
    }

    @Override
    public String communicate() {
        return "The cheetah does not roar as loudly as the Lion";
    }

    @Override
    public String eat() {
        return "The cheetah hunts with its group on the African plains, with a bite much smaller than other big cats.";
    }

    @Override
    public String run() {
        return "The cheetah is the fastest feline in the world, it runs at " + speed + " km/h";
    }

    @Override
    public String sleep() {
        return "The cheetah sleeps in the African steppes";
    }
}
