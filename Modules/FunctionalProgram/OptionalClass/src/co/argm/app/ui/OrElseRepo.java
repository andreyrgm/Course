package co.argm.app.ui;

import co.argm.app.model.Computer;
import co.argm.app.model.repo.Repo;
import co.argm.app.model.repo.RepoPC;

import java.util.Optional;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el uso de orElse y orElseThrow en Optional.
 */
public class OrElseRepo {
    public static void main(String[] args) {
        Repo<Computer> repo = new RepoPC();

        Computer computer = repo.filter("rog").orElseThrow(IllegalStateException::new);
        out.println(computer);

        String file = "document.pdf";
        String extension = Optional.of(file)
                .filter(s -> s.contains("."))
                .map(s -> s.substring(file.lastIndexOf(".") + 1))
                .orElseThrow();

        out.println(extension);
    }
}
