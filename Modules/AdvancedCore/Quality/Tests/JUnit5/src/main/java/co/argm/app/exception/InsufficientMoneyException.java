package co.argm.app.exception;

/**
 * Excepción que se lanza cuando se intenta realizar una operación con fondos insuficientes.
 */
public class InsufficientMoneyException extends RuntimeException {
    public InsufficientMoneyException(String message) {
        super(message);
    }
}
