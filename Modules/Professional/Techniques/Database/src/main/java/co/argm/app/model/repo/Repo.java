package co.argm.app.model.repo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Interfaz genérica para la gestión de repositorios.
 *
 * @param <T> El tipo de entidad gestionado por el repositorio.
 */
public interface Repo<T> {

    /**
     * Establece la conexión a la base de datos.
     *
     * @param conn La conexión a la base de datos.
     */
    void setConn(Connection conn);

    /**
     * Recupera todas las entidades de la base de datos.
     *
     * @return Lista de entidades.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    List<T> findAll() throws SQLException;

    /**
     * Busca una entidad por su ID.
     *
     * @param id El ID de la entidad.
     * @return La entidad encontrada o null si no existe.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    T byId(int id) throws SQLException;

    /**
     * Guarda una entidad en la base de datos.
     *
     * @param t La entidad a guardar.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    void save(T t) throws SQLException;

    /**
     * Elimina una entidad por su ID.
     *
     * @param id El ID de la entidad a eliminar.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    void delete(int id) throws SQLException;
}
