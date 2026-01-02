import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base:");
        double base=sc.nextDouble();
        System.out.println("Enter height:");
        double height=sc.nextDouble();
        double area=0.5*base*height;
        System.out.println("The area of triangle is "+area+" whose base is "+base+" and height is "+height);

    }
}
