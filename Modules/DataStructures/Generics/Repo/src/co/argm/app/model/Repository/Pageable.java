package co.argm.app.model.Repository;

import java.util.List;

/**
 * Interfaz que define el contrato para paginar los resultados de una lista.
 */
public interface Pageable<T> {
    List<T> list(int from, int to);
}
