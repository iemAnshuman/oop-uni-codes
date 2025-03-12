class Week{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    if(a >= 1 && a <= 7){
      switch(a){
        case 1:
          System.out.println("Monday");
          break;
        case 2:
          System.out.println("Tuesday");
          break;
        case 3:
          System.out.println("Wed");
          break;
        case 4:
          System.out.println("Thurs");
          break;
        case 5:
          System.out.println("Fri");
          break;
        case 6:
          System.out.println("Sat");
          break;
        case 7:
          System.out.println("Sun");
          break;
      }
    }
    else{
      System.out.println("Error");
    }
    return;
  }
}
