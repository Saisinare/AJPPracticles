import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pr10ExQ3 extends JFrame implements ActionListener {
    JTextField num1, num2;
    JLabel label = new JLabel();
    public pr10ExQ3() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        num1 = new JTextField();
        num2 = new JTextField();
        JButton button = new JButton("Multiply");
        num1.setColumns(10);
        num2.setColumns(10);
        add(num1);
        add(num2);
        add(button);
        button.addActionListener(this);
        add(label);
    }

    public static void main(String[] args) {
        new pr10ExQ3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String result =""+ (Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText()));
        label.setText(result);
    }
}
