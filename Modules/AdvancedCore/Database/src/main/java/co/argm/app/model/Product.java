package co.argm.app.model;

import java.util.Date;

/**
 * Entidad que representa un producto en la aplicación.
 */
public class Product {
    private final String name;
    private final int price;
    private final Category category;
    private Date recordDate;
    private String sku;
    private int id;

    public Product(int id, String name, int price, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public Product(String name, int price, Date recordDate, Category category, String sku) {
        this.name = name;
        this.price = price;
        this.recordDate = recordDate;
        this.category = category;
        this.sku = sku;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSku() {
        return sku;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + price + " | " + recordDate + " | " + category + " | " + sku;
    }
}
