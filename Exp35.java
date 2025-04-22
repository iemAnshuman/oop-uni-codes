public class Exp35 {
  public static void main(String[] args) {
      int[] arr = {2, 3, 2, 5, 2, 6};
      int target = 2;
      int count = 0;

      for (int num : arr) {
          if (num == target) {
              count++;
          }
      }
      System.out.println(target + " appears " + count + " times.");
  }
}
