package src._30javaSwing;

import java.awt.BorderLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class MyFrame18 extends JFrame {

  JTree tree;
  JLabel label;

  MyFrame18() {
    super("Border");
    String path = "abdul-bari/src";
    DefaultMutableTreeNode root = new DefaultMutableTreeNode(path);
    File f = new File(path);
    for (File x : f.listFiles()) {
      if (x.isDirectory()) {
        DefaultMutableTreeNode subFolder = new DefaultMutableTreeNode(x.getName());
        for (File y : x.listFiles()) {
          subFolder.add(new DefaultMutableTreeNode(y.getName()));
        }
        root.add(subFolder);
      } else
        root.add(new DefaultMutableTreeNode(x.getName()));
    }

    tree = new JTree(root);
    label = new JLabel("No file is selected");

    SelectFileHandler fh = new SelectFileHandler();
    tree.addTreeSelectionListener(fh);
    JScrollPane sp = new JScrollPane(tree);

    add(sp, BorderLayout.CENTER);
    add(label, BorderLayout.SOUTH);
  }

  class SelectFileHandler implements TreeSelectionListener {
    @Override
    public void valueChanged(TreeSelectionEvent e) {
      label.setText(e.getPath().getLastPathComponent().toString());
    }
  }
}

public class _03JTree {
  public static void main(String[] args) {
    MyFrame18 f = new MyFrame18();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}