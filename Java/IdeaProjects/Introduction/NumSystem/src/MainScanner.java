import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNum = getInputNumber(sc);
        showConversions(decimalNum);
    }

    private static int getInputNumber(Scanner sc) {
        int decimalNum = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.println("Enter an int:");
            try {
                decimalNum = sc.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: you must enter an int!");
                sc.next(); // Limpiar el input inválido
            }
        }
        return decimalNum;
    }

    /**
     * Muestra las conversiones de un número decimal a binario, octal y hexadecimal.
     *
     * @param decimalNum El número decimal a convertir.
     */
    private static void showConversions(int decimalNum) {
        System.out.println("decimalNum = " + decimalNum);

        String binaryResult = "Binary num of " + decimalNum + " = " + Integer.toBinaryString(decimalNum);
        System.out.println(binaryResult);

        String octalResult = "Octal num of " + decimalNum + " = " + Integer.toOctalString(decimalNum);
        System.out.println(octalResult);

        String hexResult = "Hex num of " + decimalNum + " = " + Integer.toHexString(decimalNum);
        System.out.println(hexResult);

        String message = binaryResult + "\n" + octalResult + "\n" + hexResult;
        System.out.println(message);
    }
}
