package co.argm.app.synced.ui;

import co.argm.app.synced.model.Bakery;

import static java.lang.Thread.sleep;
import static java.util.concurrent.ThreadLocalRandom.current;

/**
 * Clase principal que ejecuta el flujo de trabajo de hornear y consumir panes en la panadería.
 */
public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bakery.bake("Pan no°: " + i);
                try {
                    sleep(current().nextInt(500, 2000)); // Simula el tiempo de horneado.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                bakery.consume();
            }
        }).start();
    }
}
