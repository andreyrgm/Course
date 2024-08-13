package co.argm.app.model;

/**
 * Clase abstracta que representa a una persona con nombre, apellido, edad y email.
 */
public abstract class Person {
    private final String name;
    private final String surname;
    private final int age;
    private final String email;

    protected Person(String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    /**
     * Método que genera un saludo genérico.
     *
     * @return Una cadena con el saludo.
     */
    public String greet() {
        return "Hello, how are you!";
    }

    @Override
    public String toString() {
        return "Name: " + name + " " + surname + ", Age: " + age +
                ", Email: " + email + "\nGreeting: " + greet();
    }
}
