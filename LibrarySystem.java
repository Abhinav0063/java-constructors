class Book {
    // Attributes
    String title;
    String author;
    double price;
    boolean available;

    // Constructor
    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("📚 You have borrowed: " + title);
        } else {
            System.out.println("⚠ Book is not available!");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("\n📖 Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a book object
        Book book1 = new Book("1984", "George Orwell", 12.99, true);

        // Display details and borrow book
        book1.displayDetails();
        book1.borrowBook();
        book1.displayDetails();
    }
}
