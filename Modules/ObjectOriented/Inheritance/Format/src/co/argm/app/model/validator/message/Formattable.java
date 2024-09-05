package co.argm.app.model.validator.message;

/**
 * Interfaz que define un mensaje formateado para un campo específico.
 */
public interface Formattable {
    String getFormattedMessage(String field);
}
