package co.argm.app.model.form;

/**
 * Clase que representa un elemento de entrada de tipo input en un formulario HTML.
 */
public class Input extends Item {
    private final String type;

    public Input(String name, String type, String value) {
        super(name, value);
        this.type = type;
    }

    @Override
    public String drawHtml() {
        return "<input type=\"" + type + "\" name=\"" + name + "\" value=\"" + value + "\">";
    }
}
