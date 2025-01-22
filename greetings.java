import java.util.Scanner;

class greetings{
  public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter your name: ");
    String s = scn.nextLine();

    System.out.println("Hello, " + s);
    scn.close();
  }
}
