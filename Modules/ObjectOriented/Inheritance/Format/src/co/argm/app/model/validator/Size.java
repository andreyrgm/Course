package co.argm.app.model.validator;

import co.argm.app.model.validator.message.Formattable;

/**
 * Validador para verificar si cumple con el rango requerido.
 */
public class Size extends Default implements Formattable {
    private final int min;
    private final int max;
    protected String message = "The field %s must have a minimum of %d characters and a maximum of %d characters.";

    public Size(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        if (value == null) {
            return true;
        }

        int length = value.length();
        return (length >= min && length <= max);
    }

    @Override
    public String getFormattedMessage(String field) {
        return String.format(message, field, min, max);
    }
}
