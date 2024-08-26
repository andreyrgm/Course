public class CreateFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\andre\\OneDrive\\Escritorio\\Course\\Modules\\Introduction\\Fundamentals\\" +
                "Console\\FileHandling\\src\\file\\java.txt";

        Service service = new Service();
        service.create(fileName);
    }
}
