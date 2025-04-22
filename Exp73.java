interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    private double balance;

    Account(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class Exp73 {
    public static void main(String[] args) {
        Account account = new Account(1000);

        account.showBalance();
        account.deposit(500);
        account.withdraw(300);
        account.withdraw(1500);
        account.showBalance();
    }
    
}
