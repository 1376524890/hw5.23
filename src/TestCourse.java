public class TestCourse {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Data Structures");

        // Add students to the course
        course.addStudent("John Doe");
        course.addStudent("Jane Smith");
        course.addStudent("Michael Johnson");

        // Display the students in the course
        System.out.println("Students in the course " + course.getCourseName() + ":");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Display the number of students in the course
        System.out.println("Number of students: " + course.getNumberOfStudents());

        // Drop a student from the course
        course.dropStudent("Jane Smith");

        // Display the students in the course after dropping a student
        System.out.println("Students in the course " + course.getCourseName() + " after dropping a student:");
        for (String student : course.getStudents()) {
            System.out.println(student);
        }

        // Display the number of students in the course after dropping a student
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}

