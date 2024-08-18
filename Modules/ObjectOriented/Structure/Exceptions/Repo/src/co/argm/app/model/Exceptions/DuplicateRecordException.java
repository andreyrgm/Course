package co.argm.app.model.Exceptions;

/**
 * Excepción lanzada cuando se intenta crear un registro duplicado.
 */
public class DuplicateRecordException extends WritingException {
    public DuplicateRecordException(String message) {
        super(message);
    }
}
