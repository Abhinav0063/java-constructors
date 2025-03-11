class Student {
    // Attributes with different access modifiers
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to access private CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to modify private CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("⚠ Invalid CGPA! Please enter a value between 0 and 10.");
        }
    }

    // Display Student details
    public void displayStudent() {
        System.out.println("\n🎓 Student Details:");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass demonstrating protected access
class PostgraduateStudent extends Student {
    private String researchTopic;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA);
        this.researchTopic = researchTopic;
    }

    public void displayPGDetails() {
        System.out.println("\n🎓 Postgraduate Student:");
        System.out.println("Roll Number: " + rollNumber); // Public access
        System.out.println("Name: " + name); // Protected access (accessible in subclass)
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 9.2);
        student1.displayStudent();

        // Modify CGPA
        student1.setCGPA(8.5);
        System.out.println("Updated CGPA: " + student1.getCGPA());

        // Postgraduate student object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.5, "Artificial Intelligence");
        pgStudent.displayPGDetails();
    }
}
