import javax.swing.JFrame;
import javax.swing.*;
import java.awt.Font;

public class Temp{
  public static void main(String[] args){
    JFrame frame = new JFrame("Happing coding");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel label = new JLabel("this is a label ");
    label.setFont(new Font("Serif", Font.Bold, 36));
    label.setHorizontalAlignment(JLabel.CENTER);;
    frame.add(label);

    //JButton button1 = new JButton("Punch me!");
    //frame.add(button1);

    frame.setSize(300,300);
    frame.setVisible(true);
  }
}
