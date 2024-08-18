package co.argm.app.model.repository;

import co.argm.app.model.exceptions.DataAccessException;

import java.util.List;

/**
 * Interfaz que define operaciones CRUD para una entidad.
 *
 * @param <T> Tipo de entidad.
 */
public interface Crud<T> {
    List<T> list();

    T get(Integer id) throws DataAccessException;

    void create(T t) throws DataAccessException;

    void update(T t) throws DataAccessException;

    void delete(int id) throws DataAccessException;
}
