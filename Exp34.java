class Exp34{
  public static void main(String[] args){
    int count = 0;
    for(int i=1; i<1000; i++){
      for(int j=2; j<i; j++){
        if(i%j != 0 && j==i-1){
          count++;
        }
        else if(i%j == 0){
          break;
        }
      }
    }

    System.out.println(count+1);
  }
}
