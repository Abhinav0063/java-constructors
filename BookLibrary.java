class Book {
    // Attributes with different access modifiers
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to access private author attribute
    public String getAuthor() {
        return author;
    }

    // Public method to modify private author attribute
    public void setAuthor(String author) {
        this.author = author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("\n📖 Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass demonstrating protected and public access
class EBook extends Book {
    private double fileSizeMB;

    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    public void displayEBookDetails() {
        System.out.println("\n📚 E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Public access
        System.out.println("Title: " + title); // Protected access (accessible in subclass)
        System.out.println("File Size: " + fileSizeMB + "MB");
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        book1.displayBookDetails();

        // Modify author name
        book1.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + book1.getAuthor());

        // EBook object
        EBook ebook1 = new EBook("978-3-16-148410-1", "Python for Data Science", "Alice Smith", 5.2);
        ebook1.displayEBookDetails();
    }
}
