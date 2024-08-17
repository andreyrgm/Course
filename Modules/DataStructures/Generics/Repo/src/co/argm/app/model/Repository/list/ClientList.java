package co.argm.app.model.Repository.list;

import co.argm.app.model.Client;
import co.argm.app.model.Repository.AbstractList;
import co.argm.app.model.Repository.Direction;

import java.util.ArrayList;
import java.util.List;

import static co.argm.app.model.Repository.Direction.ASC;

/**
 * Clase que implementa la lista de clientes con funcionalidades de ordenamiento y actualización.
 */
public class ClientList extends AbstractList<Client> {
    private int sort(String field, Client a, Client b) {
        return switch (field) {
            case "id" -> a.getId().compareTo(b.getId());
            case "name" -> a.getName().compareTo(b.getName());
            case "surname" -> a.getSurname().compareTo(b.getSurname());
            default -> 0;
        };
    }

    @Override
    public void update(Client client) {
        Client existingClient = get(client.getId());
        if (existingClient != null) {
            existingClient.setName(client.getName()).setSurname(client.getSurname());
        }
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
}
