public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phone, email, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff: " + name;
    }
}

