import javax.swing.*;
import java.awt.*;

public class pr6ExQ2 extends JFrame {
    public pr6ExQ2() {

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(10, 10));
        for (int i = 0; i < 100; i++) {
            contentPanel.add(new JButton("Button " + i));
        }
        JScrollPane scrollPane = new JScrollPane(contentPanel);
        add(scrollPane);
        setVisible(true);
        setSize(500,500);
    }

    public static void main(String[] args) {
        new pr6ExQ2();
    }
}
