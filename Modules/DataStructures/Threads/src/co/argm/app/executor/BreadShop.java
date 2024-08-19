package co.argm.app.executor;

import co.argm.app.synced.model.Bakery;
import co.argm.app.synced.model.runnable.Baker;
import co.argm.app.synced.model.runnable.Client;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.System.out;
import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * Clase principal para simular una panadería utilizando un ThreadPoolExecutor.
 */
public class BreadShop {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) newFixedThreadPool(3);

        out.println("Pool size: " + executor.getPoolSize());
        out.println("Number of tasks in queue: " + executor.getQueue().size());

        Bakery bakery = new Bakery();
        Runnable producer = new Baker(bakery);
        Runnable client = new Client(bakery);

        Future<?> future = executor.submit(producer);
        Future<?> future2 = executor.submit(client);

        out.println("Pool size: " + executor.getPoolSize());
        out.println("Number of tasks in queue: " + executor.getQueue().size());

        executor.shutdown();
        out.println("Continuando con la ejecución del método main");
    }
}
