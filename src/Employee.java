public class Employee extends Person {
    protected String office;
    protected double salary;
    protected MyDate hireDate;

    public Employee(String name, String address, String phone, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee: " + name;
    }
}

