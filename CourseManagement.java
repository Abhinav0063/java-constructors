class Course {
    // Instance Variables
    String courseName;
    int duration; // Duration in months
    double fee;

    // Class Variable (Shared among all instances)
    static String instituteName = "Global Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method to Display Course Details
    public void displayCourseDetails() {
        System.out.println("\n📚 Course Details:");
        System.out.println("Institute: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
    }

    // Class Method to Update Institute Name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        // Creating courses
        Course c1 = new Course("Java Programming", 3, 300);
        Course c2 = new Course("Data Science", 6, 700);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Tech Learning Hub");

        // Display course details after institute name change
        System.out.println("\n🏫 Updating Institute Name...");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
