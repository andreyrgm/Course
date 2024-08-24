package ui;

import model.Client;
import model.Product;
import model.PurchaseOrder;

import java.util.Date;

import static java.lang.System.out;

/**
 * Clase principal que demuestra la creación y manejo de órdenes de compra.
 */
public class Main {
    public static void main(String[] args) {
        PurchaseOrder order1 = new PurchaseOrder("Purchase of PC components");
        order1.setClient(new Client("Andrey", "Gomez"));
        order1.setDate(new Date());

        order1.addProduct(new Product("Western Digital", "480GB SSD", 54890));
        order1.addProduct(new Product("MSI", "Optix G271 Monitor", 363940));
        order1.addProduct(new Product("AMD", "AMD Ryzen 9 5900X Processor", 599990));
        order1.addProduct(new Product("EVGA", "EVGA RTX 3080Ti Video Card", 1849990));

        PurchaseOrder order2 = new PurchaseOrder("Purchase of appliances");
        order2.setClient(new Client("John", "Doe"));
        order2.setDate(new Date());
        order2.addProduct(new Product("Fensa", "Kitchen", 239990));
        order2.addProduct(new Product("Samsung", "Refrigerator", 429990));
        order2.addProduct(new Product("Midea", "Washing Machine", 149990));
        order2.addProduct(new Product("IRobot", "Vacuum cleaner", 199990));

        PurchaseOrder order3 = new PurchaseOrder("Purchase of construction materials");
        order3.setClient(new Client("Pepa", "Roe"));
        order3.setDate(new Date());
        order3.addProduct(new Product("Melon", "Cement 25kg", 4870));
        order3.addProduct(new Product("Grau", "Concrete", 6040));
        order3.addProduct(new Product("Cerámicas Santiago", "Brick", 790));
        order3.addProduct(new Product("Redline", "Aluminum Articulating Scale", 48990));

        PurchaseOrder[] orders = {order1, order2, order3};

        for (PurchaseOrder order : orders) {
            out.println("Folio: " + order.getId());
            out.println("model.Client: " + order.getClient());
            out.println("Description: " + order.getDescription());
            out.println("Date: " + order.getDate());
            out.println("Total: " + order.getGrandTotal());

            int i = 1;
            for (Product product : order.getProducts()) {
                out.println("model.Product " + i + ": " + product.name() + " " + product.maker() + " price $" +
                        product.price());
                i++;
            }
            out.println("--------------------------------------------- following -------------------------------");
        }
    }
}
