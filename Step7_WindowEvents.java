import java.awt.event.*;
import javax.swing.*;
public class Step7_WindowEvents {
public static void main(String[] args) {
JFrame frame = new JFrame("Step 7: Window Events");
JLabel label = new JLabel("Try minimizing or closing this window.");
label.setBounds(30, 50, 300, 30);
frame.addWindowListener(new WindowAdapter() {
public void windowIconified(WindowEvent e) {
System.out.println("Window Minimized");
}
public void windowDeiconified(WindowEvent e) {
System.out.println("Window Restored");
}
public void windowClosing(WindowEvent e) {
System.out.println("Window is closing...");
JOptionPane.showMessageDialog(frame, "Closing App...");
System.exit(0);
}
});
frame.add(label);
frame.setSize(350, 200);

frame.setLayout(null);
frame.setVisible(true);
}
}