package co.argm.app.decorator.explain.model;

/**
 * Clase que representa un texto básico.
 */
public class Text implements Formattable {
    private final String text;

    public Text(String text) {
        this.text = text;
    }

    @Override
    public String format() {
        return text;
    }
}
