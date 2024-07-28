class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Reference2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Andrew");

        System.out.println("We start the main");

        System.out.println("person.getName() = " + person.getName());
        System.out.println("Before invoking the test method");
        test(person);
        System.out.println("After invoking the test method");

        System.out.println("person.getName() = " + person.getName());

        System.out.println("Finish the main method with the modified person's data!");
    }

    public static void test(Person person) {
        System.out.println("We start the test");
        person.setName("Andrey");
        System.out.println("We finish the test");
    }
}
