class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName ="ABC Institute";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration +" months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }
    static void updateInstituteName(String InstituteName) {
        instituteName = InstituteName;
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Science", 8, 65000);
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
        System.out.println();
        Course.updateInstituteName("XYZ Technologies");
        System.out.println("After Institute Name Update:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
