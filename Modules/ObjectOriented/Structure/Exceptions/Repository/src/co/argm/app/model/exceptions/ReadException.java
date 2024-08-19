package co.argm.app.model.exceptions;

/**
 * Excepción lanzada cuando ocurre un error al leer datos.
 */
public class ReadException extends DataAccessException {
    public ReadException(String message) {
        super(message);
    }
}
