package co.argm.app.model.repository.list;

import co.argm.app.model.Product;
import co.argm.app.model.exceptions.ReadException;
import co.argm.app.model.repository.AbstractList;
import co.argm.app.model.repository.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de AbstractList para manejar una lista de productos.
 */
public class ProductList extends AbstractList<Product> {

    /**
     * Ordena dos productos según el campo especificado.
     *
     * @param field Campo por el cual ordenar.
     * @param a     Primer producto.
     * @param b     Segundo producto.
     * @return Resultado de la comparación.
     */
    private int sort(String field, Product a, Product b) {
        return switch (field) {
            case "id" -> a.getId().compareTo(b.getId());
            case "description" -> a.getDescription().compareTo(b.getDescription());
            case "price" -> a.getPrice().compareTo(b.getPrice());
            default -> 0;
        };
    }

    @Override
    public void update(Product product) throws ReadException {
        Product p = get(product.getId());
        p.setDescription(product.getDescription());
        p.setPrice(product.getPrice());
    }

    @Override
    public List<Product> list(String field, Direction dir) {
        List<Product> sortedList = new ArrayList<>(dataSource);
        sortedList.sort((a, b) -> {
            int result = sort(field, a, b);
            return dir == Direction.ASC ? result : -result;
        });
        return sortedList;
    }
}
