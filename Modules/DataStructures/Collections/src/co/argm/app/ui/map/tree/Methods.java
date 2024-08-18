package co.argm.app.ui.map.tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de un mapa TreeMap y algunos de sus métodos.
 */
public class Methods {
    public static void main(String[] args) {
        Map<String, Object> person = new TreeMap<>(Comparator.comparing(String::length).reversed());
        person.put("name", "John");
        person.put("surname", "Doe");
        person.put("paternalSurname", "Doe");
        person.put("email", "john@doe.com");
        person.put("age", "25");

        Map<String, String> address = new TreeMap<>();
        address.put("country", "USA");
        address.put("state", "California");
        address.put("city", "Santa Barbara");
        address.put("street", "One Street");
        address.put("phone", "120");

        person.put("address", address);
        out.println("person = " + person);
    }
}
