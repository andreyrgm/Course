package co.argm.app.model;

/**
 * Clase abstracta que representa a un mamífero.
 */
public abstract class Mammal {
    protected String habitat;
    protected double height;
    protected double lengthy;
    protected double weight;

    public Mammal(String habitat, double height, double lengthy, double weight) {
        this.habitat = habitat;
        this.height = height;
        this.lengthy = lengthy;
        this.weight = weight;
    }

    /**
     * Método abstracto para representar la comunicación del mamífero.
     *
     * @return una cadena que describe cómo se comunica el mamífero.
     */
    public abstract String communicate();

    /**
     * Método abstracto para representar la alimentación del mamífero.
     *
     * @return una cadena que describe cómo se alimenta el mamífero.
     */
    public abstract String eat();

    /**
     * Método abstracto para representar cómo corre el mamífero.
     *
     * @return una cadena que describe cómo corre el mamífero.
     */
    public abstract String run();

    /**
     * Método abstracto para representar cómo duerme el mamífero.
     *
     * @return una cadena que describe cómo duerme el mamífero.
     */
    public abstract String sleep();

    @Override
    public String toString() {
        return " =============== " + getClass().getSimpleName() + " =============== " +
                "\nHabitat: " + habitat +
                "\nHeight: " + height +
                "\nLengthy: " + lengthy +
                "\nWeight: " + weight;
    }
}
