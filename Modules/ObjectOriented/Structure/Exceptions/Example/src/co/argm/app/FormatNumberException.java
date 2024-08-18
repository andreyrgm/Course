package co.argm.app;

/**
 * Excepción personalizada para manejar errores de formato de número.
 */
public class FormatNumberException extends Exception {
    public FormatNumberException(String message) {
        super(message);
    }
}
