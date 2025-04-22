import javax.swing.*;
import java.awt.event.*;
public class Step5_ComboBoxList {
public static void main(String[] args) {
JFrame frame = new JFrame("Step 5: ComboBox & List");
String[] countries = {"India", "USA", "UK", "Germany"};
String[] colors = {"Red", "Green", "Blue", "Yellow"};
JComboBox<String> countryBox = new JComboBox<>(countries);
JList<String> colorList = new JList<>(colors);
JButton button = new JButton("Show Selection");
countryBox.setBounds(50, 30, 150, 30);
colorList.setBounds(50, 70, 100, 80);
button.setBounds(50, 170, 150, 30);
button.addActionListener(e -> {
String country = (String) countryBox.getSelectedItem();
String color = colorList.getSelectedValue();
JOptionPane.showMessageDialog(frame, "Country: " + country + "\nColor: " +
color);
});
frame.add(countryBox);
frame.add(colorList);
frame.add(button);
frame.setSize(300, 300);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}