class Calc{
  public static void main(String[] args){
    System.out.println("Values are: " + args[0] + args[1] + args[2]);
    System.out.println("Performing operation: " + args[1]);
      double ans;
      double a = Double.parseDouble(args[0]);
      double b = Double.parseDouble(args[2]);
      if(args[1].equals("+")){
        ans = a + b;
      }
      else if(args[1].equals("x")){
        ans = a * b;
      }
      else if(args[1].equals("-")){
        ans = a - b;
      }
      else if(args[1].equals("/")){
        ans = a / b;
      }
      else{
        System.out.println("Invalid operator");
        return;
      }
      System.out.println("Answer is " + ans);
    return;
  }
}
