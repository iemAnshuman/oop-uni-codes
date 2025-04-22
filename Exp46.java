public class Exp46 {
    int employeeID;
    String name;
    String department;
    private double salary;

    static int totalEmployees = 0;

    public Exp46() {
        this.employeeID = 0;
        this.name = "Unknown";
        this.department = "None";
        this.salary = 0.0;
        totalEmployees++;
    }

    public Exp46(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }

    public double calculateSalary() {
        return salary;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Exp46 emp1 = new Exp46();
        Exp46 emp2 = new Exp46(101, "Alice", "HR", 55000.0);
        Exp46 emp3 = new Exp46(102, "Bob", "IT", 70000.0);

        System.out.println("\nEmployee 1 Details (Default Constructor):");
        emp1.displayEmployeeInfo();

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeInfo();

        System.out.println("\nEmployee 3 Details:");
        emp3.displayEmployeeInfo();

        System.out.println("\n--- Total Employees ---");
        Exp46.displayTotalEmployees();

        double totalSalaryExpenditure = emp1.calculateSalary() + emp2.calculateSalary() + emp3.calculateSalary();
        System.out.println("\nTotal Salary Expenditure: $" + totalSalaryExpenditure);
    }
}
