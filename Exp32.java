import java.util.Scanner;

class Exp32{
  public static void main(String[] args){
    int sum = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int num = sc.nextInt();

    while(num != 0){
      int rem = num%10;
      sum += rem;
      num = (num - rem)/10;
    }

    System.out.println(sum);
  }
}
