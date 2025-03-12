import java.util.Scanner;

class BankAccount{
  private double balance;

  public BankAccount(){
    balance = 0.0;
  }

  public void addFund(){
    Scanner s = new Scanner(System.in);

    System.out.println("Enter amount to add: ");
    double amount = s.nextDouble();

    balance += amount;
    System.out.println("\nAmount added: " + amount + "rs");
  }

  protected void deduct(){
    Scanner s = new Scanner(System.in);

    System.out.println("Enter amount to deduct: ");
    double amount = s.nextDouble();

    balance -= amount;
    System.out.println("\nAmount deducted: " + amount + "rs");
  }

  void checkBalance(){
    System.out.println("Your balance is: " + balance);
  }
}

public class Exp42{
  public static void main(String[] args){
    BankAccount account = new BankAccount();

    account.addFund();
    account.deduct();
    account.checkBalance();
  }
}
