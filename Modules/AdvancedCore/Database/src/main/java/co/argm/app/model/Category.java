package co.argm.app.model;

/**
 * Entidad que representa una categoría en la aplicación.
 */
public class Category {
    private final String name;
    private int id;

    public Category(String name) {
        this.name = name;
    }

    public Category(int id, String name) {
        this(name);
        this.id = id;
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

    @Override
    public String toString() {
        return name;
    }
}
