package co.argm.app.model;

/**
 * Clase que representa un producto no perecedero.
 */
public class NotPerishable extends Product {

    private final int content;
    private final int calories;

    public NotPerishable(int content, int calories, String name, double price) {
        super(name, price);
        this.content = content;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return super.toString() + "\tContent: " + content + "gr\tCalories: " + calories;
    }
}
