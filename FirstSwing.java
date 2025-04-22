import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FirstSwing{
  public static void main(String[] args){
    JFrame frame = new JFrame("First Swing App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout(10, 10)); 
    
    JLabel label = new JLabel("Welcome!");
    label.setFont(new Font("Serif", Font.BOLD, 36));
    label.setHorizontalAlignment(JLabel.CENTER);
    frame.add(label, BorderLayout.NORTH);
    
    JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    JTextField textField = new JTextField(10);
    textField.setFont(new Font("Serif", Font.BOLD, 24));
    inputPanel.add(textField);
    
    JButton button = new JButton("Click me!");
    button.setFont(new Font("Serif", Font.BOLD, 12));
    inputPanel.add(button);
    
    frame.add(inputPanel, BorderLayout.WEST);
    
    JTextArea textArea = new JTextArea(10, 20);
    textArea.setFont(new Font("Serif", Font.BOLD, 24));
    frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
    
    JPanel southPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    
    JCheckBox checkBox = new JCheckBox("Don't check me!");
    checkBox.setFont(new Font("Serif", Font.BOLD, 12));
    southPanel.add(checkBox);
    
    JComboBox<String> comboBox = new JComboBox<>();
    comboBox.setFont(new Font("Serif", Font.BOLD, 24));
    comboBox.addItem("Item 1");
    comboBox.addItem("Item 2");
    comboBox.addItem("Item 3");
    southPanel.add(comboBox);
    
    frame.add(southPanel, BorderLayout.SOUTH);
    
    frame.pack(); 
    frame.setVisible(true);
  }
}