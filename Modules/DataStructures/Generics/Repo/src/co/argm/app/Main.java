package co.argm.app;

import co.argm.app.model.Client;
import co.argm.app.model.PremiumClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * Clase principal para realizar pruebas genéricas con listas y comparaciones.
 */
public class Main {
    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Andrew", "Gomez"));

        Client andrew = clients.get(0);

        Client[] clientArray = {new Client("Luci", "Martinez"), new Client("Andrew", "Gomez")};
        Integer[] integersArray = {1, 2, 3};

        List<Client> clientsList = fromArraytoList(clientArray);
        List<Integer> integerList = fromArraytoList(integersArray);

        clientsList.forEach(out::println);
        integerList.forEach(out::println);

        List<String> names = fromArraytoList(new String[]{"Andrew", "Pepe", "Luci", "Bea", "John"}, integersArray);
        names.forEach(out::println);

        List<PremiumClient> premiumClientsList = fromArraytoList(new PremiumClient[]{
                new PremiumClient("Paco", "Fernandez")});

        printClients(clients);
        printClients(clientsList);
        printClients(premiumClientsList);

        out.println("Maximum of 1, 9 and 4 is: " + maximum(1, 9, 4));
        out.println("Maximum of 3.9, 11.6 and 7.78 is: " + maximum(3.9, 11.6, 7.76));
        out.println("Maximum carrot, blueberry and apple is: " + maximum("Carrot", "Blueberry", "Apple"));
    }

    public static <T> List<T> fromArraytoList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T extends Number> List<T> fromArraytoList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T extends Client & Comparable<T>> List<T> fromArraytoList(T[] t) {
        return Arrays.asList(t);
    }

    public static <T, G> List<T> fromArraytoList(T[] t, G[] g) {
        for (G item : g) {
            out.println(item);
        }
        return Arrays.asList(t);
    }

    public static void printClients(List<? extends Client> clients) {
        clients.forEach(out::println);
    }

    public static <T extends Comparable<T>> T maximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        } else if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
