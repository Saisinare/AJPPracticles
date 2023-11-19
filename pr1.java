import java.awt.*;
public class pr1 extends Frame {
    public pr1 (){
        setVisible(true);
        setSize(500,500);
        Label lb = new Label();
        lb.setText("Welcome to Java");
        add(lb);
    }
    public static void main(String[] args) {
        new pr1();        
    }
}
