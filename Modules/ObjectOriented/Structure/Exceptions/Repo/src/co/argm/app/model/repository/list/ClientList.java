package co.argm.app.model.repository.list;

import co.argm.app.model.Client;
import co.argm.app.model.exceptions.ReadException;
import co.argm.app.model.repository.AbstractList;
import co.argm.app.model.repository.Direction;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementación de AbstractList para manejar una lista de clientes.
 */
public class ClientList extends AbstractList<Client> {

    /**
     * Ordena dos clientes según el campo especificado.
     *
     * @param field Campo por el cual ordenar.
     * @param a     Primer cliente.
     * @param b     Segundo cliente.
     * @return Resultado de la comparación.
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
    public void update(Client client) throws ReadException {
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
            return dir == Direction.ASC ? result : -result;
        });
        return sortedList;
    }
}
