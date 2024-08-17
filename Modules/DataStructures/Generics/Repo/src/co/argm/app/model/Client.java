package co.argm.app.model;

/**
 * Clase que representa a un cliente con un identificador único, nombre y apellido.
 */
public class Client extends Entity {
    private static int lastId;
    private Integer id;
    private String name;
    private String surname;

    public Client(String name, String surname) {
        super();
        this.name = name;
        this.surname = surname;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
