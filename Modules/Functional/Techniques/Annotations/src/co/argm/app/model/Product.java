package co.argm.app.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Product {
    @JsonAttribute
    private String name;

    @JsonAttribute(name = "cost")
    private double price;

    private LocalDate date;

    public Product(String name, double price, LocalDate date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    @Init
    private void init(){
        this.name = Arrays.stream(name.split(" ")).map(word -> word.substring(0, 1).toUpperCase() + word
                .substring(1).toLowerCase()).collect(Collectors.joining(" "));
    }
}
