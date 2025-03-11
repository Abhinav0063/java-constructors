class Employee {
    // Attributes with different access modifiers
    public int employeeID;     // Accessible everywhere
    protected String department;  // Accessible in the same package and subclasses
    private double salary;        // Accessible only within Employee class

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify private salary attribute
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
            System.out.println("💰 Salary updated successfully!");
        } else {
            System.out.println("⚠ Invalid Salary! Salary cannot be negative.");
        }
    }

    // Public method to retrieve the salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("\n👔 Employee Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass demonstrating protected and public access
class Manager extends Employee {
    private String team;  // Extra attribute for Manager

    // Constructor
    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("\n🧑‍💼 Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Public access
        System.out.println("Department: " + department);  // Protected access
        System.out.println("Team: " + team);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee(101, "IT", 60000);
        emp1.displayEmployeeDetails();

        // Modify salary
        emp1.setSalary(65000);
        System.out.println("Updated Salary: $" + emp1.getSalary());

        // Creating a Manager object
        Manager mgr1 = new Manager(201, "Finance", 90000, "Investment Team");
        mgr1.displayManagerDetails();
    }
}
