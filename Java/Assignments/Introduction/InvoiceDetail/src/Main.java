import java.util.Scanner;

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
