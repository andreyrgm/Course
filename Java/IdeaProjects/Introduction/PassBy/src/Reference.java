public class Reference {
    public static void main(String[] args) {
        int[] age = {10, 11, 12};

        System.out.println("We start the main");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        System.out.println("Before invoking the test method");
        test(age);

        System.out.println("After invoking the test method");
        for (int i = 0; i < age.length; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        System.out.println("We finish the main with the modified array!");
    }

    /**
     * Método que modifica los valores de un arreglo de enteros sumándoles 20.
     * @param ageArray el arreglo de enteros a modificar
     */
    public static void test(int[] ageArray) {
        System.out.println("We start the test");
        for (int i = 0; i < ageArray.length; i++) {
            ageArray[i] += 20; // Modifica los elementos del arreglo
        }
        System.out.println("We finish the test");
    }
}
