import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class pr12XQ1 extends JFrame{
    public pr12XQ1(){
        JPasswordField password = new JPasswordField();
        password.setEchoChar('#');
        add(password);
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(500,500);
    }
    public static void main(String[] args) {
        new pr12XQ1();
    }
}
