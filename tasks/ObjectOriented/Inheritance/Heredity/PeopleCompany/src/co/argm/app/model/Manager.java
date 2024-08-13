package co.argm.app.model;

/**
 * Clase que representa a un gerente, que es un tipo de empleado.
 */
public class Manager extends Employee {
    private double budget;

    public Manager(double budget, int id, double salary, String taxNum, String name, String surname, String address) {
        super(id, salary, taxNum, name, surname, address);
        this.budget = budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "budget=" + budget + ", " + super.toString();
    }
}
