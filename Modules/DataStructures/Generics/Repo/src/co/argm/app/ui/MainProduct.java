package co.argm.app.ui;

import co.argm.app.model.Product;
import co.argm.app.model.Repository.Full;
import co.argm.app.model.Repository.list.ProductList;

import static co.argm.app.model.Repository.Direction.ASC;
import static co.argm.app.model.Repository.Direction.DESC;
import static java.lang.System.out;

/**
 * Clase principal para ejecutar la gestión de productos.
 */
public class MainProduct {
    public static void main(String[] args) {
        Full<Product> repo = new ProductList();
        repo.create(new Product("Table", 50.52));
        repo.create(new Product("Chair", 18));
        repo.create(new Product("Lamp", 15.5));
        repo.create(new Product("Notebook", 400.89));

        repo.list().forEach(out::println);

        out.println("\n===== Pageable =====");
        repo.list(1, 4).forEach(out::println);

        out.println("\n===== Sort =====");
        repo.list("price", DESC).forEach(out::println);

        out.println("\n===== Edit =====");
        Product lamp = new Product("Desk Lamp", 23);
        repo.update(lamp);
        lamp.setId(3);
        out.println(repo.get(3));
        repo.list("description", ASC).forEach(out::println);

        out.println("\n===== Delete =====");
        repo.delete(2);
        repo.list().forEach(out::println);

        out.println("\n===== Total =====");
        out.println("Total records: " + repo.total());
    }
}
