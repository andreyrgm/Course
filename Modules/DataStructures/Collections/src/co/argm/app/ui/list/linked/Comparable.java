package co.argm.app.ui.list.linked;

import co.argm.app.model.Student;

import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static java.util.Comparator.comparing;

/**
 * Clase que demuestra el uso de una lista LinkedList y el ordenamiento de sus elementos.
 */
public class Comparable {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Pato", 4));
        students.add(new Student("Cata", 7));
        students.add(new Student("Luci", 5));
        students.add(new Student("Jano", 8));
        students.add(new Student("Mari", 1));
        students.add(new Student("Zeus", 2));
        students.add(new Student("Luca", 2));
        students.add(new Student("Peña", 2));
        students.add(new Student("Peña", 3));

        students.sort(comparing(Student::getName).reversed());
        out.println(students);

        students.forEach(out::println);
    }
}
