import java.awt.*;
public class pr1Q2 extends Frame {
    public pr1Q2(){
        setVisible(true);
        setSize(500,500);
        Checkbox ch1 = new Checkbox("Marathi");
        Checkbox ch2 = new Checkbox("Hindi");
        Checkbox ch3 = new Checkbox("English");
        setLayout(null);
        ch1.setBounds(100,100,100,10);
        ch2.setBounds(100,120,100,10);
        ch3.setBounds(100,140,100,10);
        add(ch1);
        add(ch2);
        add(ch3);
    }
    public static void main(String[] args) {
        new pr1Q2();
    }
}
