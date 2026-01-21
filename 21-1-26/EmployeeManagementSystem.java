interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        }
    }
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
    public abstract double calculateSalary();
}

class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int id, String name, double fixedSalary) {
        super(id, name, fixedSalary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String deptName) {
        this.department = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

public class EmployeeManagementSystem {
    public static void processEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                Department d = (Department) emp;
                System.out.println(d.getDepartmentDetails());
            }

            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Harsh", 50000);
        ((Department) e1).assignDepartment("IT");

        Employee e2 = new PartTimeEmployee(102, "Amit", 40, 500);

        Employee[] employees = { e1, e2 };

        processEmployees(employees);
    }
}
