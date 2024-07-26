public class ArrayMethod {
    public static void main(String[] args) {
        String tongueTwister = "tongue twister";
        System.out.println("tongueTwister.length() = " + tongueTwister.length());
        System.out.println("tongueTwister.toCharArray() = " + tongueTwister.toCharArray());

        char[] array = tongueTwister.toCharArray();
        int length = array.length;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
        }

        System.out.println("\ntongueTwister = " + tongueTwister.split("t"));

        String[] array2 = tongueTwister.split("t");
        length = array2.length;
        for (int i = 0; i < length; i++) {
            System.out.println(array2[i]);
        }

        String archive = "any.image.png";
        String[] arrayArchive = archive.split("\\."); // [.]
        length = arrayArchive.length;
        System.out.println("length = " + length);
        for (int i = 0; i < length; i++) {
            System.out.println(arrayArchive[i]);
        }
        System.out.println("extension = " + arrayArchive[length - 1]);
    }
}
