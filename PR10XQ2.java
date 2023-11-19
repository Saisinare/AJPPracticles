import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class PR10XQ2 extends JFrame {
    public PR10XQ2() {
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                String key = "" ;
                if (e.getKeyCode() == KeyEvent.VK_UP)
                    key= "upper arrow";
                    if (e.getKeyCode() == KeyEvent.VK_DOWN)
                    key= "Down arrow";
                    if (e.getKeyCode() == KeyEvent.VK_LEFT)
                    key= "Left arrow";        
                    if (e.getKeyCode() == KeyEvent.VK_RIGHT)
                    key= "Right arrow";
                    if(e.getKeyCode()>=KeyEvent.VK_F1 && e.getKeyCode()<=KeyEvent.VK_F12){
                        key = "F"+(e.getKeyCode()-KeyEvent.VK_F1+1);
                    }
                String msg = key +" is pressed";
                System.out.println(msg);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new PR10XQ2();
    }
}
