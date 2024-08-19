package co.argm.app.synced.model.runnable;

import co.argm.app.synced.model.Bakery;

import static java.lang.Thread.sleep;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Clase Baker que implementa Runnable, simula la tarea de hornear panes en la panadería.
 */
public class Baker implements Runnable {
    private final Bakery bakery;

    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            bakery.bake("Pan no: " + i);
            try {
                sleep(current().nextInt(500, 2000)); // Simula el tiempo de horneado.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
