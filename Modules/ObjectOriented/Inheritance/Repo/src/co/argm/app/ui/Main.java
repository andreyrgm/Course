package co.argm.app.ui;

import co.argm.app.model.Client;
import co.argm.app.model.Repository.*;

import static co.argm.app.model.Repository.Direction.ASC;
import static co.argm.app.model.Repository.Direction.DESC;
import static java.lang.System.out;

/**
 * Clase principal que ejecuta el programa y muestra la información de los clientes utilizando el repositorio.
 */
public class Main {
    public static void main(String[] args) {
        Full repo = new ClientList()
                .create(new Client("Jano", "Perez"))
                .create(new Client("Bea", "Gonzales"))
                .create(new Client("Luci", "Martinez"))
                .create(new Client("Andrew", "Gomez"));

        // Listar todos los clientes
        repo.list().forEach(out::println);

        // Listado paginado
        out.println("\n===== Pageable =====");
        repo.list(1, 4).forEach(out::println);

        // Listado ordenado
        out.println("\n===== Sort =====");
        repo.list("name", DESC).forEach(out::println);

        // Actualizar un cliente existente
        out.println("\n===== Edit =====");
        repo.update(new Client("Bea", "Mena").setId(2));
        out.println(repo.get(2));
        repo.list("surname", ASC).forEach(out::println);

        // Eliminar un cliente
        out.println("\n===== Delete =====");
        repo.delete(2);
        repo.list().forEach(out::println);

        // Total de clientes
        out.println("\n===== Total =====");
        out.println("Total records: " + repo.total());
    }
}
