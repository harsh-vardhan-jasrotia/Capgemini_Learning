import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class WriteCSVFile {
    public static void main(String[] args) {
        String csvFile = "employees.csv"; 
        String delimiter = ",";
        String[][] employees = {
            {"1", "Alice", "HR", "50000"},
            {"2", "Bob", "IT", "60000"},
            {"3", "Charlie", "Finance", "70000"},
            {"4", "David", "Marketing", "55000"},
            {"5", "Eve", "IT", "65000"}
        };
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            bw.write("ID,Name,Department,Salary");
            bw.newLine();
            for (String[] emp : employees) {
                bw.write(String.join(delimiter, emp));
                bw.newLine();
            }
            System.out.println("CSV file created and data written successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
