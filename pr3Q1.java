import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class pr3Q1 extends Frame {


    public pr3Q1() {
        setVisible(true);
        setSize(500,500);
        setLayout(new GridLayout(3,5));
        Button b1,b2,b3,b4,b5 ;
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b1.setSize(50,50);
        b1.setSize(50,50);
        b1.setSize(50,50);
        b1.setSize(50,50);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);

    }

    public static void main(String[] args) {
        new pr3Q1();
    }
}
