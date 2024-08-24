package co.argm.app.model;

import java.util.Objects;

/**
 * Clase base para las entidades.
 */
public class Entity {
    private static int lastId;
    protected Integer id;

    public Entity() {
        id = ++lastId;
    }

    public Integer getId() {
        return id;
    }

    public Client setId(Integer id) {
        this.id = id;
        return (Client) this;
    }

    public Product setId2(Integer id) {
        this.id = id;
        return (Product) this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Entity entity)) return false;
        return Objects.equals(id, entity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
