package co.argm.app.model.processor.exception;

/**
 * Excepción personalizada que se lanza cuando ocurre un error en la serialización JSON.
 */
public class JsonSerializerException extends RuntimeException {
    public JsonSerializerException(String message) {
        super(message);
    }
}
