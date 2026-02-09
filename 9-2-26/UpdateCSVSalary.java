import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSVSalary {
    public static void main(String[] args) {
        String inputFile = "employees.csv";      
        String outputFile = "updated_employees.csv"; 
        String line = "";
        String delimiter = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            String header = br.readLine();
            bw.write(header);
            bw.newLine();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(delimiter);
                String id = data[0];
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);
                if (department.equalsIgnoreCase("IT")) {
                    salary = salary * 1.10;
                }
                bw.write(id + delimiter + name + delimiter + department + delimiter + (int)salary);
                bw.newLine();
            }
            System.out.println("CSV updated successfully. New file: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
