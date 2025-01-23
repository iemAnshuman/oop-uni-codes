class Marks{
  public static void main(String[] args){
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    if(a > 100 || b > 100 || c > 100 || a < 0 || b < 0 || c < 0){
      System.out.println("Invalid arguments!");
      return;
    }
    double avg = (a + b + c) / 3.0;

    if(avg >= 90){
      System.out.println("Grade A");
    } else if(avg >= 75){
      System.out.println("Grade B");
    } else if(avg >= 50){
      System.out.println("Grade C");
    } else{
      System.out.println("Grade F");
    }
    
    return;
  }
}
