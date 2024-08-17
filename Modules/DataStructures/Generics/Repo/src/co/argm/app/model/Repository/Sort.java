package co.argm.app.model.Repository;

import java.util.List;

/**
 * Interfaz que define el contrato para ordenar los resultados de una lista según un campo específico.
 */
public interface Sort<T> {
    List<T> list(String field, Direction dir);
}
