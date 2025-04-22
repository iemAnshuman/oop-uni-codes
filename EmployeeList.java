import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return name + " | ID: " + id + " | Salary: " + salary;
    }
}

public class EmployeeList {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Aman", 101, 50000));
        list.add(new Employee("Parul", 102, 60000));
        list.add(new Employee("Divya", 103, 55000));

        // Update salary of ID 102
        for (Employee e : list) {
            if (e.id == 102) e.salary = 65000;
        }

        // Remove employee with ID 101
        list.removeIf(e -> e.id == 101);

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
