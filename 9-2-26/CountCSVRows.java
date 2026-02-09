import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CountCSVRows {
    public static void main(String[] args) {
        String csvFile = "employees.csv";
        String line = "";
        int rowCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                rowCount++;
            }
        System.out.println("Number of records (excluding header): " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
