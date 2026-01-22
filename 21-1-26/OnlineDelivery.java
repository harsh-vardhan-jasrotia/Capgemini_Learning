interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {

    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; 
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }
}

class NonVegItem extends FoodItem implements Discountable {

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        double basePrice = getPrice() * getQuantity();
        return basePrice + 50;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; 
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}

public class OnlineDelivery {

    public static void processOrder(FoodItem[] items) {

        double grandTotal = 0;

        for (FoodItem item : items) {
            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }
            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }

        System.out.println("Grand Total: " + grandTotal);
    }

    public static void main(String[] args) {

        FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1);
        FoodItem[] order = { f1, f2 };
        processOrder(order);
    }
}

