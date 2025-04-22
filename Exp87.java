import java.util.Scanner;
import java.io.*;

public class Exp87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            String name = sc.nextLine();
            String roll = sc.nextLine();
            String grade = sc.nextLine();
            String studentRecord = "Name: " + name + ", Roll Number: " + roll + ", Grade: " + grade + "\n";
            FileWriter writer = new FileWriter("student.txt", true);
            writer.write(studentRecord);
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
