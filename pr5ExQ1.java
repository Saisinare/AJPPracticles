import java.awt.*;
import java.awt.event.*;

class pr5ExQ1 extends Frame{
    MenuBar mb;
    Menu mn;
    MenuItem m1,m2,m3,m4;
    MenuShortcut ms;
    public pr5ExQ1(){
        setTitle("MenuBar Demo");
        setSize(500,500);
        ms=new MenuShortcut(KeyEvent.VK_X);
        mn = new Menu("File");
        mb = new MenuBar();
        m1 = new MenuItem("New...");
        m2 = new MenuItem("Open...");
        m3 = new MenuItem("Save As...");
        m4 = new MenuItem("Exit",ms); 
        mn.add(m1);
        mn.add(m2);
        mn.add(m3);
        mn.addSeparator();
        mn.add(m4);
        mb.add(mn);
        setMenuBar(mb);
    }
    public static void main(String[] args) {
        pr5ExQ1 pr = new pr5ExQ1();
        pr.setVisible(true);

    }
}
