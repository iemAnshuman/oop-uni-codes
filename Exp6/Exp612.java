import Exp6.Exp611;

public class Exp612 {
    public static void main(String[] args) {
        System.out.println("Testing Balance package...");

        Exp611 myAccount = new Exp611(1000.0);

        System.out.println("Initial balance:");
        myAccount.showBalance();

        myAccount.deposit(500.0);
        System.out.println("After deposit:");
        myAccount.showBalance();

        myAccount.withdraw(200.0);
        System.out.println("After withdrawal:");
        myAccount.showBalance();

        System.out.println("Attempting to withdraw more than balance:");
        myAccount.withdraw(2000.0);
        myAccount.showBalance();
    }
}