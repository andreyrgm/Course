package co.argm.app.ui.map.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.System.out;

/**
 * Clase que demuestra el uso de un mapa HashMap y algunos de sus métodos.
 */
public class Methods {
    public static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();
        out.println("Contains elements = " + !person.isEmpty());

        person.put(null, "1234");
        person.put(null, "12345");
        person.put("name", "John");
        person.put("surname", "Doe");
        person.put("paternalSurname", "Doe");
        person.put("email", "john@doe.com");
        person.put("age", "25");

        Map<String, String> address = new HashMap<>();
        address.put("country", "USA");
        address.put("state", "California");
        address.put("city", "Santa Barbara");
        address.put("street", "One Street");
        address.put("phone", "120");

        person.put("address", address);

        out.println("person = " + person);

        out.println("name = " + person.get("name"));
        out.println("surname = " + person.get("surname"));

        Map<String, String> addressPerson = (Map<String, String>) person.get("address");
        String country = addressPerson.get("country");
        String city = addressPerson.get("city");
        String neighborhood = addressPerson.getOrDefault("neighborhood", "The beach");
        out.println(person.get("name") + "'s country is: " + country);
        out.println(person.get("name") + "'s city is: " + city);
        out.println(person.get("name") + "'s neighborhood is: " + neighborhood);

        out.println("Remove = " + person.remove("paternalSurname", "Doe"));
        out.println("person = " + person);

        out.println("Contains = " + person.containsKey("paternalSurname"));
        out.println("Contains = " + person.containsValue("john@doe.co"));

        out.println("=== values ===");
        Collection<Object> values = person.values();
        for (Object value : values) {
            out.println("value = " + value);
        }

        out.println("=== keySet ===");
        Set<String> keys = person.keySet();
        for (String key : keys) {
            out.println("key = " + key);
        }

        out.println("=== entrySet ===");
        for (Map.Entry<String, Object> entry : person.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof Map) {
                String name = (String) person.get("name");
                Map<String, String> addressMap = (Map<String, String>) value;
                for (Map.Entry<String, String> entryAddress : addressMap.entrySet()) {
                    out.println(entryAddress.getKey() + " =>" + " " + entryAddress.getValue());
                }
            } else {
                out.println(entry.getKey() + " => " + value);
            }
        }

        out.println("=== keySet ===");
        for (String key : person.keySet()) {
            Object value = person.get(key);
            if (value instanceof Map) {
                String name = (String) person.get("name");
                Map<String, String> addressMap = (Map<String, String>) value;
                out.println("The country of " + name + ": " + addressMap.get("country"));
                out.println("The state of " + name + ": " + addressMap.get("state"));
                out.println("The city of " + name + ": " + addressMap.get("city"));
            } else {
                out.println(key + " => " + value);
            }
        }

        out.println("=== java 8 forEach ===");
        person.forEach((key, value) -> out.println(key + " => " + value));

        out.println("Total: " + person.size());
        out.println("Contains elements = " + !person.isEmpty());
        out.println("replace = " + person.replace("name", "Andrew"));
        out.println("person = " + person);
    }
}
