package co.argm.app.creation.ui;

import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * Clase principal que demuestra el uso de la interfaz Runnable.
 */
public class InterfaceRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = currentThread();

        Runnable trip = () -> {
            for (int i = 0; i < 10; i++) {
                out.println(i + " - " + currentThread().getName());
                try {
                    sleep((long) (random() * 1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            out.println("Finalmente, voy de viaje a: " + currentThread().getName());
            out.println("Estado del hilo principal: " + mainThread.getState());
        };

        Thread v1 = new Thread(trip, "Isla de Pascua");
        Thread v2 = new Thread(trip, "Robinson Crusoe");
        Thread v3 = new Thread(trip, "Juan Fernández");
        Thread v4 = new Thread(trip, "Isla de Chiloé");

        v1.start();
        v2.start();
        v3.start();
        v4.start();

        v1.join();
        v2.join();
        v3.join();
        v4.join();

        out.println("Continuando con la ejecución del método main: " + mainThread.getName());
    }
}
