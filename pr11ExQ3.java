
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class pr11ExQ3 extends JFrame implements MouseMotionListener {
    JLabel label = new JLabel();
    public pr11ExQ3(){
        setVisible(true);
        setSize(500,500);
        addMouseMotionListener(this);
        add(label);
    }
    public static void main(String[] args) {
        new pr11ExQ3();
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Has Been Drgged");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Has Been Moved");
    }
}
