public class Exp34 {
  public static boolean isPrime(int number) {
      if (number <= 1) {
          return false;
      }
      if (number == 2) {
          return true;
      }
      if (number % 2 == 0) {
          return false;
      }
      for (int i = 3; i * i <= number; i += 2) {
          if (number % i == 0) {
              return false;
          }
      }
      
      return true;
  }
  
  public static void main(String[] args) {
      int count = 0;
      for (int i = 1; i <= 1000; i++) {
          if (isPrime(i)) {
              System.out.print(i + " ");
              count++;
              if (count % 10 == 0) {
                  System.out.println();
              }
          }
      }
      
      System.out.println("\n\nTotal: " +count);
  }
}
