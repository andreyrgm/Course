package co.argm.app.decorator.explain.model.decorator;

import co.argm.app.decorator.explain.model.Formattable;

/**
 * Decorador que invierte el texto.
 */
public class Reverse extends Abstract {
    public Reverse(Formattable text) {
        super(text);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder(text.format());
        return sb.reverse().toString();
    }
}
