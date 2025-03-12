class Exp44{
  static String universityName = "UPES";
  String studentName;

  static void displayUni(){
    System.out.println(universityName);
  }

  public static void main(String[] args){
    Exp44 first = new Exp44();
    first.studentName = "Anshuman";
    Exp44 second = new Exp44();
    second.studentName = "Saral";
    Exp44 third = new Exp44();
    third.studentName = "Anadi";

    System.out.println(first.universityName);
    System.out.println(second.universityName);
    System.out.println(third.universityName);
    first.displayUni();
    second.displayUni();
    third.displayUni();
    System.out.println(first.studentName);
    System.out.println(second.studentName);
    System.out.println(third.studentName);
  }
}
