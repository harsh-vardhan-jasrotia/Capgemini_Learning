import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[11];
        System.out.print("Enter heights:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The mean heigt of the football team is "+sum/11);
    }
}
