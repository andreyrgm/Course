public class Value {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("We start the main with i= " + i);
        test(i);
        System.out.println("We end the main with the value of i (it remains the same) = " + i);
    }

    /**
     * Método que demuestra el paso de parámetros por valor.
     * @param i el valor entero a modificar localmente
     */
    public static void test(int i) {
        System.out.println("We start the test with i = " + i);
        i = 35; // Esta asignación no afecta al valor de i en el método main
        System.out.println("We finish the test with i = " + i);
    }
}
