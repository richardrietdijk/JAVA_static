public class Course {
    // Static variable
    static int totalCourses = 0;
    // Non-static variables
    String courseName;
    String instructor;
    // Constructor
    public Course(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
        totalCourses++;
    }
    // Static method
    public static int getTotalCourses() {
        return totalCourses;
    }
    // Non-static method
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using static variable and method
        System.out.println("Total courses offered: " + Course.getTotalCourses());

        // Creating instances of Course class
        Course course1 = new Course("MATH1208", "Zalak Shah");
        Course course2 = new Course("CS1102", "Lawal Idris Bagiwa");

        // Using non-static method
        System.out.println("Course information:");
        course1.displayCourseInfo();
        course2.displayCourseInfo();

        // Accessing static variable
        System.out.println("Total courses offered: " + Course.getTotalCourses());
    }
}
