public class Item {
    int itemCode;
    String itemName;
    double price;

    double calculatePrice(int quantity){
        return price*quantity;

    }
    public static void main(String[] args) {
        Item itm=new Item();
        itm.itemCode=100;
        itm.itemName="Biscuits";
        itm.price=100;
        int quantity=5;
        System.out.println("Quantity:"+quantity);
        System.out.println("Total:"+itm.calculatePrice(quantity));

    }
}
