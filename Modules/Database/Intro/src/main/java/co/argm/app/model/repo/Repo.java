package co.argm.app.model.repo;

import java.util.List;

public interface Repo<T> {
    List<T> findAll();

    T byId(int id);

    void save(T t);

    void delete(int id);
}
