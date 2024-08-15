package co.argm.app.model.validator;

/**
 * Validador para verificar si un valor es un correo electrónico válido.
 */
public class Email extends Default {
    private final static String EMAIL_REGEX = "^(.+)@(.+)$";
    protected final String message = "El campo %s tiene un formato de correo electrónico no válido";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isValid(String value) {
        return value.matches(EMAIL_REGEX);
    }
}
