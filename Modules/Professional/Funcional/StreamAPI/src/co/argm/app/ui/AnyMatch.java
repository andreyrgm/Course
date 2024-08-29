package co.argm.app.ui;

import co.argm.app.model.User;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.anyMatch para determinar si algún usuario tiene un ID igual a 1.
 */
public class AnyMatch {
    public static void main(String[] args) {
        boolean exist = of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(out::println)
                .anyMatch(u -> u.getId().equals(1));
        out.println("¿Existe un usuario con ID 1? " + exist);
    }
}
