import java.util.Scanner;

public class Table2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int arr[]=new int[4];
        for(int i=6;i<=9;i++){
            arr[i-6]=i*num;
        }
        for(int i=6;i<=9;i++){
            System.out.println(num+"*"+i+"="+arr[i-6]);
        }
    }
}
