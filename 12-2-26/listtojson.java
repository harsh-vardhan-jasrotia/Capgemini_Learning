import com.google.gson.Gson;
import java.util.*;
public class listtojson {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Harsh", 50000));
        list.add(new Employee(2, "Ravi", 60000));

        Gson gson = new Gson();

        String jsonArray = gson.toJson(list);

        System.out.println(jsonArray);
    }
}
