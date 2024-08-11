package co.argm.app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Representa una factura que incluye un cliente, una descripción, y varios items.
 */
public class Invoice {
    public static final int MAX_ITEMS = 5;
    private static int lastId;
    private final Date date;
    private final int id;
    private final Client client;
    private final String description;
    private final InvoiceItem[] items;
    private int indexItems;

    public Invoice(Client client, String description) {
        this.date = new Date();
        this.client = client;
        this.description = description;
        items = new InvoiceItem[MAX_ITEMS];
        id = ++lastId;
    }

    public void addItem(InvoiceItem item) {
        if (indexItems < MAX_ITEMS) {
            items[indexItems++] = item;
        }
    }

    /**
     * Calcula el total de la factura sumando el monto de todos los items.
     *
     * @return El total de la factura.
     */
    public double calculateTotal() {
        double total = 0;
        for (InvoiceItem item : items) {
            if (item != null) {
                total += item.calculateAmount();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Factura N°: ").append(id)
                .append(client)
                .append("\nDescripción: ").append(description).append("\n");

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        sb.append("Fecha de emisión: ").append(sdf.format(date)).append("\n")
                .append("\n#\tNombre\t$\tCantidad\tTotal\n");

        for (InvoiceItem item : items) {
            if (item != null) {
                sb.append(item).append("\n");
            }
        }
        sb.append("Total general: ").append(calculateTotal());

        return sb.toString();
    }
}
