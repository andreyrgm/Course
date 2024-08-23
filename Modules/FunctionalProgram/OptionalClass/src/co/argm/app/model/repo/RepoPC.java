package co.argm.app.model.repo;

import co.argm.app.model.Computer;
import co.argm.app.model.Maker;
import co.argm.app.model.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementación de un repositorio de computadoras.
 */
public class RepoPC implements Repo<Computer> {
    private final List<Computer> dataSource;

    public RepoPC() {
        dataSource = new ArrayList<>();
        dataSource.add(new Computer("Asus ROG", "Strix G512", new Processor(new Maker("Intel"))));
        dataSource.add(new Computer("MacBook Pro", "MVVM2CI"));
    }

    @Override
    public Optional<Computer> filter(String name) {
        return dataSource.stream()
                .filter(computer -> computer.getName().toLowerCase().contains(name.toLowerCase()))
                .findFirst();
    }
}
