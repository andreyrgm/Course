import static java.lang.System.out;

public class ReadFile {
    public static void main(String[] args) {
        Service service = new Service();
        out.println(service.read("C:\\Users\\andre\\OneDrive\\Escritorio\\Course\\Modules\\Introduction\\" +
                "Fundamentals\\Console\\FileHandling\\src\\file\\java.txt"));
    }
}
