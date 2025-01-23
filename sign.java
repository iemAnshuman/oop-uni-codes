class Sign{
  static public void main(String[] args){
    double a = Double.parseDouble(args[0]);

    if(a > 0){
      System.out.println("Positive!");
    }
    else if(a < 0){
      System.out.println("Negative!");
    }
    else if(a == 0){
      System.out.println("Zero");
    }
    else{
      System.out.println("Error");
    }

    return;
  }
}
