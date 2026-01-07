import java.util.Scanner;

public class SimpleI {
    static int SimpleInterest(int p,int r,int t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principal,rate and time");
        int principal=sc.nextInt();
        int rate=sc.nextInt();
        int time=sc.nextInt();
        System.out.println("The Simple Interest is "+SimpleInterest(principal,rate,time)+" for Principal "+principal+", Rate of interest "+rate+" and Time "+time);
    }
}
