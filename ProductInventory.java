class Product {
    // Instance Variables
    String productName;
    double price;

    // Class Variable (Shared among all instances)
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products on each creation
    }

    // Instance Method to Display Product Details
    public void displayProductDetails() {
        System.out.println("\n📦 Product Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method to Display Total Products
    public static void displayTotalProducts() {
        System.out.println("📊 Total Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Creating products
        Product p1 = new Product("Laptop", 1200.50);
        Product p2 = new Product("Smartphone", 800.99);

        // Display individual product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Display total products
        Product.displayTotalProducts();
    }
}
