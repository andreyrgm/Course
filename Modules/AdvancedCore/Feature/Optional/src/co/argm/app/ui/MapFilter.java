package co.argm.app.ui;

import co.argm.app.model.Computer;
import co.argm.app.model.Maker;
import co.argm.app.model.Processor;
import co.argm.app.model.repo.Repo;
import co.argm.app.model.repo.RepoPC;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el uso de map y filter en Optional.
 */
public class MapFilter {
    public static void main(String[] args) {
        Repo<Computer> repo = new RepoPC();
        String result = repo.filter("asus")
                .flatMap(Computer::getProcessor)
                .flatMap(Processor::getMaker)
                .filter(maker -> "intel".equalsIgnoreCase(maker.name()))
                .map(Maker::name)
                .orElse("unknown");

        out.println(result);
    }
}
