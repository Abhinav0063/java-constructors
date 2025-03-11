class Vehicle {
    // Instance Variables
    String ownerName;
    String vehicleType; // Car, Bike, Truck, etc.

    // Class Variable (Shared among all instances)
    static double registrationFee = 100.0; // Default fee

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method to Display Vehicle Details
    public void displayVehicleDetails() {
        System.out.println("\n🚗 Vehicle Registration Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class Method to Update Registration Fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        // Display initial vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee
        Vehicle.updateRegistrationFee(120.0);

        // Display updated vehicle details
        System.out.println("\n💰 Updating Registration Fee...");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
