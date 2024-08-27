package co.argm.app.model;

import java.util.Date;

public class Product {
    private final String name;
    private final int price;
    private final Category category;
    private int id;
    private Date recordDate;

    public Product(int id, String name, int price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(String name, int price, Date recordDate, Category category) {
        this.name = name;
        this.price = price;
        this.recordDate = recordDate;
        this.category = category;
    }

    public Product(int id, String name, int price, Date recordDate, Category category) {
        this(name, price, recordDate, category);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + price + " | " + recordDate + " | " + category;
    }
}
