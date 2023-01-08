package theemployee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary = this.salary + this.salary * percent / 100;
        return this.salary;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Employee [id = ").append(this.id).append(", name = ").append(firstName).append(" ").append(lastName).append(", salary = ").append(this.salary).append("]");

        return str.toString();
    }
}