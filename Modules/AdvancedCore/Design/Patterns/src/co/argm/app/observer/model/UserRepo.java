package co.argm.app.observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un repositorio de usuarios. Notifica a los observadores cuando se crea un nuevo usuario.
 */
public class UserRepo extends Observable {
    private final List<String> repo = new ArrayList<>();

    /**
     * Crea un nuevo usuario y notifica a los observadores.
     *
     * @param user Nombre del usuario a agregar.
     */
    public void create(String user) {
        repo.add(user);
        notifyObservers(user);
    }
}
