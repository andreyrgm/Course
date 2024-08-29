package co.argm.app.observer.ui;

import co.argm.app.observer.model.Corporation;

import static java.lang.System.out;

/**
 * Clase principal para demostrar el patrón Observer con una corporación.
 */
public class MainCorp {
    public static void main(String[] args) {
        Corporation google = new Corporation("Google", 1000);

        google.addObserver((o, obj) -> out.println("John: " + o))
                .addObserver((o, obj) -> out.println("Andrew: " + o))
                .addObserver((o, obj) -> out.println("Maria: " + o));

        google.modifyPrice(2000);
    }
}
