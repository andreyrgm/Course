import java.util.Scanner;

/**
 * Se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
 *
 * - Reciba el nombre de la factura o descripción, utilizar el método nextLine() para obtener el nombre de la factura con espacios.
 * - Reciba 2 precios de productos de tipo double, utilizar el método nextDouble() para obtener precios con decimales (,).
 * - Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%.
 *
 * Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter invoice name or description: ");
        String name = sc.nextLine();
        System.out.println("Enter the price of the first product: ");
        double price1 = sc.nextDouble();
        System.out.println("Enter the price of the second product: ");
        double price2 = sc.nextDouble();
        double total = price1 + price2;
        double iva = ((total/100)*19);
        double totalIva = total + iva;
        System.out.println("The invoice " + name + " has a gross total of " + total + ", with a tax of " + iva + " and the amount after tax is " + totalIva);
    }
}
