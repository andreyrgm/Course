package co.argm.app.ui.list.linked;

import co.argm.app.model.Student;

import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de métodos en una lista de tipo LinkedList.
 */
public class Methods {
    public static void main(String[] args) {
        LinkedList<Student> link = new LinkedList<>();
        out.println(link + ", size: " + link.size());
        out.println("Is empty? " + link.isEmpty());
        link.add(new Student("Pato", 5));
        link.add(new Student("Cata", 6));
        link.add(new Student("Luci", 4));
        link.add(new Student("Jano", 7));
        link.add(new Student("Pepe", 3));

        out.println(link + ", size: " + link.size());

        link.addFirst(new Student("Zeus", 5));
        link.addLast(new Student("Atenea", 6));
        out.println(link + ", size: " + link.size());

        out.println("First: " + link.getFirst());
        out.println("Last: " + link.getLast());
        out.println("Index 2: " + link.get(2));

        Student zeus = link.removeFirst();
        link.removeLast();
        out.println(link + ", size: " + link.size());

        link.remove(new Student("Jano", 7));
        out.println(link + ", size: " + link.size());

        Student a = new Student("Lucas", 5);
        link.addLast(a);
        out.println("Lucas index = " + link.indexOf(a));

        link.remove(2);
        out.println(link + ", size: " + link.size());
        out.println("Lucas index = " + link.indexOf(a));

        link.set(3, new Student("Lalo", 7));
        out.println(link + ", size: " + link.size());

        ListIterator<Student> it = link.listIterator();

        while (it.hasNext()) {
            Student s = it.next();
            out.println(s);
        }
        out.println("=== Previous ===");
        while (it.hasPrevious()) {
            Student s = it.previous();
            out.println(s);
        }
    }
}
