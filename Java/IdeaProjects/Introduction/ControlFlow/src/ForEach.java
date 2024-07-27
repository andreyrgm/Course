public class ForEach {
    public static void main(String[] args) {
        // Declaración y asignación del array de números
        int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};

        // Bucle for-each para imprimir cada número en el array
        System.out.println("=== Print numbers in the nums array ===");
        for (int num : nums) {
            System.out.println("num = " + num);
        }

        // Declaración y asignación del array de nombres
        String[] names = {"Andrey", "Pepe", "Maria", "Paco", "Lilo", "Bea", "Pato", "Pepa"};

        // Bucle for-each para imprimir cada nombre en el array
        System.out.println("\n=== Print names in the array names ===");
        for (String name : names) {
            System.out.println("name = " + name);
        }
    }
}
