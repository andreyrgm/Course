package co.argm.app.service;

import co.argm.app.model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductService {
    public List<Product> listAll() {
        return Arrays.asList(
                new Product(1, "Notebook", "Computing", 175000),
                new Product(2, "Desk", "Office", 100000),
                new Product(3, "Mechanical Keyboard", "Computing", 40000)
        );
    }

    public Optional<Product> byId(Integer id) {
        return listAll().stream().filter(p -> p.id().equals(id)).findAny();
    }
}
