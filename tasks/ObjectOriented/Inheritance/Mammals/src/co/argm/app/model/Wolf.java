package co.argm.app.model;

/**
 * Clase que representa un lobo, que es un tipo de canino.
 */
public class Wolf extends Canine {
    private final int litterNum;
    private final String specie;

    public Wolf(int litterNum, String specie, double fangsSize, String color, String habitat, double height,
                double lengthy, double weight) {
        super(fangsSize, color, habitat, height, lengthy, weight);
        this.litterNum = litterNum;
        this.specie = specie;
    }

    @Override
    public String communicate() {
        return "The wolf " + specie + " with " + color + " fur howls at the full moon.";
    }

    @Override
    public String eat() {
        return "The wolf " + specie + " hunts with its group of " + litterNum + " individuals in the forests of " +
                habitat + ".";
    }

    @Override
    public String run() {
        return "The wolf " + specie + " runs in the plains surrounding the forests of " + habitat + ".";
    }

    @Override
    public String sleep() {
        return "The wolf with " + color + " fur sleeps in the caves of " + habitat + ".";
    }

    @Override
    public String toString() {
        return super.toString() + "\nLitter Number: " + litterNum + "\nSpecie: " + specie;
    }
}
