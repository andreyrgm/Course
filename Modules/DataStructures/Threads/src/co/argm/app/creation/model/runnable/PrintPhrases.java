package co.argm.app.creation.model.runnable;

import static co.argm.app.creation.ui.Synchronization.printPhrases;

/**
 * Clase que implementa Runnable para imprimir dos frases en un hilo separado.
 */
public class PrintPhrases implements Runnable {
    private final String phrase1;
    private final String phrase2;

    public PrintPhrases(String phrase1, String phrase2) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    @Override
    public void run() {
        printPhrases(phrase1, phrase2);
    }
}
