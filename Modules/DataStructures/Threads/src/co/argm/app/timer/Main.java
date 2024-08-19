package co.argm.app.timer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

import static java.awt.Toolkit.*;
import static java.lang.System.out;

/**
 * Clase principal que utiliza un Timer para programar tareas periódicas con un conteo regresivo.
 */
public class Main {
    public static void main(String[] args) {
        // Obtiene la instancia del toolkit del sistema para realizar acciones como el sonido "beep".
        Toolkit tk = getDefaultToolkit();

        // Contador atómico para controlar el número de ejecuciones restantes.
        AtomicInteger counter = new AtomicInteger(3);

        // Crea un nuevo timer para programar tareas.
        Timer timer = new Timer();

        // Programa una tarea que se ejecutará inmediatamente y luego cada 10 segundos.
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (counter.getAndDecrement() > 0) {
                    // Emite un sonido de beep y muestra información de la tarea periódica.
                    tk.beep();
                    out.println("Tarea periódica " + counter + " en: " + new Date() +
                            " Nombre del hilo: " + Thread.currentThread().getName());
                } else {
                    // Finaliza la ejecución del timer cuando el contador llega a cero.
                    out.println("El tiempo ha terminado");
                    timer.cancel();
                }
            }
        }, 0, 10000);

        // Mensaje indicando que la tarea ha sido programada.
        out.println("Se programa una tarea inmediata que se repite cada 10 segundos...");
    }
}
