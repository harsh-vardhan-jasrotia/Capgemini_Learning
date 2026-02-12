import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.List;

class Student {
    public String name;
    public int age;
    public List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

public class MAIN{
    public static void main(String[] args) throws Exception {

        Student student = new Student(
                "Harsh",
                22,
                Arrays.asList("Math", "Computer Science", "Physics")
        );

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter()
                            .writeValueAsString(student);

        System.out.println(json);
    }
}
