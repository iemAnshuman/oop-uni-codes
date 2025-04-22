class Person {
    protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

class Staff extends Person {
    protected String staffId;
    protected String department;

    public Staff(String name, int age, String address, String staffId, String department) {
        super(name, age, address);
        this.staffId = staffId;
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Staff");
        System.out.println("Staff ID: " + staffId);
        System.out.println("Department: " + department);
    }
}

class Professor extends Staff {
    private String specialization;

    public Professor(String name, int age, String address, String staffId, String department, String specialization) {
        super(name, age, address, staffId, department);
        this.specialization = specialization;
    }

    public void conductLecture() {
        System.out.println("Professor " + name + " is conducting a lecture on " + specialization);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Professor");
        System.out.println("Specialization: " + specialization);
    }
}

class Student extends Person {
    protected String studentId;
    protected String course;

    public Student(String name, int age, String address, String studentId, String course) {
        super(name, age, address);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Student");
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int age, String address, String studentId, String course, String researchTopic) {
        super(name, age, address, studentId, course);
        this.researchTopic = researchTopic;
    }

    public void submitThesis() {
        System.out.println("Graduate student " + name + " is submitting thesis on " + researchTopic);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Level: Graduate Student");
        System.out.println("Research Topic: " + researchTopic);
    }
}

public class Exp57 {
    public static void main(String[] args) {
        Professor professor = new Professor("Dr. Smith", 45, "123 Academic St", "P101", "Computer Science", "Artificial Intelligence");
        GraduateStudent gradStudent = new GraduateStudent("John Doe", 25, "456 Scholar Ave", "G202", "Computer Science", "Machine Learning Applications");

        System.out.println("----- University Personnel -----");

        System.out.println("Professor:");
        professor.displayDetails();
        professor.conductLecture();
        System.out.println("------------------------");

        System.out.println("Graduate Student:");
        gradStudent.displayDetails();
        gradStudent.submitThesis();
        System.out.println("------------------------");
    }
}
