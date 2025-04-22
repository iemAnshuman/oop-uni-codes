import javax.swing.*;

public class Exp92 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField display = new JTextField();
        display.setBounds(30, 20, 240, 30);
        display.setEditable(false);
        frame.add(display);

        JButton[] digits = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digits[i] = new JButton(String.valueOf(i));
            int col = (i == 0 ? 1 : (i-1) % 3);
            int row = (i == 0 ? 3 : (i-1) / 3);
            digits[i].setBounds(30 + col*60, 70 + row*50, 50, 40);
            frame.add(digits[i]);
        }

        String[] ops = { "+", "-", "*", "/", "=" };
        JButton[] buttons = new JButton[ops.length];
        for (int i = 0; i < ops.length; i++) {
            buttons[i] = new JButton(ops[i]);
            buttons[i].setBounds(210, 70 + i*50, 50, 40);
            frame.add(buttons[i]);
        }

        frame.setSize(320, 330);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        final StringBuilder current = new StringBuilder();
        final int[] first = new int[1];
        final String[] op = new String[1];

        for (JButton b : digits) {
            b.addActionListener(e -> {
                current.append(b.getText());
                display.setText(current.toString());
            });
        }

        for (int i = 0; i < 4; i++) {
            buttons[i].addActionListener(e -> {
                first[0] = Integer.parseInt(current.toString());
                op[0] = ((JButton)e.getSource()).getText();
                current.setLength(0);
            });
        }

        buttons[4].addActionListener(e -> {
            int second = Integer.parseInt(current.toString());
            int result = 0;
            switch (op[0]) {
                case "+" -> result = first[0] + second;
                case "-" -> result = first[0] - second;
                case "*" -> result = first[0] * second;
                case "/" -> result = first[0] / second;
            }
            display.setText(String.valueOf(result));
            current.setLength(0);
            current.append(result);
        });
    }
}
