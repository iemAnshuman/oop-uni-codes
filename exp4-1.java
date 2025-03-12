import java.util.Scanner;

class Student{
  String name;
  int age;

  Student(){
    name = "Anshuman";
    age = 20;
  }

  Student(String name, int age){
    this.name = name;
    this.age = age;
  }

  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter name: ");
    String name = s.nextLine();
    System.out.println("Enter age: ");
    int age = s.nextInt();

    Student obj1 = new Student();
    Student obj2 = new Student(name, age);
    System.out.println("My name: " + obj1.name + "\nMy age: " + obj1.age);
    System.out.println("Your name: " + obj2.name + "\nYour age: " + obj2.age);
  }
}
