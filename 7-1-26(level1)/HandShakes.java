import java.util.Scanner;

public class HandShakes {
    static int maxhandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numberOfStudents=sc.nextInt();
        System.out.println(maxhandshakes(numberOfStudents));
    }
}
