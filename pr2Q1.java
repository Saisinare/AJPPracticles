import java.applet.*;
import java.awt.List;
/*<applet code=pr2Q1 height=500 width=500></applet> */
public class pr2Q1 extends Applet {
    public void init(){
        List choice = new List(2,true);
        setVisible(true);
        setSize(500, 500);
        setLayout(null);
        choice.add("Summer");
        choice.add("Winter");
        choice.add("Rainy");
        choice.setBounds(100,100,100,100);
        add(choice);
    }
}
