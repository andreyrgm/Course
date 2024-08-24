package co.argm.app.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Clase que representa un Producto con atributos que pueden ser serializados a JSON.
 */
public class Product {

    @JsonAttribute(name = "cost")
    private final double price;
    private final LocalDate date;
    @JsonAttribute
    private String name;

    public Product(String name, double price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    /**
     * Método anotado con {@link Init} para capitalizar el nombre del producto durante la inicialización.
     */
    @Init
    private void init() {
        this.name = Arrays.stream(name.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
