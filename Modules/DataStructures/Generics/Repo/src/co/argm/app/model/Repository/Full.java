package co.argm.app.model.Repository;

/**
 * Interfaz que agrupa las funcionalidades de contabilidad, operaciones CRUD, paginación y ordenamiento.
 */
public interface Full<T> extends Counter, Crud<T>, Pageable<T>, Sort<T> {
}
