package co.argm.app.model.form;

/**
 * Clase que representa un elemento de área de texto (textarea) en un formulario HTML.
 */
public class Textarea extends Item {
    private final int rows;
    private final int cols;

    public Textarea(String name, String value, int rows, int cols) {
        super(name, value);
        this.rows = rows;
        this.cols = cols;
    }

    @Override
    public String drawHtml() {
        return "<textarea name='" + name + "' cols='" + cols + "' rows='" + rows + "'>" + value + "</textarea>";
    }
}
