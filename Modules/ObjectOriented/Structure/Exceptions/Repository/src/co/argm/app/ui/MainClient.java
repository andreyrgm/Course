package co.argm.app.ui;

import co.argm.app.model.Client;
import co.argm.app.model.exceptions.DataAccessException;
import co.argm.app.model.exceptions.DuplicateRecordException;
import co.argm.app.model.exceptions.ReadException;
import co.argm.app.model.exceptions.WritingException;
import co.argm.app.model.repository.Full;
import co.argm.app.model.repository.list.ClientList;

import static co.argm.app.model.repository.Direction.ASC;
import static co.argm.app.model.repository.Direction.DESC;
import static java.lang.System.err;
import static java.lang.System.out;

/**
 * Clase principal para manejar clientes.
 */
public class MainClient {
    public static void main(String[] args) {
        try {
            Full<Client> repo = new ClientList();
            repo.create(new Client("Jano", "Perez"));
            repo.create(new Client("Bea", "Gonzales"));
            repo.create(new Client("Luci", "Martinez"));
            repo.create(new Client("Andrew", "Gomez"));

            repo.list().forEach(out::println);

            out.println("\n===== Pageable =====");
            repo.list(1, 4).forEach(out::println);

            out.println("\n===== Sort =====");
            repo.list("name", DESC).forEach(out::println);

            out.println("\n===== Edit =====");
            repo.update(new Client("Bea", "Mena").setId(2));
            out.println(repo.get(2));
            repo.list("surname", ASC).forEach(out::println);

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
