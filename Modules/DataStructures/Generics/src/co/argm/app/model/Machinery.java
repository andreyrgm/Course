package co.argm.app.model;

/**
 * Clase que representa una maquinaria.
 */
public class Machinery {
    private final String type;

    public Machinery(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
