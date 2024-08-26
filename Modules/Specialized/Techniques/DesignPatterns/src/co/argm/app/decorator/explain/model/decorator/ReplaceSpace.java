package co.argm.app.decorator.explain.model.decorator;

import co.argm.app.decorator.explain.model.Formattable;

/**
 * Decorador que reemplaza los espacios en el texto con guiones bajos.
 */
public class ReplaceSpace extends Abstract {
    public ReplaceSpace(Formattable text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().replace(" ", "_");
    }
}
