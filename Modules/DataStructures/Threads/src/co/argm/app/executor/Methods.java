package co.argm.app.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.System.out;
import static java.lang.Thread.currentThread;
import static java.util.concurrent.Executors.newFixedThreadPool;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Clase principal que demuestra el uso de Callable y Future en un ThreadPoolExecutor.
 */
public class Methods {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) newFixedThreadPool(3);

        out.println("Pool size: " + executor.getPoolSize());
        out.println("Number of tasks in queue: " + executor.getQueue().size());

        Callable<String> task = Methods::call;

        Callable<Integer> task2 = () -> {
            out.println("Inicio de la tarea 3...");
            SECONDS.sleep(3);
            return 10;
        };

        Future<String> result = executor.submit(task);
        Future<String> result2 = executor.submit(task);
        Future<Integer> result3 = executor.submit(task2);

        out.println("Pool size: " + executor.getPoolSize());
        out.println("Number of tasks in queue: " + executor.getQueue().size());

        executor.shutdown();
        out.println("Continuando con la ejecución del método main");

        while (!(result.isDone() && result2.isDone() && result3.isDone())) {
            out.printf("result1: %s - result2: %s - result3: %s%n",
                    result.isDone() ? "finalizado" : "en proceso",
                    result2.isDone() ? "finalizado" : "en proceso",
                    result3.isDone() ? "finalizado" : "en proceso");
            MILLISECONDS.sleep(1000);
        }

        out.printf("Resultado de la tarea 1: %s\nFinalizó: %s%n", result.get(), result.isDone());
        out.printf("Resultado de la tarea 2: %s\nFinalizó: %s%n", result2.get(), result2.isDone());
        out.printf("Resultado de la tarea 3: %s\nFinalizó: %s%n", result3.get(), result3.isDone());
    }

    /**
     * Método que simula una tarea que toma tiempo en ejecutarse.
     *
     * @return Resultado de la tarea.
     */
    private static String call() {
        out.println("Inicio de la tarea...");
        try {
            out.println("Nombre del hilo: " + currentThread().getName());
            SECONDS.sleep(3);
        } catch (InterruptedException e) {
            currentThread().interrupt();
            e.printStackTrace();
        }
        out.println("Fin de la tarea...");
        return "Resultado importante de la tarea";
    }
}
