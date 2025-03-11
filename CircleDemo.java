class Circle {
    // Attribute
    double radius;

    // Default Constructor
    public Circle() {
        this(1.0); // Calls parameterized constructor
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("🟢 Circle Radius: " + radius);
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        // Creating objects
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.5);

        // Display details
        defaultCircle.displayRadius();
        customCircle.displayRadius();
    }
}
