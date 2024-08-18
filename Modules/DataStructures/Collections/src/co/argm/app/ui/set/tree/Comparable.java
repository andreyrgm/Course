package co.argm.app.ui.set.tree;

import co.argm.app.model.Student;

import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.out;
import static java.util.Comparator.comparing;


/**
 * Clase que demuestra el uso de un TreeSet con objetos de tipo Student,
 * ordenados en función de sus notas de forma descendente.
 */
public class Comparable {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>(comparing(Student::getNote).reversed());
        set.add(new Student("Pato", 5));
        set.add(new Student("Cata", 6));
        set.add(new Student("Luci", 4));
        set.add(new Student("Jano", 7));
        set.add(new Student("Mari", 3));
        set.add(new Student("Zeus", 2));
        set.add(new Student("Luca", 8));
        out.println(set);
    }
}
