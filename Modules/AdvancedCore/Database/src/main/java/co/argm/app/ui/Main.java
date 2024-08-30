package co.argm.app.ui;

import co.argm.app.model.Category;
import co.argm.app.model.Product;
import co.argm.app.model.service.Service;
import co.argm.app.model.service.ServiceCatalog;

import java.sql.SQLException;
import java.util.Date;

import static java.lang.System.out;

/**
 * Clase principal que contiene el punto de entrada de la aplicación.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Service service = new ServiceCatalog();

        out.println("=== Find all ===");
        service.findAll().forEach(out::println);

        out.println("\n=== Insert new category ===");
        Category category = service.save(new Category("Lightning"));
        out.println("Category saved successfully: " + category.getId());

        out.println("\n=== Get by id ===");
        out.println(service.byId(2));

        out.println("\n=== Insert new product ===");
        Product product = service.save(new Product("LED desk lamp", 900, new Date(), category,
                "a3b2c1d5e6"));
        out.println("Product saved successfully: " + product.getId());
        service.findAll().forEach(out::println);

        out.println("\n=== Modify ===");
        service.save(new Product(7, "LED office lamp", 700, category));
        out.println("Successfully edited product");
        service.findAll().forEach(out::println);

        out.println("\n=== Delete ===");
        service.delete(8);
        out.println("Product deleted successfully");
        service.findAll().forEach(out::println);
    }
}
