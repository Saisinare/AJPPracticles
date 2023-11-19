import java.awt.FlowLayout;

import javax.swing.*;
public class pr6ExQ1 extends JFrame{
    public pr6ExQ1(){
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        JComboBox<String> combo = new JComboBox<>();
        combo.addItem("maharastra");
        combo.addItem("Goa");
        combo.addItem("Delhi");
        combo.addItem("UP");
        add(combo);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 public static void main(String[] args) {
    new pr6ExQ1();
 }   
}
