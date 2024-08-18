package co.argm.app.ui;

import static co.argm.app.model.Genre.PROGRAMMING;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Curriculum curriculum = new Curriculum(new Person("John", "Doe"), "Systems engineer",
                "Job Summary...").addExperience("Java").addExperience("Oracle DBA").addExperience("Angular")
                .addExperience("Fullstack developer").addExperience("Spring Framework");

        Book book = new Book(new Person("Erich", "Gamma"), "Design Patterns: Reusable OOP",
                PROGRAMMING).addPage(new Page("Singleton Pattern")).addPage(new Page("Facade Pattern"))
                .addPage(new Page("Observer Pattern")).addPage(new Page("Factory Pattern"))
                .addPage(new Page("Composite Pattern"));

        Report report = new Report(new Person("Martin", "Fowler"), "James",
                "Microservices study");

        out.println(curriculum + "\n" + book + "\n" + report);
    }
}
