package co.argm.app.model;

import java.util.Optional;

/**
 * Clase que representa una computadora.
 */
public class Computer {
    private final String name;
    private final String model;
    private Processor processor;

    public Computer(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public Computer(String name, String model, Processor processor) {
        this.name = name;
        this.model = model;
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public Optional<Processor> getProcessor() {
        return Optional.ofNullable(processor);
    }

    @Override
    public String toString() {
        return name + ", " + model;
    }
}
