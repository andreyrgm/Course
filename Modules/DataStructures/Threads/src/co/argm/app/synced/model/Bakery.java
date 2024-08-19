package co.argm.app.synced.model;

import static java.lang.System.out;

/**
 * Clase Bakery que simula una panadería donde se hornean y se consumen panes.
 */
public class Bakery {
    private String bread;
    private boolean available;

    /**
     * Método sincronizado que simula el proceso de hornear un pan.
     *
     * @param dough El nombre o descripción del pan que se está horneando.
     */
    public synchronized void bake(String dough) {
        while (available) {
            try {
                wait(); // Espera a que el pan actual sea consumido antes de hornear otro.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        bread = dough;
        out.println("Baker hornea: " + bread);
        available = true;
        notifyAll(); // Notifica a los clientes que el pan está listo.
    }

    /**
     * Método sincronizado que simula el proceso de consumir un pan.
     */
    public synchronized void consume() {
        while (!available) {
            try {
                wait(); // Espera a que haya un pan disponible para consumir.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        out.println("Cliente consume: " + bread);
        available = false;
        notifyAll(); // Notifica a los panaderos que el pan ha sido consumido.
    }
}
