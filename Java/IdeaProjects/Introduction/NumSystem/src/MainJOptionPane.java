import javax.swing.*;

public class MainJOptionPane {
    public static void main(String[] args) {
        int decimalNum = getInputNumber();
        showConversions(decimalNum);
    }

    /**
     * Solicita al usuario un número entero utilizando un cuadro de diálogo de entrada.
     *
     * @return El número entero ingresado por el usuario.
     */
    private static int getInputNumber() {
        int decimalNum = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                decimalNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an int"));
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: you must enter an int");
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

        int binaryNum = 0b111110100; // Ejemplo de número binario
        System.out.println("binaryNum = " + binaryNum);

        String octalResult = "Octal num of " + decimalNum + " = " + Integer.toOctalString(decimalNum);
        System.out.println(octalResult);

        int octalNum = 0764; // Ejemplo de número octal
        System.out.println("octalNum = " + octalNum);

        String hexResult = "Hex num of " + decimalNum + " = " + Integer.toHexString(decimalNum);
        System.out.println(hexResult);

        int hexNum = 0x1f4; // Ejemplo de número hexadecimal
        System.out.println("hexNum = " + hexNum);

        String message = binaryResult + "\n" + octalResult + "\n" + hexResult;
        JOptionPane.showMessageDialog(null, message);
    }
}
