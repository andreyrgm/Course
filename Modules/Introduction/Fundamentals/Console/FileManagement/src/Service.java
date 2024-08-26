import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.System.out;

public class Service {
    public void create(String name) {
        File file = new File(name);
        try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
            pw.println("Hi, how are you friends!");
            pw.println("All good? I'm here writing a file...");
            pw.printf("See you later %s!", "Lucas");
            out.println("The file has been created successfully!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String read(String name) {
        StringBuilder sb = new StringBuilder();
        File file = new File(name);
        try (Scanner sc = new Scanner(file);) {
            sc.useDelimiter("\n");
            while (sc.hasNextInt()) sb.append(sc.next()).append("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
