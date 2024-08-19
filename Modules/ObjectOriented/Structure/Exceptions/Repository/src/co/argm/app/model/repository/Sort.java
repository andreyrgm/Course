package co.argm.app.model.repository;

import java.util.List;

/**
 * Interfaz que define operaciones de ordenación.
 *
 * @param <T> Tipo de entidad.
 */
public interface Sort<T> {
    List<T> list(String field, Direction dir);
}
