package co.argm.app.decorator.explain.model.decorator;

import co.argm.app.decorator.explain.model.Formattable;

/**
 * Decorador que convierte el texto a mayúsculas.
 */
public class CapitalLetter extends Abstract {
    public CapitalLetter(Formattable text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().toUpperCase();
    }
}
