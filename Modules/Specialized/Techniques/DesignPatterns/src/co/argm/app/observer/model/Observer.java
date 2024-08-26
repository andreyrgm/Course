package co.argm.app.observer.model;

/**
 * Interfaz que define el método de actualización que los observadores deben implementar.
 */
public interface Observer {
    /**
     * Método llamado para actualizar al observador con información del observable.
     *
     * @param observable El objeto observable.
     * @param obj Datos adicionales enviados por el observable.
     */
    void update(Observable observable, Object obj);
}
