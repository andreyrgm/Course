package co.argm.app.decorator.example.model.decorator;

import co.argm.app.decorator.example.model.Configurable;

/**
 * Clase abstracta que actúa como base para todos los decoradores. Implementa la interfaz Configurable y delega las
 * llamadas a un objeto Configurable encapsulado.
 */
public abstract class Abstract implements Configurable {
    protected Configurable coffee;

    protected Abstract(Configurable coffee) {
        this.coffee = coffee;
    }
}
