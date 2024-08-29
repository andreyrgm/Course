package co.argm.app.model.service;

import co.argm.app.model.Category;
import co.argm.app.model.Product;

import java.sql.SQLException;
import java.util.List;

/**
 * Interfaz que define los métodos para la gestión de productos y categorías.
 */
public interface Service {

    /**
     * Recupera todos los productos.
     *
     * @return Lista de productos.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    List<Product> findAll() throws SQLException;

    /**
     * Busca un producto por su ID.
     *
     * @param id El ID del producto.
     * @return El producto encontrado o null si no existe.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    Product byId(int id) throws SQLException;

    /**
     * Guarda un producto.
     *
     * @param product El producto a guardar.
     * @return El producto guardado.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    Product save(Product product) throws SQLException;

    /**
     * Guarda una categoría.
     *
     * @param category La categoría a guardar.
     * @return La categoría guardada.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    Category save(Category category) throws SQLException;

    /**
     * Elimina un producto por su ID.
     *
     * @param id El ID del producto a eliminar.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    void delete(int id) throws SQLException;
}
