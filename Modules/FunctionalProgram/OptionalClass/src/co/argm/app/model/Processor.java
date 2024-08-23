package co.argm.app.model;

import java.util.Optional;

/**
 * Clase que representa un procesador de computadora.
 */
public class Processor {
    private final Maker maker;

    public Processor(Maker maker) {
        this.maker = maker;
    }

    public Optional<Maker> getMaker() {
        return Optional.ofNullable(maker);
    }
}
