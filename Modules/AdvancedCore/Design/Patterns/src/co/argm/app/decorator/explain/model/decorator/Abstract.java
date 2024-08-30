package co.argm.app.decorator.explain.model.decorator;

import co.argm.app.decorator.explain.model.Formattable;

/**
 * Clase abstracta que actúa como base para todos los decoradores. Implementa la interfaz Formattable y delega la
 * llamada al método format() a un objeto Formattable encapsulado.
 */
public abstract class Abstract implements Formattable {
    protected Formattable text;

    protected Abstract(Formattable text) {
        this.text = text;
    }
}
