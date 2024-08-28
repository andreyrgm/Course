package co.argm.app.model.repo;

import java.util.List;

/**
 * Interfaz genérica para realizar operaciones CRUD.
 *
 * @param <T> El tipo de entidad que el repositorio manejará.
 */
public interface Repo<T> {
    List<T> findAll();

    T byId(int id);

    void save(T t);

    void delete(int id);
}
