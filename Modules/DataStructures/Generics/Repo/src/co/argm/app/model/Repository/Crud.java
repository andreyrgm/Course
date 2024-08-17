package co.argm.app.model.Repository;

import java.util.List;

/**
 * Interfaz que define el contrato para operaciones CRUD (Crear, Leer, Actualizar, Eliminar).
 */
public interface Crud<T> {
    List<T> list();

    T get(int id);

    void create(T t);

    void update(T t);

    void delete(int id);
}
