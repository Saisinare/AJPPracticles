import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
/* <applet code=pr6XQ1 width=500 height=500></applet> */
public class pr6XQ1 extends JApplet implements ItemListener {
    JComboBox<String> combobox = new JComboBox<>();
    JLabel label = new JLabel();
    public void init() {
        combobox.addItem("Solapur");
        combobox.addItem("Pune");
        combobox.addItem("Banglore");
        combobox.addItem("Mumbai");
        combobox.addItemListener(this);
        setLayout(new FlowLayout());
        add(combobox);
        add(label);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        label.setText("You are in "+(String)combobox.getSelectedItem());
    }
}
