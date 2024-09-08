package co.argm.app.model.validator;

/**
 * Validador para verificar si un valor no es nulo.
 */
public class NonNull extends Default {
    protected final String message = "El campo %s no puede ser nulo";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        return (value != null);
    }
}
