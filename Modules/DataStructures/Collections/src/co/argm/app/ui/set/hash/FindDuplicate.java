package co.argm.app.ui.set.hash;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

/**
 * Clase que encuentra y separa elementos únicos y duplicados en un arreglo usando HashSet.
 */
public class FindDuplicate {
    public static void main(String[] args) {
        String[] fishes = {"Corvina", "Tuna", "Sole", "Pejerrey", "Sea bass", "Tuna", "Sole"};

        Set<String> unique = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String fish : fishes) {
            if (!unique.add(fish)) {
                duplicates.add(fish);
            }
        }
        unique.removeAll(duplicates);
        out.println("Unique: " + unique + "\nDuplicates: " + duplicates);
    }
}
