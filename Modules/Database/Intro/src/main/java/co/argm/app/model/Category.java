package co.argm.app.model;

public class Category {
    private final int id;
    private String name;

    public Category(int id) {
        this.id = id;
    }

    public Category(int id, String name) {
        this(id);
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
