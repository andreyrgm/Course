package co.argm.app.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

import static java.lang.System.out;
import static java.util.concurrent.Executors.newScheduledThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

/**
 * Clase principal que demuestra el uso de ScheduledExecutorService con CountDownLatch.
 */
public class Methods2 {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService executor = newScheduledThreadPool(2);

        out.println("Alguna tarea en el hilo principal...");

        CountDownLatch latch = new CountDownLatch(5);
        Future<?> future = executor.scheduleAtFixedRate(() -> {
            out.println("Tarea de Hola Mundo...");
            try {
                MILLISECONDS.sleep(1000);
                latch.countDown();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 1000, 2000, MILLISECONDS);

        latch.await();
        future.cancel(true);
        out.println("Otra tarea en el hilo principal...");
        executor.shutdown();
    }
}
