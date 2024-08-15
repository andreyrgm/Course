package co.argm.app.model.validator;

/**
 * Clase abstracta para validadores de formularios.
 */
public abstract class Default {
    /**
     * Obtiene el mensaje de error asociado al validador.
     *
     * @return Mensaje de error.
     */
    public abstract String getMessage();

    /**
     * Verifica si un valor es válido según el criterio del validador.
     *
     * @param value Valor a validar.
     * @return true si es válido, false de lo contrario.
     */
    public abstract boolean isValid(String value);
}
