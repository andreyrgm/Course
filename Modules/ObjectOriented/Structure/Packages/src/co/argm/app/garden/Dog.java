package co.argm.app.garden;

import co.argm.app.home.Person;

/**
 * Representa un perro con nombre y raza.
 */
public class Dog {
    protected String name;
    protected String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    /**
     * Método para que el perro juegue con una persona.
     *
     * @param person La persona con la que el perro juega.
     * @return Una cadena que describe la acción de jugar.
     */
    String play(Person person) {
        return person.throwBall();
    }
}
