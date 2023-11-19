import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class pr7ExQ1 extends JFrame {
    public pr7ExQ1() {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Bin");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("win.iso");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("mingw.exe");
        DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("javac.exe");
        root.add(child1);
        root.add(child2);
        root.add(child3);
        JTree tree = new JTree(root);
        add(tree);
    }

    public static void main(String[] args) {
        new pr7ExQ1();
    }

}
