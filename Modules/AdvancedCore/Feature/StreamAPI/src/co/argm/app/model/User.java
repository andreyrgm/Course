package co.argm.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase que representa un usuario con un nombre, apellido e ID único.
 */
public class User {
    private static int lastId;
    private final String name;
    private final String surname;
    private final Integer id;
    private final List<Bill> bills;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++lastId;
        this.bills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    public List<Bill> getBills() {
        return bills;
    }

    public User addBill(Bill bill) {
        bills.add(bill);
        bill.setUser(this);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
