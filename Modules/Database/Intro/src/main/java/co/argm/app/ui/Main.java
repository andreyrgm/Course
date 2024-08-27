package co.argm.app.ui;

import co.argm.app.model.Category;
import co.argm.app.model.Product;
import co.argm.app.model.repo.ProductRepo;
import co.argm.app.model.repo.Repo;

import java.util.Date;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Repo<Product> repo = new ProductRepo();
        out.println("=== findAll ===");
        repo.findAll().forEach(out::println);

        out.println("\n=== byId ===");
        out.println(repo.byId(2));

        out.println("\n=== create ===");
        repo.save(new Product("Mechanical keyboard", 550, new Date(), new Category(3)));
        out.println("Product saved successfully");
        repo.findAll().forEach(out::println);

        out.println("\n=== modify ===");
        repo.save(new Product(3, "Razer mechanical keyboard", 700, new Category(2)));
        out.println("Successfully edited product");
        repo.findAll().forEach(out::println);

        out.println("\n=== delete ===");
        repo.delete(3);
        out.println("Product deleted successfully");
        repo.findAll().forEach(out::println);
    }
}
