package co.argm.app.ui;

import co.argm.app.model.User;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;
import static java.util.concurrent.TimeUnit.SECONDS;
import static java.util.stream.Stream.empty;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream paralelo para procesar una lista de usuarios y filtrar por nombre.
 */
public class Parallel {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Andrew", "Gomez"));
        users.add(new User("Luci", "Martinez"));
        users.add(new User("Pepe", "Fernandez"));
        users.add(new User("Cata", "Perez"));
        users.add(new User("Lala", "Mena"));
        users.add(new User("Bruce", "Lee"));
        users.add(new User("Bruce", "Willis"));
        users.add(new User("Dominic", "Doe"));

        long t1 = currentTimeMillis();
        String result = users.stream()
                .parallel()
                .map(user -> user.toString().toUpperCase())
                .peek(n -> {
                    out.println("Nombre del Thread: " + Thread.currentThread().getName() + " - " + n);
                })
                .flatMap(name -> {
                    try {
                        SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (name.contains("BRUCE")) {
                        return of(name);
                    }
                    return empty();
                })
                .findAny()
                .orElse("");

        out.println("Tiempo transcurrido: " + (currentTimeMillis() - t1) + "ms\nResultado: " + result);
    }
}
