package co.argm.app.model.Exceptions;

/**
 * Excepción lanzada cuando ocurre un error de acceso a datos.
 */
public class DataAccessException extends Exception {
    public DataAccessException(String message) {
        super(message);
    }
}
