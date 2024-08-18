package co.argm.app.model.Repository;

import java.util.List;

/**
 * Interfaz que define operaciones de paginación.
 *
 * @param <T> Tipo de entidad.
 */
public interface Pageable<T> {
    List<T> list(int from, int to);
}
