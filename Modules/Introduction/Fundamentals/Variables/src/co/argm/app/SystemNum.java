package co.argm.app;

import javax.swing.*;

import static java.lang.System.out;

/**
 * Clase para demostrar la conversión de un número decimal a diferentes sistemas numéricos.
 */
public class SystemNum {
    public static void main(String[] args) {

        String stringNum = JOptionPane.showInputDialog(null, "Enter an integer:");
        int decimalNum;

        try {
            decimalNum = Integer.parseInt(stringNum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: You must enter a valid integer.");
            main(args);  // Vuelve a llamar al método main para intentar nuevamente
            return;  // Salir del método para evitar seguir con una ejecución inválida
        }

        out.println("decimalNum = " + decimalNum);

        String binaryResult = "binary number " + decimalNum + " = " + Integer.toBinaryString(decimalNum);
        out.println(binaryResult);

        int binaryNum = 0b11110;
        out.println("binaryNum = " + binaryNum);

        String octalResult = "octal number of " + decimalNum + " = " + Integer.toOctalString(decimalNum);
        out.println(octalResult);

        int octalNumber = 036;
        out.println("octalNumber = " + octalNumber);

        String hexResult = "Hexadecimal number of " + decimalNum + " = " + Integer.toHexString(decimalNum);
        out.println(hexResult);

        int hexNum = 0x1e;
        out.println("hexNum = " + hexNum);

        String message = binaryResult + "\n" + octalResult + "\n" + hexResult;
        JOptionPane.showMessageDialog(null, message);
    }
}
