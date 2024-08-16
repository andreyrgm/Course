package co.argm.app.model.Repository;

import co.argm.app.model.Client;

import java.util.List;

/**
 * Interfaz que define el contrato para paginar los resultados de una lista.
 */
public interface Pageable {
    List<Client> list(int from, int to);
}
