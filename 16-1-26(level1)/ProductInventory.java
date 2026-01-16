class Product {
    String productName;
    double price;
    static int totalProducts = 0; 
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: ₹" + price);
    }
        static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
    public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);
        p1.displayDetails();
        System.out.println();
        p2.displayDetails();
        System.out.println();
        Product.displayTotalProducts();
    }
}
