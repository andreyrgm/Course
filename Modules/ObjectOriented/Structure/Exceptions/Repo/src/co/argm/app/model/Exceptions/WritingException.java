package co.argm.app.model.Exceptions;

/**
 * Excepción lanzada cuando ocurre un error al escribir datos.
 */
public class WritingException extends DataAccessException {
    public WritingException(String message) {
        super(message);
    }
}
