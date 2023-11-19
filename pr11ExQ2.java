import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class pr11ExQ2 extends JFrame implements MouseListener {
    int count = 0;
    JLabel label = new JLabel("Mouse Click Count is 0");
    public pr11ExQ2() {
        setVisible(true);
        setSize(500, 500);
        addMouseListener(this);
        add(label);
    }

    public static void main(String[] args) {
        new pr11ExQ2();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        count++;
        label.setText("mouse Clicked "+count+" Times");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
