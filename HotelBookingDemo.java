class HotelBooking {
    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Default Constructor
    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized Constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy Constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBooking() {
        System.out.println("\n🏨 Hotel Booking:");
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingDemo {
    public static void main(String[] args) {
        // Creating objects
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking customBooking = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking copiedBooking = new HotelBooking(customBooking);

        // Display details
        defaultBooking.displayBooking();
        customBooking.displayBooking();
        copiedBooking.displayBooking();
    }
}
