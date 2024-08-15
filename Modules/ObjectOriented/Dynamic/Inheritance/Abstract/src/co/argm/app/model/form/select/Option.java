package co.argm.app.model.form.select;

/**
 * Clase que representa una opción dentro de un elemento <select>.
 */
public class Option {
    private final String value;
    private final String name;
    private boolean selected;

    public Option(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public Option(String value, String name, boolean selected) {
        this.value = value;
        this.name = name;
        this.selected = selected;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    /**
     * Verifica si la opción está seleccionada.
     *
     * @return true si está seleccionada, false de lo contrario.
     */
    public boolean isSelected() {
        return selected;
    }
}
