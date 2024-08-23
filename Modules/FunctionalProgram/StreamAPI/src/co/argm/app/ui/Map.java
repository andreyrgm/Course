package co.argm.app.ui;

import co.argm.app.model.User;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra el uso de Stream.map para transformar cadenas en objetos Usuario y luego los imprime.
 */
public class Map {
    public static void main(String[] args) {
        Stream<User> users = of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(out::println);

        List<User> list = users.toList();
        list.forEach(out::println);
    }
}
