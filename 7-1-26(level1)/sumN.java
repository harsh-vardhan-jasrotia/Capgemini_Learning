import java.util.Scanner;

public class sumN {
    static int Sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        System.out.println("The sum of "+num+"natural numbers is "+Sum(num));
    }
}
