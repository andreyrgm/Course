package co.argm.app.model;

/**
 * Clase que representa un coche.
 */
public class Car {
    private final String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark;
    }
}
