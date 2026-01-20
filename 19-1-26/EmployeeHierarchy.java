class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void showDetails(){
        System.out.println("Name "+name);
        System.out.println("ID "+id);
        System.out.println("Salary "+salary);
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(String name,int id,double salary,int teamsize){
        super(name,id,salary);
        this.teamsize=teamsize;
    }
    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Team Size "+teamsize);
    }
}
class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    } 
    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Language "+programmingLanguage);
    }
}
class Intern extends Employee{
    int duration;
    Intern(String name,int id,double salary,int duration){
        super(name,id,salary);
        this.duration=duration;
    }
    @Override
    void showDetails(){
        super.showDetails();
        System.out.println("Duration "+duration);
    }
}
public class EmployeeHierarchy {
    public static void main(String[] args) {
        Employee e1=new Manager("Aman",101,90000,5);
        Employee e2=new Developer("Saksham", 102,60000,"JAVA");
        Employee e3=new Intern("Naman",103 ,30000,5);
        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }
}
