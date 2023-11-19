import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.*;
public class pr10XQ1 extends JFrame implements KeyListener {
    JLabel label = new JLabel();
    public pr10XQ1(){
        setVisible(true);
        setSize(500,500);
        add(label);
        addKeyListener(this);
    }
    public static void main(String[] args) {
        new pr10XQ1();
    }
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key is pressed");
        JOptionPane.showMessageDialog(this,"key is pressed");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
