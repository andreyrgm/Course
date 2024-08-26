package co.argm.app.observer.ui;

import co.argm.app.observer.model.UserRepo;

import static java.lang.System.out;

/**
 * Clase principal para demostrar el patrón Observer con un repositorio de usuarios.
 */
public class MainUser {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();

        repo.addObserver((o, u) -> out.println("Sending an email to the user " + u))
                .addObserver((o, u) -> out.println("Sending an email to the admin " + u))
                .addObserver((o, u) -> out.println("Saving user information " + u + " in the logs"));

        repo.create("Andrew");
    }
}
