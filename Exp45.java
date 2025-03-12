class Course{
  String name;
  int code;

  Course(String name, int code){
    this.name = name;
    this.code = code;
  }
}

public class Exp45{
  public static void main(String[] args){
    Course some = new Course("OOP", 123);
    System.out.println(some.name + " " + some.code);
  }
}
