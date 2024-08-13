package co.argm.app.model;

/**
 * Clase que representa a un estudiante extranjero, que es una subclase de Estudiante.
 */
public class ForeignStudent extends Student {
    private final String country;
    private final double languagesNote;

    public ForeignStudent(String name, String surname, int age, String email, String country, String institution,
                          double historyNote, double languagesNote, double mathNote, double spanNote) {
        super(name, surname, age, email, institution, historyNote, mathNote, spanNote);
        this.country = country;
        this.languagesNote = languagesNote;
    }

    @Override
    public double calculateAverage() {
        return ((super.calculateAverage() * 3) + languagesNote) / 4;
    }

    @Override
    public String greet() {
        String greet = super.greet();
        return greet + ", I am a foreign student from country " + country;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLanguages Note: " + languagesNote + "\nAverage: " + calculateAverage() +
                "\nCountry: " + country;
    }
}
