package co.argm.app.model.Repository;

import co.argm.app.model.Entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase abstracta que implementa funcionalidades básicas de CRUD para listas.
 *
 * @param <T> Tipo de entidad que extiende de Entity.
 */
public abstract class AbstractList<T extends Entity> implements Full<T> {
    protected final List<T> dataSource;

    protected AbstractList() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public T get(int id) {
        for (T entity : dataSource) {
            if (entity.getId() != null && entity.getId().equals(id)) {
                return entity;
            }
        }
        return null;
    }

    @Override
    public void create(T entity) {
        dataSource.add(entity);
    }

    @Override
    public void delete(int id) {
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
