package co.argm.app.model.validator;

/**
 * Validador para verificar si un valor es un número.
 */
public class Num extends Default {
    protected final String message = "El campo %s debe ser un número";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
