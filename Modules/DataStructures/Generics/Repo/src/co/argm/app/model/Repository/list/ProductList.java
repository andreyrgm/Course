package co.argm.app.model.Repository.list;

import co.argm.app.model.Product;
import co.argm.app.model.Repository.AbstractList;
import co.argm.app.model.Repository.Direction;

import java.util.ArrayList;
import java.util.List;

import static co.argm.app.model.Repository.Direction.ASC;

/**
 * Clase que implementa la lista de productos con funcionalidades de ordenamiento y actualización.
 */
public class ProductList extends AbstractList<Product> {
    private int sort(String field, Product a, Product b) {
        return switch (field) {
            case "id" -> a.getId().compareTo(b.getId());
            case "description" -> a.getDescription().compareTo(b.getDescription());
            case "price" -> a.getPrice().compareTo(b.getPrice());
            default -> 0;
        };
    }

    @Override
    public void update(Product product) {
        Product p = get(product.getId());
        p.setDescription(product.getDescription());
        p.setPrice(product.getPrice());
    }

    @Override
    public List<Product> list(String field, Direction dir) {
        List<Product> sortedList = new ArrayList<>(dataSource);
        sortedList.sort((a, b) -> {
            int result = sort(field, a, b);
            return dir == ASC ? result : -result;
        });
        return sortedList;
    }
}
