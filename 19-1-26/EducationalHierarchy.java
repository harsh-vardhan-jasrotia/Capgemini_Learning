class Course{
    String CourseName;
    int duration;
    Course(String a,int b){
        this.CourseName=a;
        this.duration=b;
    }
    void displayInfo(){
        System.out.println("Course name "+CourseName);
        System.out.println("Duration "+duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    String isrecorded;
    OnlineCourse(String a,int b,String c,String d){
        super(a,b);
        this.platform=c;
        this.isrecorded=d;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Platform "+platform);
        System.out.println("is Recorded "+isrecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    PaidOnlineCourse(String a,int b,String c,String d,int e,int f){
        super(a,b,c,d);
        this.fee=e;
        this.discount=f;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Fee "+fee);
        System.out.println("Discount "+discount);
    }
}
public class EducationalHierarchy {
    public static void main(String[] args) {
        Course c1=new Course("Java",6);
        Course c2=new OnlineCourse("C++", 5, "Online", "Yes");
        Course c3=new PaidOnlineCourse("Spring boot", 1, "Offline", "No", 5000, 10);
        c1.displayInfo();
        c2.displayInfo();
        c3.displayInfo();
    }
}
