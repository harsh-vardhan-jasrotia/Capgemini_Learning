import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your height in cms:");
        int height=sc.nextInt();
        double totalinches=height/2.54;
        int feet=(int)(totalinches/12);
        double inches=(totalinches%12);
        System.out.println("Your height in cms is "+height+" while in feet is "+feet+" and in inches is "+inches);
    }
}
