package co.argm.app;

import co.argm.app.model.Client;
import co.argm.app.model.Invoice;
import co.argm.app.model.InvoiceItem;
import co.argm.app.model.Product;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Clase principal que permite la creación y gestión de facturas.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client("5555-5", "Andrew");

        Scanner sc = new Scanner(in);
        out.print("Ingrese la descripción de la factura: ");
        Invoice invoice = new Invoice(client, sc.nextLine());

        for (int i = 0; i < 5; i++) {
            Product product = new Product();
            out.print("Ingrese el nombre del producto N° " + product.getId() + ": ");
            product.setName(sc.nextLine());

            out.print("Ingrese el precio: ");
            product.setPrice(sc.nextDouble());

            out.print("Ingrese la cantidad: ");
            invoice.addItem(new InvoiceItem(product, sc.nextInt()));

            out.println();
            sc.nextLine(); // Consumir la nueva línea después de la entrada numérica
        }

        out.println(invoice);
    }
}
