import java.util.Scanner;

class palindrome{
  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter your String: ");
    String s = scn.nextLine();

    int n = s.length();
    for(int i=0; i<n; i++)
    {
      if(s.charAt(i) != s.charAt(n-i-1))
      {
        System.out.println("Not Palindrome");
        return;
      }
    }
    System.out.println("Palindrome!");
  }
}
