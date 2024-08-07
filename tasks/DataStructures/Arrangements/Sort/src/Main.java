import java.util.Scanner;

import static java.lang.System.out;

/**
 * Lee 10 números enteros desde el teclado, los almacena en un arreglo y los muestra en un orden específico.
 *
 * <p>El orden de salida es el siguiente: el último elemento del arreglo, luego el primero, después el penúltimo,
 * el segundo, el antepenúltimo, el tercero, y así sucesivamente.</p>
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }

        out.println("The result is:");

        for (int i = 0; i < nums.length / 2; i++) {
            out.println(nums[nums.length - 1 - i] + " " + nums[i]);
        }
    }
}
