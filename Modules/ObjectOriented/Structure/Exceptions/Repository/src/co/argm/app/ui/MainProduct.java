package co.argm.app.ui;

import co.argm.app.model.Product;
import co.argm.app.model.exceptions.DataAccessException;
import co.argm.app.model.exceptions.DuplicateRecordException;
import co.argm.app.model.exceptions.ReadException;
import co.argm.app.model.exceptions.WritingException;
import co.argm.app.model.repository.Full;
import co.argm.app.model.repository.list.ProductList;

import static co.argm.app.model.repository.Direction.ASC;
import static co.argm.app.model.repository.Direction.DESC;
import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Clase principal para manejar productos.
 */
public class MainProduct {
    public static void main(String[] args) {
        try {
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
            repo.update(lamp.setId2(3));
            out.println(repo.get(3));
            repo.list("description", ASC).forEach(out::println);

            out.println("\n===== Delete =====");
            repo.delete(2);
            repo.list().forEach(out::println);

            out.println("\n===== Total =====");
            out.println("Total records: " + repo.total());
        } catch (DuplicateRecordException e) {
            err.println("DuplicateRecord: " + e.getMessage());
            e.printStackTrace(err);
        } catch (ReadException e) {
            err.println("Read: " + e.getMessage());
            e.printStackTrace(err);
        } catch (WritingException e) {
            err.println("Writing: " + e.getMessage());
            e.printStackTrace(err);
        } catch (DataAccessException e) {
            err.println("Generic: " + e.getMessage());
            e.printStackTrace(err);
        }
    }
}
