package co.argm.app.home;

import co.argm.app.garden.Dog;

import static co.argm.app.home.HairColor.BROWN;
import static co.argm.app.home.Person.greet;

/**
 * Clase principal para ejecutar la aplicación relacionada con el hogar.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrey", "Gomez", BROWN);
        Dog dog = new Dog("Z", "Wolf");
        String greet = greet();
    }
}
