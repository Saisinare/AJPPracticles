import java.awt.Button;
import java.awt.Frame;

public class pr1Q3 extends Frame {
    public pr1Q3() {
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        Button b1 = new Button("OK");
        Button b2 = new Button("RESET");
        Button b3 = new Button("CANCLE");
        b1.setBounds(100, 100, 100, 30);
        b2.setBounds(100, 135, 100, 30);
        b3.setBounds(100, 170, 100, 30);
        add(b1);
        add(b2);
        add(b3);
        // b1.setBounds(100, 100, 100, 30);
        // b2.setBounds(100, 135, 100, 30);
        // b3.setBounds(100, 170, 100, 30);
    }

    public static void main(String[] args) {
        new pr1Q3();
    }
}
