package co.argm.app.service;

import co.argm.app.Product;

import java.util.List;

/**
 * Interfaz para definir las operaciones relacionadas con la gestión de productos.
 */
public interface ProductService {
    /**
     * Devuelve una lista de productos.
     *
     * @return una lista de objetos Product
     */
    List<Product> list();
}
