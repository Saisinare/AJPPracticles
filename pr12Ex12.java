import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class pr12Ex12 extends JFrame implements ActionListener {
    JTextField username = new JTextField();
    JPasswordField password = new JPasswordField();
    JLabel label = new JLabel();

    public pr12Ex12() {
        password.setColumns(10);
        username.setColumns(10);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        add(username);
        add(password);
        JButton button = new JButton("Validate");
        button.addActionListener(this);
        add(button);
        add(label);
    }

    public static void main(String[] args) {
        new pr12Ex12();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = username.getText().trim();
        char[] pass = password.getPassword();
        String Pass = new String(pass).trim();
        System.out.println(Pass);
        System.out.println(user);
        if (Pass.length() < 6) {
            label.setText("password Length must be >6 characters");
        } else {
            if (user.equals("sai@123") && Pass.equals("pass@123"))
                label.setText("password is valid");
            else
                label.setText("password is invalid");

        }
    }
}
