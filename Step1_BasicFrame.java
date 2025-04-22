import javax.swing.*;
public class Step1_BasicFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Step 1: Basic Frame");
        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}