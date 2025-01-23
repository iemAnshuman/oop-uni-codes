class Days{
  public static void main(String[] args){
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    int day = a-1;
    if((b % 2 != 0 && b < 8) || (b >= 8 && b%2 == 0)){
      // Jan, Mar, May, July, aug, oct, dec
      day += 31;
    }
    else if(b == 2){
      day += 28;
    }
    else{
      day += 30;
    }

    // leap year
    int k = c%4;
    int years = c-1970;
    years += 4-k;
    int leaps = years/4;

    day = day + 365*years + leaps;

    System.out.println(day + " days");
    return;
  }
}
