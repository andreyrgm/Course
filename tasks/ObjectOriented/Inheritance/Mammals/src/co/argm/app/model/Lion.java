package co.argm.app.model;

/**
 * Clase que representa a un león.
 */
public class Lion extends Feline {
    private final int packNum;
    private final double powerRoarDecibel;

    public Lion(double powerRoarDecibel, int packNum, double sizeClaws, int speed, String habitat, double height, double lengthy, double weight) {
        super(sizeClaws, speed, habitat, height, lengthy, weight);
        this.packNum = packNum;
        this.powerRoarDecibel = powerRoarDecibel;
    }

    @Override
    public String communicate() {
        return "The lion roars loudly at " + powerRoarDecibel + " decibels.";
    }

    @Override
    public String eat() {
        return "The lion hunts with his group of " + packNum + " individuals in the African plains.";
    }

    @Override
    public String run() {
        return "The lion runs at " + speed + " km/h.";
    }

    @Override
    public String sleep() {
        return "The lion sleeps in the African steppes.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nPack Number: " + packNum + "\nPower Roar Decibel: " + powerRoarDecibel;
    }
}
