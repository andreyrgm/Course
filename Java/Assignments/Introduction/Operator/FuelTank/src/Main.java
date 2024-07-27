import java.util.Scanner;

/**
 * Suponiendo un estanque de gasolina (gas) con capacidad de 70 litros, se requiere un programa que pida la medida actual en litros
 * y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 * <p>
 * La medida o capacidad actual del estanque puede ser del tipo double, para una mejor precisión, pero también puede ser del tipo int.
 * <p>
 * - Si la capacidad actual es 70 litros: imprimir Estanque lleno.
 * - Si está entre 60 y menor a 70: imprimir Estanque casi lleno.
 * - Si está entre 40 y menor a 60: imprimir Estanque 3/4.
 * - Si está entre 35 y menor a 40: imprimir Medio Estanque.
 * - Si está entre 20 y menor a 35: imprimir Suficiente.
 * - Si está entre 1 y menor a 20: imprimir Insuficiente.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of fuel in the tank (1 - 70):");
        double fuel = sc.nextDouble();

        if (fuel == 70) {
            System.out.println("Pond full");
        } else if (fuel >= 60 && fuel < 70) {
            System.out.println("Pond almost full");
        } else if (fuel >= 40 && fuel < 60) {
            System.out.println("Pond 3/4");
        } else if (fuel >= 35 && fuel < 40) {
            System.out.println("Half Pond");
        } else if (fuel >= 20 && fuel < 35) {
            System.out.println("Enough");
        } else if (fuel >= 1 && fuel < 20) {
            System.out.println("Insufficient");
        } else {
            System.out.println("Invalid value");
        }
    }
}