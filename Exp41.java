public class Exp41 {
    String name;
    int age;
    public Exp41() {
        name = "Unknown";
        age = 0;
    }
    public Exp41(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Exp41 student1 = new Exp41();
        System.out.println("Student 1");
        student1.displayDetails();

        Exp41 student2 = new Exp41("Anshuman", 20);
        System.out.println("\nStudent 2");
        student2.displayDetails();
    }
}
