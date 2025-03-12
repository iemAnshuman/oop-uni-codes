import java.util.Scanner;

public class calculator{
  
  public int add(int a, int b){return a+b;}

  public int add(int a, int b, int c){
    return a+b+c;
  }

  public double add(){
    System.out.println("Enter a: ");
    Scanner s = new Scanner(System.in);
    
    double a = s.nextDouble();
    System.out.println("Enter b: ");
    double b = s.nextDouble();

    return (a+b);
  }

  public double add(double a, double b){
    return (a+b);
  }

  public double add(double a, double b, double c){
    return (a+b+c);
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter (int) (double)\n");

    System.out.println("Enter a: ");
    int a1 = s.nextInt();
    double a2 = s.nextDouble();
    System.out.println("Enter b: ");
    int b1 = s.nextInt();
    double b2 = s.nextDouble();
    System.out.println("Enter c: ");
    int c1 = s.nextInt();
    double c2 = s.nextDouble();

    calculator c = new calculator();

    System.out.println("int a+b: " + c.add(a1,b1));
    System.out.println("double a+b: " + c.add(a2,b2));
    System.out.println("int a+b+c: " + c.add(a1,b1,c1));
    System.out.println("double a+b+c: " + c.add(a2,b2,c2));
    
  }
}


