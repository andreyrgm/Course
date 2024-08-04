import static java.lang.Math.*;
import static java.lang.System.out;

/**
 * Ejemplo de uso de métodos matemáticos de la clase Math.
 */
public class Methods {
    public static void main(String[] args) {
        int absolute = abs(-3);
        out.println("Absolute value of -3 = " + absolute);

        absolute = abs(3);
        out.println("Absolute value of 3 = " + absolute);

        double max = max(3.5, 1.2);
        out.println("Maximum of 3.5 and 1.2 = " + max);

        double min = min(3.5, 1.2);
        out.println("Minimum of 3.5 and 1.2 = " + min);

        double ceilValue = ceil(3.5);
        out.println("Ceil value of 3.5 = " + ceilValue);

        double floorValue = floor(3.5);
        out.println("Floor value of 3.5 = " + floorValue);

        long roundedPI = round(PI);
        out.println("PI rounded to the nearest integer = " + roundedPI);

        double expValue = exp(2);
        out.println("e^2 (exp(2)) = " + expValue);

        double logValue = log(10);
        out.println("Natural logarithm of 10 = " + logValue);

        double powValue = pow(10, 3);
        out.println("10 raised to the power of 3 = " + powValue);

        double sqrtValue = sqrt(5);
        out.println("Square root of 5 = " + sqrtValue);

        double degrees = toDegrees(1.57);
        degrees = round(degrees);
        out.println("Convert 1.57 radians to degrees = " + degrees);

        double radians = toRadians(90);
        out.println("Convert 90 degrees to radians = " + radians);

        out.println("sin(90°) = " + sin(radians));
        out.println("cos(90°) = " + cos(radians));

        radians = toRadians(180);
        out.println("cos(180°) = " + cos(radians));

        radians = toRadians(0);
        out.println("cos(0°) = " + cos(radians));
    }
}
