package model;

/**
 * Representa a un cliente con nombre y apellido.
 */
public class Client {
    private final String name;
    private final String surname;

    /**
     * Constructor que inicializa un cliente con su nombre y apellido.
     *
     * @param name    El nombre del cliente.
     * @param surname El apellido del cliente.
     */
    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * Retorna una representación en cadena del cliente.
     *
     * @return El nombre completo del cliente.
     */
    @Override
    public String toString() {
        return name + " " + surname;
    }
}
