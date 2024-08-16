package co.argm.app.model;

import java.util.Objects;

/**
 * Clase que representa a un cliente con un identificador único, nombre y apellido.
 */
public class Client {
    private static int lastId;
    private Integer id;
    private String name;
    private String surname;

    public Client(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++lastId;
    }

    public Integer getId() {
        return id;
    }

    public Client setId(Integer id) {
        this.id = id;
        return this;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
