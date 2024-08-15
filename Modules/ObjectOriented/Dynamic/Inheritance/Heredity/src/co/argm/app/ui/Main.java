package co.argm.app.ui;

import co.argm.app.model.ForeignStudent;
import co.argm.app.model.Student;
import co.argm.app.model.Teacher;

import static java.lang.System.out;

/**
 * Clase principal para probar las funcionalidades de las clases Person, Student, ForeignStudent y Teacher.
 */
public class Main {
    public static void main(String[] args) {
        out.println("=== Creating the instance of the Student class ===");
        Student student = new Student("Andrew", "Gomez", 19, "andrew@email.com",
                "National Institute", 6.3, 4.9, 5.5);
        out.println(student);

        out.println("\n=== Creating the instance of the ForeignStudent class ===");
        ForeignStudent foreignStudent = new ForeignStudent("Peter", "Gosling", 15,
                "peter@email.com", "Australia", "National Institute", 5.8,
                6.8, 6.5, 6.2);
        out.println(foreignStudent);

        out.println("\n=== Creating the instance of the Teacher class ===");
        Teacher teacher = new Teacher("Lucy", "Perez", 41, "lucy@email.com", "Mathematics");
        out.println(teacher);

        out.println("\n=== - ===");
        Class<?> clas = foreignStudent.getClass();
        while (clas.getSuperclass() != null) {
            String child = clas.getName();
            String parent = clas.getSuperclass().getName();
            out.println(child + " is a child class of the parent class " + parent);
            clas = clas.getSuperclass();
        }
    }
}
