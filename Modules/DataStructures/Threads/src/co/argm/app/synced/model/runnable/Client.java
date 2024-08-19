package co.argm.app.synced.model.runnable;

import co.argm.app.synced.model.Bakery;

/**
 * Clase Client que implementa Runnable, simula la tarea de consumir panes de la panadería.
 */
public class Client implements Runnable {
    private final Bakery bakery;

    public Client(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bakery.consume();
        }
    }
}
