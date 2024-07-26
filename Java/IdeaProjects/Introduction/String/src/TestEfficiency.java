public class TestEfficiency {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = "a";

        StringBuilder sb = new StringBuilder(a);

        long start = System.currentTimeMillis();

        // Probar diferentes métodos de concatenación
        for (int i = 0; i < 100000; i++) {
            // Método 1: Usando String.concat()
            // c = c.concat(a).concat(b).concat("\n"); //500 => 1ms, 1000 => 2ms, 10000 => 88ms, 100000 => 4682ms

            // Método 2: Usando operador '+'
            // c += a + b + "\n"; //500 => 11ms, 1000 => 12ms, 10000 => 43ms, 100000 => 1678ms

            // Método 3: Usando StringBuilder
            sb.append(a).append(b).append("\n"); //500 => 0ms, 1000 => 0ms, 10000 => 0ms, 100000 => 6ms
        }

        long end = System.currentTimeMillis();
        System.out.println("Tiempo transcurrido: " + (end - start) + " ms");

        // Imprimir los resultados de la concatenación
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
