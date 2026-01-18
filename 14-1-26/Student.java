
public class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;

    String name;
    final int rollNumber; 
    char grade;

    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;   
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void displayDetails(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollNumber);
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Object is not a Student");
        }
    }

    void updateGrade(Object obj, char newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Cannot update grade. Not a Student object.");
        }
    }
}

