import java.awt.*;
public class pr3exe extends Frame{
    public pr3exe(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        setVisible(true);
        GridLayout layout = new GridLayout(3,2,5,5);
        setLayout(layout);

    }
    public static void main(String[] args) {
        new pr3Q1();
    }
}
