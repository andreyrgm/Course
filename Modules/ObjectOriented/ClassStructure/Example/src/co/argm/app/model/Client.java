package co.argm.app.model;

/**
 * Representa un cliente con un nombre y un número de identificación fiscal.
 */
public class Client {
    private final String name;
    private final String taxNum;

    public Client(String taxNum, String name) {
        this.taxNum = taxNum;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nCliente: " + name + "\tNIF: " + taxNum;
    }
}
