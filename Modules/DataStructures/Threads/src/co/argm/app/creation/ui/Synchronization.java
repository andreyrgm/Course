package co.argm.app.creation.ui;

import co.argm.app.creation.model.runnable.PrintPhrases;

import static java.lang.System.out;
import static java.lang.Thread.sleep;

/**
 * Clase principal que demuestra la sincronización de hilos.
 */
public class Synchronization {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintPhrases("Hola ", "¿cómo están?")).start();
        new Thread(new PrintPhrases("¿Quién eres ", "tú?")).start();
        sleep(100);

        Thread h3 = new Thread(new PrintPhrases("¡Gracias ", "mucho amigo!"));
        h3.start();
        sleep(100);

        out.println("Estado del hilo h3: " + h3.getState());
    }

    /**
     * Método sincronizado que imprime dos frases con una pausa entre ellas.
     *
     * @param phrase1 Primera frase.
     * @param phrase2 Segunda frase.
     */
    public static synchronized void printPhrases(String phrase1, String phrase2) {
        out.print(phrase1);
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        out.println(phrase2);
    }
}
