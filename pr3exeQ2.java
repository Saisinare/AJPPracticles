import java.awt.BorderLayout;

import java.awt.Frame;

import java.awt.Label;
import java.awt.Panel;

public class pr3exeQ2 extends Frame {
    public pr3exeQ2() {
        setVisible(true);
        setSize(500, 500);
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label east = new Label("EAST");
        Label west = new Label("WEST");
        Label center = new Label("CENTER");
        Panel panel = new Panel();
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        Panel panel3 = new Panel();
        Panel panel4 = new Panel();
        panel.add(north);
        panel1.add(south);
        panel2.add(east);
        panel3.add(west);
        panel4.add(center);
        add(panel, BorderLayout.NORTH);
        add(panel1, BorderLayout.SOUTH);
        add(panel2, BorderLayout.EAST);
        add(panel3, BorderLayout.WEST);
        add(panel4, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new pr3exeQ2();
    }
}
