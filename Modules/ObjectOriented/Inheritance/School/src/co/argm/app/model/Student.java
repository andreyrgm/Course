package co.argm.app.model;

/**
 * Clase que representa a un estudiante, que es una subclase de Persona.
 */
public class Student extends Person {
    private final String institution;
    private final double historyNote;
    private final double mathNote;
    private final double spanishNote;

    public Student(String name, String surname, int age, String email, String institution, double historyNote, double mathNote,
                   double spanishNote) {
        super(name, surname, age, email);
        this.institution = institution;
        this.historyNote = historyNote;
        this.mathNote = mathNote;
        this.spanishNote = spanishNote;
    }

    /**
     * Calcula el promedio de las notas del estudiante.
     *
     * @return El promedio de las notas.
     */
    public double calculateAverage() {
        return (historyNote + mathNote + spanishNote) / 3;
    }

    @Override
    public String greet() {
        String greet = super.greet();
        return greet + " I am a student and my name is " + getName();
    }

    @Override
    public String toString() {
        String result = super.toString() + "\nInstitution: " + institution + "\nNote in History: " + historyNote +
                "\nNote in Mathematics: " + mathNote + "\nNote in Spanish: " + spanishNote;

        if (this.getClass().equals(Student.class)) {
            result += "\nAverage: " + calculateAverage();
        }

        return result;
    }
}
