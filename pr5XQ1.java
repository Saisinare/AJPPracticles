import javax.swing.*;
import java.awt.*;
public class pr5XQ1 extends JFrame{
    public pr5XQ1(){
        MenuBar menubar = new MenuBar();
        Menu menu = new Menu("Colors");
        menubar.add(menu);
        MenuItem blue = new MenuItem("blue");
        MenuItem red = new MenuItem("Red");
        MenuItem violet = new MenuItem("Violet");
        MenuItem black = new MenuItem("Black");
        black.setEnabled(false);
        menu.add(blue);
        menu.add(red);
        menu.add(violet);
        menu.addSeparator();
        menu.add(black);
        setVisible(true);
        setSize(500,500);
        setMenuBar(menubar);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 public static void main(String[] args) {
    new pr5XQ1();

 }    
}
