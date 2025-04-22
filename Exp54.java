import java.util.Scanner;

class TrunkCall {
    protected int minutes;
    protected String callType;
    protected double rate;
    
    public TrunkCall(int minutes, double rate, String callType) {
        this.minutes = minutes;
        this.rate = rate;
        this.callType = callType;
    }
    
    public double calculateCharges() {
        return minutes * rate;
    }
    
    public void displayDetails() {
        System.out.println("Call Type: " + callType);
        System.out.println("Duration: " + minutes + " minutes");
        System.out.println("Rate: $" + rate + " per minute");
        System.out.println("Total Charge: $" + calculateCharges());
    }
}

class OrdinaryCall extends TrunkCall {
    public OrdinaryCall(int minutes) {
        super(minutes, 1.0, "Ordinary");
    }
    
    @Override
    public double calculateCharges() {
        return minutes * rate;
    }
}

class UrgentCall extends TrunkCall {
    public UrgentCall(int minutes) {
        super(minutes, 2.0, "Urgent");
    }
    
    @Override
    public double calculateCharges() {
        return minutes * rate;
    }
}

class LightningCall extends TrunkCall {
    public LightningCall(int minutes) {
        super(minutes, 3.0, "Lightning");
    }
    
    @Override
    public double calculateCharges() {
        return minutes * rate;
    }
}

public class Exp54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter call duration in minutes: ");
        int callDuration = scanner.nextInt();
        
        System.out.println("Select call type:");
        System.out.println("1. Ordinary");
        System.out.println("2. Urgent");
        System.out.println("3. Lightning");
        int selection = scanner.nextInt();
        
        TrunkCall call = null;
        
        switch (selection) {
            case 1:
                call = new OrdinaryCall(callDuration);
                break;
            case 2:
                call = new UrgentCall(callDuration);
                break;
            case 3:
                call = new LightningCall(callDuration);
                break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }
        
        System.out.println("\n----- Call Details -----");
        call.displayDetails();
        
        scanner.close();
    }
}
