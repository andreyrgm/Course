package co.argm.app.model.validator;

/**
 * Validador para verificar si un valor es obligatorio.
 */
public class Required extends Default {
    protected final String message = "El campo %s es obligatorio";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null && !value.trim().isEmpty());
    }
}
