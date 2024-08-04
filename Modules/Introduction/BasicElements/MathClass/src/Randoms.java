import java.util.Random;

import static java.lang.Math.floor;
import static java.lang.Math.random;
import static java.lang.System.out;

/**
 * Ejemplo de generación de números aleatorios utilizando Math.random() y Random.
 */
public class Randoms {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "green", "red", "white", "yellow"};

        double random = random();
        out.println("Generated random number (0.0 to 1.0) = " + random);

        random *= colors.length;
        out.println("Random number scaled to colors length = " + random);

        random = floor(random);
        out.println("Random index (floor) = " + random);

        out.println("Randomly selected color (Math.random) = " + colors[(int) random]);

        Random rand = new Random();

        int randomInt = 15 + rand.nextInt(25 - 15);
        out.println("Random integer between 15 and 25 (Random) = " + randomInt);

        randomInt = rand.nextInt(colors.length);
        out.println("Random index (Random) = " + randomInt);
        out.println("Randomly selected color (Random) = " + colors[randomInt]);
    }
}
