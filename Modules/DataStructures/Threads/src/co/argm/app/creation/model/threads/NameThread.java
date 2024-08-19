package co.argm.app.creation.model.threads;

import static java.lang.System.out;

/**
 * Clase que extiende Thread para mostrar el nombre de un hilo.
 */
public class NameThread extends Thread {

    public NameThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        out.println("El método run del hilo " + getName() + " ha comenzado.");

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            out.println(getName());
        }
        out.println("Fin del hilo " + getName());
    }
}
