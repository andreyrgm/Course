package co.argm.app.ui;

import co.argm.app.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Stream.empty;
import static java.util.stream.Stream.of;

/**
 * Clase que convierte una lista de usuarios a un Stream, filtra por nombres específicos y cuenta los resultados.
 */
public class ListToStream {
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

        Stream<String> names = users.stream()
                .map(user -> user.getName().toUpperCase().concat(" ".concat(user.getSurname())))
                .flatMap(name -> {
                    if (name.contains("BRUCE")) {
                        return of(name);
                    }
                    return empty();
                })
                .map(String::toLowerCase)
                .peek(out::println);

        out.println("Total: " + names.count());
    }
}
