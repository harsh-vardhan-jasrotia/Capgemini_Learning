import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployeeCSV {
    public static void main(String[] args) {
        String csvFile = "employees.csv";
        String line = "";
        String delimiter = ",";
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name to search: ");
        String searchName = sc.nextLine().trim();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                String name = data[1];
                String department = data[2];
                String salary = data[3];
                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found:");
                    System.out.println("Name: " + name);
                    System.out.println("Department: " + department);
                    System.out.println("Salary: " + salary);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Employee '" + searchName + "' not found.");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
