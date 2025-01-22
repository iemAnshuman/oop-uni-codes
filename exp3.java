class Exp3{
  public static void main(String args[]){
    int num_stars = 50;
    String stars = "*";
    for(int i=0; i<num_stars; i++)
    {
      stars += "*";
    }

    String name = "Anshuman Agrawal";
    int roll = 2142232078;
    int sap = 500126680;
    int m1 = 99;
    int m2 = 99;
    int m3 = 99;
    int total = 300;

    System.out.println(stars);

    System.out.println("\t\tUPES GRADESHEET\n");
    System.out.println("\t\t  2024-25\n");
    System.out.println("\t\t Semester IV\n\n");

    System.out.println("Name: " + name);
    System.out.println("Roll No: " + roll);
    System.out.println("Sap Id: " + sap);
    System.out.println("Marks: " + (m1+m2+m3) + "\n");

    System.out.println("\t\tMaths: " + m1);
    System.out.println("\t\tCS: " + m2);
    System.out.println("\t\tLogic: " + m3);

    System.out.println("==> Total Marks: " + (m1+m2+m3) + " out of " + total);
    System.out.println("\t\tResult: Pass");

    System.out.println(stars);
  }
}
