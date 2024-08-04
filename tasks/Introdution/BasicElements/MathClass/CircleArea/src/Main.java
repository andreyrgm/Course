import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;

/**
 * Calcula el área de un círculo dado su radio.
 *
 * <p>Utiliza la fórmula: <code>area = PI * r²</code>, donde PI es una constante y r es el radio del círculo.</p>
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.print("Enter the radius of a circle: ");
        double radius = scanner.nextDouble();

        double area = PI * pow(radius, 2);
        out.printf("The area of a circle with radius %.2f is: %.2f%n", radius, area);
    }
}
