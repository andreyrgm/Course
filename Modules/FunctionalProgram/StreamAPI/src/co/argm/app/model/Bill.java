package co.argm.app.model;

/**
 * Clase que representa una factura (Bill) asociada a un usuario.
 */
public class Bill {
    private final String description;
    private User user;

    public Bill(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
