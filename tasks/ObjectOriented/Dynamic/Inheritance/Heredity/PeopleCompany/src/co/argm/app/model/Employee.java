package co.argm.app.model;

/**
 * Clase que representa a un empleado.
 */
public class Employee extends Person {
    private final int id;
    private double salary;

    public Employee(int id, double salary, String taxNum, String name, String surname, String address) {
        super(taxNum, name, surname, address);
        this.id = id;
        this.salary = salary;
    }

    /**
     * Método para aumentar el salario del empleado en un porcentaje dado.
     *
     * @param percent Porcentaje de aumento.
     */
    public void increaseSalary(int percent) {
        this.salary += salary * percent / 100;
    }

    @Override
    public String toString() {
        return "id=" + id + ", salary=" + salary + ", " + super.toString();
    }
}
