package co.argm.app.ui;

import co.argm.app.model.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de los consumidores y proveedores en expresiones lambda.
 */
public class Consume {
    public static void main(String[] args) {
        // Ejemplo de Consumer que formatea y muestra la fecha actual.
        Consumer<Date> consumer = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            out.println(f.format(date));
        };
        consumer.accept(new Date());

        User user = getUser();
        out.println("User name: " + user.getName());

        // Ejemplo de Supplier que proporciona una cadena de texto.
        Supplier<String> provider = () -> "Hello world lambda supplier";
        out.println(provider.get());
    }

    /**
     * Crea y devuelve un objeto {@link User} configurado mediante expresiones lambda.
     *
     * @return el usuario creado
     */
    private static User getUser() {
        // Ejemplo de BiConsumer que muestra un nombre y una edad.
        BiConsumer<String, Integer> biConsumer = (name, age) -> out.println(name + ", is " + age + " years old!");
        biConsumer.accept("Pepe", 20);

        // Consumer que muestra una cadena de texto.
        Consumer<String> consumer2 = out::println;
        consumer2.accept("Hello world lambda");

        // Muestra una lista de nombres utilizando un Consumer.
        List<String> names = Arrays.asList("Pepe", "Andrew", "Luz", "Paco");
        names.forEach(consumer2);

        // Supplier que crea un nuevo objeto User.
        Supplier<User> createUser = User::new;
        User user = createUser.get();

        // BiConsumer que asigna un nombre a un usuario.
        BiConsumer<User, String> assignName = User::setName;
        assignName.accept(user, "Andrew");
        return user;
    }
}
