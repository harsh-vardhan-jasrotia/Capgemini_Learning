import java.util.Scanner;
public class Park {
    static double rounds(double p){
        return 5000/p;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();
        double perimeter=side1+side2+side3;
        System.out.println("Number of rounds: "+rounds(perimeter));

    }    
}
