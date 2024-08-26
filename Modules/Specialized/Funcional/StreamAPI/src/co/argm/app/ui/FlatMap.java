package co.argm.app.ui;

import co.argm.app.model.Bill;
import co.argm.app.model.User;

import java.util.List;

import static java.lang.System.out;
import static java.util.Arrays.asList;

/**
 * Clase que demuestra el uso de Stream.flatMap para transformar y procesar facturas de usuarios.
 */
public class FlatMap {
    public static void main(String[] args) {
        User u1 = new User("John", "Doe");
        u1.addBill(new Bill("Technology purchases"))
                .addBill(new Bill("Furniture shopping"));

        User u2 = new User("Pepe", "Perez");
        u2.addBill(new Bill("Bike"))
                .addBill(new Bill("Notebook gamer"));

        List<User> users = asList(u1, u2);

        users.stream()
                .flatMap(u -> u.getBills().stream())
                .forEach(f -> out.println(f.getDescription().concat(" :  client ").concat(f.getUser().toString())));
    }
}
