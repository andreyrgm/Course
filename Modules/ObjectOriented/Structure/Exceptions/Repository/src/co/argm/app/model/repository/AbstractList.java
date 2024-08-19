package co.argm.app.model.repository;

import co.argm.app.model.Entity;
import co.argm.app.model.exceptions.DuplicateRecordException;
import co.argm.app.model.exceptions.ReadException;
import co.argm.app.model.exceptions.WritingException;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación abstracta para manejar una lista de entidades.
 *
 * @param <T> Tipo de entidad.
 */
public abstract class AbstractList<T extends Entity> implements Full<T> {
    protected final List<T> dataSource;

    protected AbstractList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public T get(Integer id) throws ReadException {
        if (id == null || id <= 0) {
            throw new ReadException("Invalid id must be > 0");
        }
        T result = null;
        for (T entity : dataSource) {
            if (entity.getId() != null && entity.getId().equals(id)) {
                result = entity;
                break;
            }
        }
        if (result == null) {
            throw new ReadException("The record with id does not exist: " + id);
        }
        return result;
    }

    @Override
    public void create(T entity) throws WritingException {
        if (entity == null) {
            throw new WritingException("Error writing a null object");
        } else if (dataSource.contains(entity)) {
            throw new DuplicateRecordException("Error object with id " + entity.getId() + " already exists");
        }
        dataSource.add(entity);
    }

    @Override
    public void delete(int id) throws ReadException {
        T entityToRemove = get(id);
        if (entityToRemove != null) dataSource.remove(entityToRemove);
    }

    @Override
    public List<T> list() {
        return new ArrayList<>(dataSource);
    }

    @Override
    public List<T> list(int from, int to) {
        return dataSource.subList(from, Math.min(to, dataSource.size()));
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}
