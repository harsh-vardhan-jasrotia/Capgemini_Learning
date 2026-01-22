
public class MobilePhone {
    String brand;
    String model;
    double price;
    void displayDetails(){
        System.out.println("Brandname:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args) {
        MobilePhone mp=new MobilePhone();
        mp.brand="Samsung";
        mp.model="Galaxy S21";
        mp.price=70000.00;
        mp.displayDetails();
    }
}
