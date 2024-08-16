package co.argm.app.model.Repository;

import co.argm.app.model.Client;

import java.util.List;

/**
 * Interfaz que define el contrato para ordenar los resultados de una lista según un campo específico.
 */
public interface Sort {
    List<Client> list(String field, Direction dir);
}
