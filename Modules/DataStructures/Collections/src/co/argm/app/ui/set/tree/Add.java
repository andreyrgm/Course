package co.argm.app.ui.set.tree;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de un conjunto TreeSet con un ordenamiento personalizado.
 */
public class Add {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());
        ts.add("One");
        ts.add("Two");
        ts.add("Three");
        ts.add("Three");
        ts.add("Four");
        ts.add("Five");
        out.println("ts = " + ts);

        Set<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(10);
        nums.add(2);
        nums.add(1);
        nums.add(9);
        nums.add(3);
        out.println("nums = " + nums);
    }
}
