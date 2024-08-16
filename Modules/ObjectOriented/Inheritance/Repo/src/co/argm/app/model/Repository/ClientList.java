package co.argm.app.model.Repository;

import co.argm.app.model.Client;

import java.util.ArrayList;
import java.util.List;

import static co.argm.app.model.Repository.Direction.ASC;

/**
 * Implementación del repositorio para manejar una lista de clientes.
 * Ofrece operaciones CRUD, paginación y ordenamiento.
 */
public class ClientList implements Full {
    private final List<Client> dataSource;

    public ClientList() {
        this.dataSource = new ArrayList<>();
    }

    /**
     * Método para ordenar los clientes basándonos en el campo especificado.
     *
     * @param field el campo por el cual se ordenará (id, name, surname).
     * @param a     primer cliente a comparar.
     * @param b     segundo cliente a comparar.
     * @return un valor negativo, cero o positivo según el resultado de la comparación.
     */
    private int sort(String field, Client a, Client b) {
        return switch (field) {
            case "id" -> a.getId().compareTo(b.getId());
            case "name" -> a.getName().compareTo(b.getName());
            case "surname" -> a.getSurname().compareTo(b.getSurname());
            default -> 0;
        };
    }

    @Override
    public Client get(int id) {
        for (Client client : dataSource) {
            if (client.getId() != null && client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    @Override
    public ClientList create(Client client) {
        dataSource.add(client);
        return this;
    }

    @Override
    public void update(Client client) {
        Client existingClient = get(client.getId());
        if (existingClient != null) {
            existingClient.setName(client.getName()).setSurname(client.getSurname());
        }
    }

    @Override
    public void delete(int id) {
        Client clientToRemove = get(id);
        if (clientToRemove != null) {
            dataSource.remove(clientToRemove);
        }
    }

    @Override
    public List<Client> list() {
        return new ArrayList<>(dataSource);
    }

    @Override
    public List<Client> list(String field, Direction dir) {
        List<Client> sortedList = new ArrayList<>(dataSource);
        sortedList.sort((a, b) -> {
            int result = sort(field, a, b);
            return dir == ASC ? result : -result;
        });
        return sortedList;
    }

    @Override
    public List<Client> list(int from, int to) {
        return dataSource.subList(from, Math.min(to, dataSource.size()));
    }

    @Override
    public int total() {
        return dataSource.size();
    }
}
