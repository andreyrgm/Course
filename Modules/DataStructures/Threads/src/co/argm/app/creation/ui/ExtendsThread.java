package co.argm.app.creation.ui;

import co.argm.app.creation.model.threads.NameThread;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el uso de hilos extendiendo la clase Thread.
 */
public class ExtendsThread {
    public static void main(String[] args) {
        Thread thread1 = new NameThread("John Doe");
        Thread thread2 = new NameThread("Maria");
        Thread thread3 = new NameThread("Pepe");

        thread1.start();
        thread2.start();
        thread3.start();

        out.println("Estado del hilo John Doe: " + thread1.getState());
    }
}
