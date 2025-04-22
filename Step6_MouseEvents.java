import javax.swing.*;
import java.awt.event.*;
public class Step6_MouseEvents {
public static void main(String[] args) {
JFrame frame = new JFrame("Step 6: Mouse Events");
JLabel label = new JLabel("Click anywhere!");
label.setBounds(80, 50, 200, 30);
frame.addMouseListener(new MouseAdapter() {
public void mouseClicked(MouseEvent e) {
label.setText("Clicked at: " + e.getX() + ", " + e.getY());
}
});
frame.add(label);
frame.setSize(300, 200);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}