import java.awt.event.*;
import javax.swing.*;
public class Step2_ButtonClickEvent {
public static void main(String[] args) {
    JFrame frame = new JFrame("Step 2: Button Event");
    JButton button = new JButton("Click Me");
    button.setBounds(100, 100, 120, 40);
    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "Button Clicked!");
        }
    }
    );
    frame.add(button);
    frame.setSize(300, 300);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}