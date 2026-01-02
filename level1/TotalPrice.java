import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Unit price");
        double UnitPrice=sc.nextDouble();
        System.out.println("Quantity of an item");
        double Quantity=sc.nextDouble();
        double Total=UnitPrice*Quantity;
        System.out.println("The total purchase is INR "+Total+" if the quantity "+Quantity+" and unit price is INR "+UnitPrice);


    }
}
