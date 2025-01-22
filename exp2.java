import java.util.Scanner;

class Exp2{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = scn.nextLine();

    System.out.println("Hello, " + name);

    System.out.println("ADDRESS:-");
    System.out.println("Enter State: ");
    String state = scn.nextLine();

    System.out.println("Enter city: ");
    String city = scn.nextLine();

    System.out.println("Locality: ");
    String locality = scn.nextLine();

    System.out.println("Nice to know, that you are from " + state + "\nAnd your city is:\t" + city + "\nlocality:\t" + locality);

    System.out.println("Birthday: 07\\12\\2004");

    System.out.println("\\n");
    System.out.println("\\\\");
    int a = 10, b = 20, c = 30;
    System.out.println("values are: " + a + ", " + b + ", " + c);
    System.out.println("values are added now: " + (a + b) + " and " + c);
  }
}
