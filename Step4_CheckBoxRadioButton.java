import javax.swing.*;
import java.awt.event.*;
public class Step4_CheckBoxRadioButton {
public static void main(String[] args) {
JFrame frame = new JFrame("Step 4: CheckBox & Radio");
JCheckBox cbJava = new JCheckBox("Java");
JCheckBox cbPython = new JCheckBox("Python");
JRadioButton rMale = new JRadioButton("Male");
JRadioButton rFemale = new JRadioButton("Female");
ButtonGroup genderGroup = new ButtonGroup();
genderGroup.add(rMale);
genderGroup.add(rFemale);
JButton button = new JButton("Submit");
cbJava.setBounds(50, 30, 100, 30);
cbPython.setBounds(150, 30, 100, 30);
rMale.setBounds(50, 70, 100, 30);
rFemale.setBounds(150, 70, 100, 30);
button.setBounds(100, 120, 100, 30);
button.addActionListener(e -> {
String skills = "Skills: ";
if (cbJava.isSelected()) skills += "Java ";
if (cbPython.isSelected()) skills += "Python ";
String gender = rMale.isSelected() ? "Male" : (rFemale.isSelected() ?
"Female" : "Not selected");
JOptionPane.showMessageDialog(frame, skills + "\nGender: " + gender);
});
frame.add(cbJava); frame.add(cbPython);
frame.add(rMale); frame.add(rFemale);
frame.add(button);
frame.setSize(350, 230);
frame.setLayout(null);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
