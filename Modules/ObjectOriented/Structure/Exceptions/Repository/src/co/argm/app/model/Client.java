package co.argm.app.model;

/**
 * Clase que representa un cliente.
 */
public class Client extends Entity {
    private String name;
    private String surname;

    public Client(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "id=" + getId() +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
