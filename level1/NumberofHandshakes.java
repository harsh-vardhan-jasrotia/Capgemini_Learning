import java.util.Scanner;

public class NumberofHandshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Number of students:");
        int numberOfStudents=sc.nextInt();
        int handshakes=(numberOfStudents*(numberOfStudents-1))/2;
        System.out.println("Total number of handshakes "+handshakes);
    }
}
