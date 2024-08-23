package co.argm.app.model.repo;

import java.util.Optional;

/**
 * Interfaz genérica para un repositorio.
 *
 * @param <T> Tipo de objeto que maneja el repositorio.
 */
public interface Repo<T> {
    /**
     * Filtra los elementos del repositorio por nombre.
     *
     * @param name Nombre a buscar.
     * @return Un Optional con el objeto encontrado, o un Optional vacío si no se encuentra.
     */
    Optional<T> filter(String name);
}
