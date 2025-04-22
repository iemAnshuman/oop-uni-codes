class Worker {
    protected String name;
    protected double salaryRate;
    
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }
    
    public double computePay(int hours) {
        return hours * salaryRate;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary Rate: $" + salaryRate);
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double dailyRate) {
        super(name, dailyRate);
    }
    
    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8;
        return salaryRate * daysWorked;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Worker Type: Daily Worker");
        System.out.println("Daily Rate: $" + salaryRate);
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double weeklyRate) {
        super(name, weeklyRate);
    }
    
    @Override
    public double computePay(int hours) {
        return salaryRate;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Worker Type: Salaried Worker");
        System.out.println("Weekly Rate: $" + salaryRate);
    }
}

public class Exp53 {
    public static void main(String[] args) {
        DailyWorker dailyWorker = new DailyWorker("John Doe", 150.0);
        SalariedWorker salariedWorker = new SalariedWorker("Jane Smith", 1200.0);
        
        int[] hoursWorked = {20, 40, 45};
        
        System.out.println("----- Daily Worker -----");
        dailyWorker.displayInfo();
        for (int hours : hoursWorked) {
            System.out.println("Pay for " + hours + " hours: $" + dailyWorker.computePay(hours));
        }
        
        System.out.println("\n----- Salaried Worker -----");
        salariedWorker.displayInfo();
        for (int hours : hoursWorked) {
            System.out.println("Pay for " + hours + " hours: $" + salariedWorker.computePay(hours));
        }
    }
}
