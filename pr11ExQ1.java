import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class pr11ExQ1 extends JFrame implements MouseListener {
    public pr11ExQ1() {
        setSize(500, 500);
        setVisible(true);
        addMouseListener(this);
    }

    public static void main(String[] args) {
        new pr11ExQ1();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        getContentPane().setBackground(Color.BLUE);
        System.out.println("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        getContentPane().setBackground(Color.RED);
        System.out.println("mouse pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        getContentPane().setBackground(Color.GREEN);
        System.out.println("mouse released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
