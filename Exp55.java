class Employee {
    protected String name;
    protected int empid;
    protected double salary;
    
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
            System.out.println("Salary increased by " + percentage + "% to $" + salary);
        } else {
            System.out.println("Percentage must be positive!");
        }
    }
    
    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String department;
    
    public Manager() {
        super();
        this.department = "Not Assigned";
    }
    
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}

public class Exp55 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("----- Default Employee -----");
        emp1.displayDetails();
        
        Employee emp2 = new Employee("John Doe", 1001, 50000.0);
        System.out.println("\n----- Employee with Parameters -----");
        emp2.displayDetails();
        
        emp2.increaseSalary(10);
        System.out.println("Updated Salary: $" + emp2.getSalary());
    
        Manager mgr1 = new Manager("Jane Smith", 2001, 75000.0, "Human Resources");
        System.out.println("\n----- Manager Details -----");
        mgr1.displayDetails();
        
        mgr1.increaseSalary(15);
        System.out.println("Updated Manager Salary: $" + mgr1.getSalary());
    }
}