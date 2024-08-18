package co.argm.app;

/**
 * Excepción personalizada para manejar divisiones por cero.
 */
public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
