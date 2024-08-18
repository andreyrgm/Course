package co.argm.app.ui.set.hash;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * Clase que demuestra cómo agregar elementos a un HashSet y verificar si permite duplicados.
 */
public class Add {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        out.println(set.add("one") + "\n" + set.add("two") + "\n" + set.add("three") + "\n" + set.add("four") + "\n" +
                set.add("five") + "\n" + set);

        boolean b = set.add("three");
        out.println("Allow duplicate items = " + b + "\n" + set);
    }
}
