abstract class Employee {
    String name;
    String role;

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

class Manager extends Employee {
    double fixedSalary;

    Manager(String name, double fixedSalary) {
        super(name, "Manager");
        this.fixedSalary = fixedSalary;
    }

    double calculateSalary() {
        return fixedSalary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: ₹" + calculateSalary());
    }
}

class Developer extends Employee {
    double hourlyRate;
    int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        super(name, "Developer");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: ₹" + calculateSalary());
    }
}

public class Exp72 {
    public static void main(String[] args) {
        Employee m = new Manager("Ravi Sharma", 80000);
        Employee d = new Developer("Anjali Mehta", 500, 160);

        m.displayDetails();
        System.out.println();
        d.displayDetails();
    }
}
