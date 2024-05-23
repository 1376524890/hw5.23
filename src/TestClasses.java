public class TestClasses {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John Doe", "123 Main St", "555-1234", "john.doe@example.com");

        // Create a Student object
        Student student = new Student("Jane Smith", "456 Elm St", "555-5678", "jane.smith@example.com", Student.FRESHMAN);

        // Create an Employee object
        Employee employee = new Employee("Mark Johnson", "789 Oak St", "555-8765", "mark.johnson@example.com", "Room 101", 50000, new MyDate(2020, 5, 1));

        // Create a Faculty object
        Faculty faculty = new Faculty("Dr. Alice Brown", "321 Pine St", "555-4321", "alice.brown@example.com", "Room 202", 70000, new MyDate(2018, 8, 15), "MWF 10-12", "Professor");

        // Create a Staff object
        Staff staff = new Staff("Tom White", "654 Maple St", "555-9876", "tom.white@example.com", "Room 303", 40000, new MyDate(2019, 3, 10), "Manager");

        // Print the information of each object using the toString method
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
