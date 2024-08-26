package co.argm.app.ui;

import co.argm.app.model.Computer;
import co.argm.app.model.repo.Repo;
import co.argm.app.model.repo.RepoPC;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el uso del repositorio para buscar computadoras.
 */
public class Repository {
    public static void main(String[] args) {
        Repo<Computer> repo = new RepoPC();

        repo.filter("rog")
                .ifPresentOrElse(out::println, () -> out.println("Not found"));
    }
}
