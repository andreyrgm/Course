package co.argm.app.decorator.explain.model.decorator;

import co.argm.app.decorator.explain.model.Formattable;

/**
 * Decorador que añade una línea subrayada bajo el texto.
 */
public class Underline extends Abstract {
    public Underline(Formattable text) {
        super(text);
    }

    @Override
    public String format() {
        int length = text.format().length();
        return text.format() + "\n" + "_".repeat(length);
    }
}
