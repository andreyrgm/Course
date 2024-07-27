public class ArrayMethod {
    public static void main(String[] args) {
        String tongueTwister = "tongue twister";

        // Imprimir la longitud de la cadena
        System.out.println("tongueTwister.length() = " + tongueTwister.length());

        // Convertir la cadena a un arreglo de caracteres e imprimirlo
        char[] array = tongueTwister.toCharArray();
        int length = array.length;
        System.out.println("tongueTwister.toCharArray() = " + array);
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();

        // Dividir la cadena por el carácter 't' e imprimir cada elemento del arreglo resultante
        String[] array2 = tongueTwister.split("t");
        length = array2.length;
        System.out.println("tongueTwister.split('t') = ");
        for (int i = 0; i < length; i++) {
            System.out.println(array2[i]);
        }

        // Dividir una cadena de archivo por el punto (.) e imprimir cada elemento del arreglo resultante
        String archive = "any.image.png";
        String[] arrayArchive = archive.split("\\."); // [.]
        length = arrayArchive.length;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.println(arrayArchive[i]);
        }

        // Imprimir la extensión del archivo
        System.out.println("extension = " + arrayArchive[length - 1]);
    }
}
