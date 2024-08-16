package co.argm.app.model.Repository;

import co.argm.app.model.Client;

import java.util.List;

/**
 * Interfaz que define el contrato para operaciones CRUD (Crear, Leer, Actualizar, Eliminar).
 */
public interface Crud {
    List<Client> list();

    Client get(int id);

    ClientList create(Client client);

    void update(Client client);

    void delete(int id);
}
