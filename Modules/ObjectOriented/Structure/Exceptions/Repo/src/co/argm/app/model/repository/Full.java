package co.argm.app.model.repository;

/**
 * Interfaz que extiende Counter, Crud, Pageable y Sort.
 *
 * @param <T> Tipo de entidad.
 */
public interface Full<T> extends Counter, Crud<T>, Pageable<T>, Sort<T> {
}
