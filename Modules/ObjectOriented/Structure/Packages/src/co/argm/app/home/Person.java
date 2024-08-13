package co.argm.app.home;

/**
 * Representa una persona con nombre, apellido y color de cabello.
 */
public class Person {
    public static final String MALE_GENDER = "Male";
    public static final String FEMALE_GENDER = "Female";
    private final String name;
    private final String surname;
    private final HairColor hairColor;

    public Person(String name, String surname, HairColor hairColor) {
        this.name = name;
        this.surname = surname;
        this.hairColor = hairColor;
    }

    /**
     * Método estático para saludar.
     *
     * @return Una cadena de saludo.
     */
    public static String greet() {
        return "Hello, how are you?";
    }

    /**
     * Método para lanzar una pelota, usado en el juego con un perro.
     *
     * @return Una cadena que describe la acción de lanzar la pelota.
     */
    public String throwBall() {
        return "Throw the ball to the dog!";
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
