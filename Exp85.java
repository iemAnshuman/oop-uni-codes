import java.util.Scanner;

class Exp85{
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    try{
      int num = arr[i];
    } catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    } finally{
      System.out.println("Array Access attempted");
    }
  }
}
