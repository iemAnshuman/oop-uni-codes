public class Exp45 {
    String courseName;
    String courseCode;

    public Exp45(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        Exp45 course1 = new Exp45("Data Structures", "CS101");
        Exp45 course2 = new Exp45("Machine Learning", "ML202");

        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
    }
}
