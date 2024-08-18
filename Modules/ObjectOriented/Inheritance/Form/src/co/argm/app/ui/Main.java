package co.argm.app.ui;

import co.argm.app.model.form.Input;
import co.argm.app.model.form.Item;
import co.argm.app.model.form.Select;
import co.argm.app.model.form.Textarea;
import co.argm.app.model.form.select.Option;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.err;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Input username = new Input("username", "text", "john.doe");
        username.addValidator(new Required());

        Input password = new Input("password", "password", "a1b2c3");
        password.addValidator(new Required()).addValidator(new Size(6, 12));

        Input email = new Input("email", "email", "John@doe.com");
        email.addValidator(new Required()).addValidator(new Email());

        Input age = new Input("age", "number", "28");
        age.addValidator(new Num());

        Textarea experience = new Textarea("exp", "...more than 10 years of experience...", 5, 9);

        Select language = new Select("language");
        language.addValidator(new NonNull());

        language.addOption(new Option("1", "java")).addOption(new Option("2", "Python",
                        true)).addOption(new Option("3", "JavaScript"))
                .addOption(new Option("4", "TypeScript")).addOption(new Option("5", "PHP"));

        Item greet = new Item("Greet", "Hello, how is this field disabled") {
            @Override
            public String drawHtml() {
                return "<input disabled name= " + name + "' value=\"" + value + "\">";
            }
        };

        List<Item> items = Arrays.asList(username, password, email, age, experience, language, greet);

        items.forEach(i -> out.println(i.drawHtml() + "\n<br>"));

        items.forEach(i -> {
            if (!i.isValid()) {
                i.getErrors().forEach(err::println);
            }
        });
    }
}
