package co.argm.app.model;

/**
 * Clase que representa un animal.
 * Esta clase es inmutable y utiliza un record para simplificar su definición.
 */
public record Animal(String name, String type) {

    @Override
    public String toString() {
        return name + " type: " + type;
    }
}
