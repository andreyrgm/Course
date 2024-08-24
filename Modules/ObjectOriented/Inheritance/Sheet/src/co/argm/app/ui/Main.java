package co.argm.app.ui;

import co.argm.app.model.*;

import static co.argm.app.model.Genre.PROGRAMMING;
import static java.lang.System.out;

/**
 * Clase principal que demuestra la creación de un curriculum, un libro, y un reporte.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un curriculum vitae
        Curriculum curriculum = new Curriculum(new Person("John", "Doe"), "Systems engineer",
                "Job Summary...")
                .addExperience("Java")
                .addExperience("Oracle DBA")
                .addExperience("Angular")
                .addExperience("Fullstack developer")
                .addExperience("Spring Framework");

        // Crear un libro sobre patrones de diseño
        Book book = new Book(new Person("Erich", "Gamma"), "Design Patterns: Reusable OOP",
                PROGRAMMING)
                .addPage(new Page("Singleton Pattern"))
                .addPage(new Page("Facade Pattern"))
                .addPage(new Page("Observer Pattern"))
                .addPage(new Page("Factory Pattern"))
                .addPage(new Page("Composite Pattern"));

        // Crear un reporte técnico
        Report report = new Report(new Person("Martin", "Fowler"), "James",
                "Microservices study");

        // Imprimir el contenido de los objetos creados
        out.println(curriculum + "\n" + book + "\n" + report);
    }
}
