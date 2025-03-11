class Books {
    // Attributes
    String title;
    String author;
    double price;

    // Default Constructor
    public Books() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\n📖 Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Creating objects
        Books defaultBook = new Books();
        Books customBook = new Books("The Alchemist", "Paulo Coelho", 15.99);

        // Display details
        defaultBook.displayDetails();
        customBook.displayDetails();
    }
}
