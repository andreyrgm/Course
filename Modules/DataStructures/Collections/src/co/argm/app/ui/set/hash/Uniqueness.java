package co.argm.app.ui.set.hash;

import co.argm.app.model.Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de una lista LinkedList y el ordenamiento de sus elementos.
 */
public class Uniqueness {
    public static void main(String[] args) {

        Set<Student> set = new HashSet<>();
        set.add(new Student("Pato", 5));
        set.add(new Student("Cata", 6));
        set.add(new Student("Luci", 4));
        set.add(new Student("Jano", 7));
        set.add(new Student("Andres", 3));
        set.add(new Student("Zeus2", 2));
        set.add(new Student("Zeus", 2));
        set.add(new Student("Lucas", 2));
        set.add(new Student("Lucas", 3));
        out.println(set);

        out.println("\nIterating using a forEach");
        for (Student student : set) {
            out.println(student);
        }

        out.println("\nIterating using a while and iterator");
        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student a = it.next();
            out.println(a);
        }

        out.println("\nIterating using a Stream forEach");
        set.forEach(out::println);
    }
}
