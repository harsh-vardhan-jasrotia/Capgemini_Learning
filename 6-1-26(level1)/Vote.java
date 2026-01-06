import java.util.*;
public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        System.out.print("Enter age:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.println("Invalid age");
            }
            else if(arr[i]>=18){
                System.out.println("The student with age "+arr[i]+" can vote");
            }
            else{
                System.out.println("The student with age "+arr[i]+" cannot vote");
            }
        }
    }
}
