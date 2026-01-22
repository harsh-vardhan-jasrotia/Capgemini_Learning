
public class Employee{
    String name;
    int salary;
    int id;

    void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Id: "+id);
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Aman";
        emp.salary=45000;
        emp.id=100;
        emp.displayDetails();
    }
}
