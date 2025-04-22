import java.util.Scanner;
import java.io.*;

class Exp86{
  public static void readFile(String fileName) throws FileNotFoundException{
    File file = new File(fileName);

    Scanner sc = new Scanner(file);
    while(sc.hasNextLine()){
      String line = sc.nextLine();
      System.out.println(line);
    }
    sc.close();
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String fileName = sc.nextLine();

    try{
      readFile(fileName);
    } catch (FileNotFoundException e){
      System.out.println("File not found!");
    } finally{
      System.out.println("File Operation attempted");
    }

    sc.close();
  }
}
