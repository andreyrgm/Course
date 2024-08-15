package co.argm.app.model;

/**
 * Clase que representa a un cliente.
 */
public class Client extends Person {
    private final int id;

    public Client(int id, String taxNum, String name, String surname, String address) {
        super(taxNum, name, surname, address);
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", " + super.toString();
    }
}
