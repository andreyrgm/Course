package co.argm.app.ui.list.array;

import co.argm.app.model.Student;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de métodos en una lista de tipo ArrayList.
 */
public class Methods {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        out.println(students + ", size: " + students.size());
        out.println("Is empty? " + students.isEmpty());

        students.add(new Student("Pato", 5));
        students.add(new Student("Cata", 6));
        students.add(new Student("Luci", 4));
        students.add(2, new Student("Jano", 7));
        students.set(3, new Student("Andrew", 3));

        out.println(students + ", size: " + students.size());

        students.remove(new Student("Jano", 7));
        out.println(students + ", size: " + students.size());

        out.println("The list contains Cata: " + students.contains(new Student("Cata", 6)));

        Object[] array = students.toArray();
        for (Object o : array) {
            out.println("From the array = " + o);
        }
    }
}
