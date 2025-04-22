import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class lastStep {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Step 3: Text Input");
        JLabel label = new JLabel("Enter your name");
        label.setBounds(50, 10, 200, 25);

        JTextField textField = new JTextField();
        textField.setBounds(50, 35, 200, 25);

        JCheckBox cbJava = new JCheckBox("Java");
        cbJava.setBounds(50, 65, 80, 25);
        JCheckBox cbPython = new JCheckBox("Python");
        cbPython.setBounds(140, 65, 100, 25);

        JRadioButton rMale = new JRadioButton("Male");
        rMale.setBounds(50, 95, 80, 25);
        JRadioButton rFemale = new JRadioButton("Female");
        rFemale.setBounds(140, 95, 80, 25);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(rMale);
        genderGroup.add(rFemale);

        String[] countries = {"India", "USA", "UK", "Germany"};
        JComboBox<String> countryBox = new JComboBox<>(countries);
        countryBox.setBounds(50, 125, 200, 25);

        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JList<String> colorList = new JList<>(colors);
        colorList.setBounds(50, 155, 200, 60);

        JLabel label1 = new JLabel("Click anywhere!");
        label1.setBounds(80, 225, 200, 30);
        frame.add(label1); 

        frame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                label1.setText("Clicked at: " + e.getX() + ", " + e.getY());
            }
        });

        JButton button = new JButton("Submit");
        button.setBounds(90, 260, 100, 30); 

        button.addActionListener(e -> {
            String name = textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello, " + name);
        });

        frame.add(label);
        frame.add(textField);
        frame.add(cbJava);
        frame.add(cbPython);
        frame.add(rMale);
        frame.add(rFemale);
        frame.add(countryBox);
        frame.add(colorList);
        frame.add(button);
        frame.setSize(320, 350); 
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
