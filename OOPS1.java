class Student {
    String name;
    int age;
    int marks;

    // print data
    public void print_data() {
        System.out.println("Student data: " + this.name + " " + this.age + " " + this.marks);
    }

    // default constructor
    // Student() {
        
    // }

    // Parameterized constructor
    // Student(String name, int age, int marks) {
    //     this.name = name;
    //     this.age = age;
    //     this.marks = marks;
    // }

    // Copy constructor
    // Student(Student s2) {
    //     this.name = s2.name;
    //     this.age = s2.age;        
    //     this.marks = s2.marks;
    // }
}

public class OOPS1 {
    // public static void main(String[] args) {
    //     Student student1 = new Student();
    //     student1.name = "anshuman";
    //     student1.age = 20;
    //     student1.marks = 100;
    //     student1.print_data();
    // }

    // public static void main(String[] args) {
    //     Student student1 = new Student("anshuman", 20, 100);
    //     student1.print_data();
    // }

    // public static void main(String[] args) {
    //     Student s1 = new Student();
    //     s1.name = "anshuman";
    //     s1.age = 20;
    //     s1.marks = 100;
    //     s1.print_data();

    //     Student s2 = new Student(s1);
    //     s2.print_data();
    // }
}
