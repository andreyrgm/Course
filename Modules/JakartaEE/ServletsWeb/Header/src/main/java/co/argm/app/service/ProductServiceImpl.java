package co.argm.app.service;

import co.argm.app.Product;

import java.util.Arrays;
import java.util.List;

/**
 * Implementación de la interfaz ProductService para gestionar los productos.
 */
public class ProductServiceImpl implements ProductService {

    /**
     * Lista de productos simulada que devuelve productos predefinidos.
     *
     * @return una lista de productos
     */
    @Override
    public List<Product> list() {
        return Arrays.asList(
                new Product(1, "Laptop", "Electronics", 999.99),
                new Product(2, "Smartphone", "Electronics", 599.99),
                new Product(3, "Table", "Furniture", 149.99),
                new Product(4, "Chair", "Furniture", 89.99),
                new Product(5, "Watch", "Accessories", 199.99)
        );
    }
}
