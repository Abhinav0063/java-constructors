import java.util.Scanner;

class CarRental {
    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;


    // Default Constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
        this.costPerDay = 50.0; // Default cost per day
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("\n🚗 Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost per Day: $" + costPerDay);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for car rental details
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter Car Model: ");
        String carModel = scanner.nextLine();
        System.out.print("Enter Number of Rental Days: ");
        int rentalDays = scanner.nextInt();
        System.out.print("Enter Cost Per Day: ");
        double costPerDay = scanner.nextDouble();

        // Creating objects using different constructors
        CarRental defaultRental = new CarRental();
        CarRental userRental = new CarRental(customerName, carModel, rentalDays, costPerDay);

        // Displaying rental details
        defaultRental.displayRentalDetails();
        userRental.displayRentalDetails();

        scanner.close();
    }
}
