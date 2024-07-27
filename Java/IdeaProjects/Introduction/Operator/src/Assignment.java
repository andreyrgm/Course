public class Assignment {
    public static void main(String[] args) {
        // Inicialización de variables
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Uso de operadores de asignación
        i += 2; // Equivalente a i = i + 2
        System.out.println("i += 2 -> i = " + i);

        i += 5; // Equivalente a i = i + 5
        System.out.println("i += 5 -> i = " + i);

        j -= 4; // Equivalente a j = j - 4
        System.out.println("j -= 4 -> j = " + j);

        j *= 3; // Equivalente a j = j * 3
        System.out.println("j *= 3 -> j = " + j);

        // Concatenación de cadenas utilizando operadores de asignación
        String sqlString = "select * from user as c";
        sqlString += " where c.user= 'Andrey' ";
        sqlString += "and c.active=1";
        System.out.println("sqlString = " + sqlString);
    }
}
