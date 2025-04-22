import java.awt.event.*;
import javax.swing.*;

public class Exp91 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 25);
        
        JTextField userField = new JTextField();
        userField.setBounds(150, 50, 150, 25);
        
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 100, 25);
        
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 100, 150, 25);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 150, 100, 30);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());
                if (user.equals("root") && pass.equals("0000")) { // linux supremacy 
                    JOptionPane.showMessageDialog(frame, "Login Successful");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
        
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        
        frame.setSize(380, 280);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
