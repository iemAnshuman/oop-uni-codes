import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.*;

public class Exp93 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To‑Do List");
        frame.setLayout(null);

        JTextField field = new JTextField();
        field.setBounds(30, 20, 200, 25);

        JButton add = new JButton("Add");
        add.setBounds(240, 20, 80, 25);

        JButton remove = new JButton("Remove");
        remove.setBounds(30, 60, 290, 25);

        frame.add(field);
        frame.add(add);
        frame.add(remove);

        List<JCheckBox> tasks = new ArrayList<>();

        add.addActionListener(e -> {
            String text = field.getText().trim();
            if (!text.isEmpty()) {
                JCheckBox cb = new JCheckBox(text);
                int y = 100 + tasks.size() * 30;
                cb.setBounds(30, y, 290, 25);
                tasks.add(cb);
                frame.add(cb);
                frame.repaint();
                field.setText("");
            }
        });

        remove.addActionListener(e -> {
            Iterator<JCheckBox> it = tasks.iterator();
            while (it.hasNext()) {
                JCheckBox cb = it.next();
                if (cb.isSelected()) {
                    frame.remove(cb);
                    it.remove();
                }
            }
            for (int i = 0; i < tasks.size(); i++) {
                tasks.get(i).setBounds(30, 100 + i * 30, 290, 25);
            }
            frame.repaint();
        });

        frame.setSize(360, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
