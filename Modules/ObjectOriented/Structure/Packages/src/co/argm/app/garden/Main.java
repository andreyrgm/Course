package co.argm.app.garden;

import co.argm.app.home.Person;

import static co.argm.app.home.HairColor.BLACK;
import static co.argm.app.home.Person.*;
import static java.lang.System.out;

/**
 * Clase principal para ejecutar la aplicación relacionada con el jardín.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Andrew", "Gomez", BLACK);
        out.println(person);

        Dog dog = new Dog("Zeus", "Siberian Wolf");

        out.println("Playing: " + dog.play(person));
        out.println(greet());
        String genderWoman = FEMALE_GENDER;
        String genderMan = MALE_GENDER;
    }
}
