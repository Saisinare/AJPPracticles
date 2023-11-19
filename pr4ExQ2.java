import java.awt.*;
import javax.swing.*;

public class pr4ExQ2 extends JFrame {
    public pr4ExQ2() {
        JLabel name = new JLabel("Name");
        JTextField nameField = new JTextField();
        nameField.setColumns(10);
        JLabel comment = new JLabel("Comment");
        JTextArea commentField = new JTextArea() ;
        commentField.setColumns(15);
        commentField.setRows(10);
        JButton button = new JButton("Submit");
        setLayout(new GridBagLayout());
        setSize(500, 500);
        setVisible(true);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(name, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(comment, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(commentField, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(button,gbc);

    }

    public static void main(String[] args) {
        new pr4ExQ2();
    }
}
