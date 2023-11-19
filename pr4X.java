import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class pr4X extends JFrame implements ActionListener{
    CardLayout card;
    JButton jb1,jb2,jb3;
    Container c;
    public pr4X(){
        c = getContentPane();
        System.out.println(c);
        card = new CardLayout(40,30);
        c.setLayout(card);
        jb1= new JButton("Apple");
        jb2= new JButton("Boy");
        jb3= new JButton("Car");
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        c.add("a", jb1);
        c.add("b", jb2);
        c.add("c", jb3);
    }
    public static void main(String[] args) {
      pr4X cl = new pr4X();
      cl.setSize(400,400);
      cl.setVisible(true);
      cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }
}
