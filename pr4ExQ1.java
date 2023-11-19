import java.awt.*;
import javax.swing.*;

class pr4ExQ1 extends JFrame {
    public pr4ExQ1() {
        setVisible(true);
        setSize(500, 500);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gb = new GridBagConstraints();
        JButton b1, b2, b3, b4, b5;
        b1 = new JButton("Button One");
        b2 = new JButton("Button Two");
        b3 = new JButton("Button Three");
        b4 = new JButton("Button Four");
        b5 = new JButton("Button Six");

        gb.gridx = 0;
        gb.gridy = 0;
        panel.add(b1, gb);

        gb.gridx = 1;
        gb.gridy = 0;
        panel.add(b2, gb);

        gb.gridx = 0;
        gb.gridy = 1;
        panel.add(b3, gb);

        gb.gridx = 1;
        gb.gridy = 1;
        panel.add(b4, gb);

        gb.fill = GridBagConstraints.HORIZONTAL;
        gb.gridx = 0;
        gb.gridy = 2;
        gb.gridwidth = 2; // Make it span across two columns
        panel.add(b5, gb);

        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new pr4ExQ1();
    }
}
