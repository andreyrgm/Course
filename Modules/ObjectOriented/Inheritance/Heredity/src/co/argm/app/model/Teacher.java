package co.argm.app.model;

/**
 * Clase que representa a un profesor, que es una subclase de Persona.
 */
public class Teacher extends Person {
    private final String subject;

    public Teacher(String name, String surname, int age, String email, String subject) {
        super(name, surname, age, email);
        this.subject = subject;
    }

    @Override
    public String greet() {
        return "Good morning, I am the teacher of " + subject + ", my name is " + getName();
    }

    @Override
    public String toString() {
        return super.toString() + "\nSubject: " + subject;
    }
}
