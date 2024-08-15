package co.argm.app.model;

/**
 * Clase que representa a una persona.
 * Esta clase es abstracta y debe ser extendida por otras clases.
 */
public abstract class Person {
    private final String taxNum;
    private final String name;
    private final String surname;
    private final String address;

    protected Person(String taxNum, String name, String surname, String address) {
        this.taxNum = taxNum;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    @Override
    public String toString() {
        return "TaxNumber=" + taxNum + ", Name=" + name + ", Surname=" + surname + ", Address=" + address;
    }
}
