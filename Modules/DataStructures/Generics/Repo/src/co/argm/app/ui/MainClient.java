package co.argm.app.ui;

import co.argm.app.model.Client;
import co.argm.app.model.Repository.Full;
import co.argm.app.model.Repository.list.ClientList;

import static co.argm.app.model.Repository.Direction.ASC;
import static co.argm.app.model.Repository.Direction.DESC;
import static java.lang.System.out;

/**
 * Clase principal para ejecutar la gestión de clientes.
 */
public class MainClient {
    public static void main(String[] args) {
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
        Client bea = new Client("Bea", "Mena");
        repo.update(bea);
        bea.setId(2);
        out.println(repo.get(2));
        repo.list("surname", ASC).forEach(out::println);

        out.println("\n===== Delete =====");
        repo.delete(2);
        repo.list().forEach(out::println);

        out.println("\n===== Total =====");
        out.println("Total records: " + repo.total());
    }
}
