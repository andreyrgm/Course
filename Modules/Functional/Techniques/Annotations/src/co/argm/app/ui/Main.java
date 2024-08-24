package co.argm.app.ui;

import co.argm.app.model.Product;
import co.argm.app.model.processor.JsonSerializer;

import java.time.LocalDate;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("oak center table",1000, LocalDate.now());
        out.println("json = " + JsonSerializer.convertJson(product));
    }
}
