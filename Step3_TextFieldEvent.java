import javax.swing.*;

public class Step3_TextFieldEvent {
    public static void main(String[] args) {
    JFrame frame = new JFrame("Step 3: Text Input");
    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");
    textField.setBounds(50, 50, 200, 30);
    button.setBounds(100, 100, 100, 30);
    button.addActionListener(e -> {
        String name = textField.getText();
        JOptionPane.showMessageDialog(frame, "Hello, " + name);
    });
    frame.add(textField);
    frame.add(button);
    frame.setSize(300, 250);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
