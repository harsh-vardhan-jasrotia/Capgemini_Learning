import java.util.Scanner;

public class VarDistanceConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in kms:");
        double km=sc.nextDouble();
        double miles=km/1.6;
        System.out.println("For the given distance "+km+"kms.The miles distance is "+miles+" miles");

    }
}
