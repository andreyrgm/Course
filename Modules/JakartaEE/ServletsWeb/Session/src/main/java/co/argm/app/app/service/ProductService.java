package co.argm.app.app.service;

import co.argm.app.app.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Servicio que maneja la gestión de productos.
 */
public class ProductService {

    /**
     * Devuelve una lista de productos predefinidos.
     *
     * @return lista de productos
     */
    public List<Product> list() {
        return Arrays.asList(
                new Product(1, "Laptop", "Electronics", 999.99),
                new Product(2, "Smartphone", "Electronics", 599.99),
                new Product(3, "Table", "Furniture", 149.99),
                new Product(4, "Chair", "Furniture", 89.99),
                new Product(5, "Watch", "Accessories", 199.99)
        );
    }

    /**
     * Busca un producto por su ID.
     *
     * @param id el ID del producto a buscar
     * @return un Optional con el producto si se encuentra
     */
    public Optional<Product> byId(int id) {
        return list().stream().filter(p -> p.id().equals(id)).findAny();
    }
}
