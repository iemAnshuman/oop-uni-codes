import java.util.Scanner;

class Exp33{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int f1 = 0;
    int f2 = 1;

    if(n >= 1){
      System.out.println(f1);
    }
    if(n >= 2){
      System.out.println(f2);
    }
    if(n > 2){
      for(int i=0; i<n-2; i++){
        int f = f1 + f2;
        System.out.println(f);
        f1 = f2;
        f2 = f;
      }
    }
  }
}
