public class Main {
    public static void main(String[] args) {
        printGreeting();
        demonstrateVariablesAndControlStructures();
    }

    /**
     * Imprime un saludo y su versión en mayúsculas.
     */
    private static void printGreeting() {
        String greet = "Hello World from Java";
        System.out.println(greet);
        System.out.println("greet.toUpperCase() = " + greet.toUpperCase());
    }

    /**
     * Demuestra el uso de variables y estructuras de control.
     */
    private static void demonstrateVariablesAndControlStructures() {
        int num = 11;
        boolean value = true;
        int num2 = 5;

        if (value) {
            System.out.println("num = " + num);
            num2 = 10;
        }
        System.out.println("num2 = " + num2);

        var num3 = "15";

        String name = "Andrey";

        if (num > 10) {
            name = "Gomez";
        }

        System.out.println("name = " + name);

        int agePerson = 5;
    }
}
