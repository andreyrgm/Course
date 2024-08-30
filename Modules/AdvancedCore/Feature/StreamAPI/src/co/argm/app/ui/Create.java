package co.argm.app.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Stream.of;

/**
 * Clase que demuestra diferentes formas de crear y trabajar con flujos (streams) en Java.
 */
public class Create {
    public static void main(String[] args) {
        // Crear un Stream a partir de varios elementos utilizando Stream.of
        Stream<String> names = of("Pato", "Paco", "Pepa", "Pepe");
        names.forEach(out::println); // Imprimir cada elemento del Stream

        // Crear un Stream a partir de un array
        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        names = Arrays.stream(arr);
        names.forEach(out::println); // Imprimir cada elemento del Stream

        // Crear un Stream utilizando un builder
        names = Stream.<String>builder()
                .add("Pato")
                .add("Paco")
                .add("Pepa")
                .add("Pepe")
                .build();
        names.forEach(out::println); // Imprimir cada elemento del Stream

        // Crear un Stream a partir de una lista
        List<String> lista = new ArrayList<>();
        lista.add("Pato");
        lista.add("Paco");
        lista.add("Pepa");
        lista.add("Pepe");

        names = lista.stream();
        names.forEach(out::println); // Imprimir cada elemento del Stream
    }
}
