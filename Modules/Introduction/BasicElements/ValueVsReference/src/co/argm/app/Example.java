package co.argm.app;

import static java.lang.System.out;

/**
 * Clase principal que demuestra el paso por referencia en Java.
 */
public class Example {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Andrey");

        out.println("We start the main method");

        out.println("Name before calling the test method: " + person.getName());

        out.println("Before calling the test method");
        test(person);
        out.println("After calling the test method");

        out.println("Name after calling the test method: " + person.getName());

        out.println("End the main method with the modified person data!");
    }

    /**
     * Modifica el nombre de la persona pasada como parámetro.
     *
     * @param person La persona cuyo nombre será modificado.
     */
    public static void test(Person person) {
        out.println("We start the test method");
        person.setName("Pepe");
        out.println("End the test method");
    }
}

/**
 * Clase que representa una persona con un nombre que puede ser modificado.
 */
class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}