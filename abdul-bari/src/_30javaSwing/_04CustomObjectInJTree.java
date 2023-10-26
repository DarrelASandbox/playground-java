package src._30javaSwing;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class _04CustomObjectInJTree {

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      JFrame frame = new MyFrame19();
      frame.setSize(600, 400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
    });
  }
}

class MyFrame19 extends JFrame {

  private JTree tree;
  private JPanel infoPanel;
  private JLabel nameLabel;
  private JLabel sizeLabel;
  private JLabel typeLabel;

  public MyFrame19() {
    super("Custom Object in JTree Example");

    setLayout(new BorderLayout());

    // Initialize the info panel and its labels
    infoPanel = new JPanel();
    infoPanel.setLayout(new GridLayout(3, 1));
    nameLabel = new JLabel("Name: ");
    sizeLabel = new JLabel("Size: ");
    typeLabel = new JLabel("Type: ");
    infoPanel.add(nameLabel);
    infoPanel.add(sizeLabel);
    infoPanel.add(typeLabel);

    // Populate the tree
    String path = "abdul-bari/src";
    DefaultMutableTreeNode root = new DefaultMutableTreeNode(new FileInfo(path, 0, "Folder"));
    File f = new File(path);
    for (File x : f.listFiles()) {
      if (x.isDirectory()) {
        DefaultMutableTreeNode subFolder = new DefaultMutableTreeNode(new FileInfo(x.getName(), x.length(), "Folder"));
        for (File y : x.listFiles()) {
          subFolder.add(new DefaultMutableTreeNode(new FileInfo(y.getName(), y.length(), "File")));
        }
        root.add(subFolder);
      } else {
        root.add(new DefaultMutableTreeNode(new FileInfo(x.getName(), x.length(), "File")));
      }
    }

    tree = new JTree(root);
    tree.addTreeSelectionListener(new TreeSelectionHandler());

    // Add tree and info panel to the frame
    add(new JScrollPane(tree), BorderLayout.CENTER);
    add(infoPanel, BorderLayout.EAST);
  }

  // TreeSelectionHandler is an inner class that implements the TreeSelectionListener interface.
  // This class is responsible for handling events when a node in the JTree is selected.
  private class TreeSelectionHandler implements TreeSelectionListener {

    // The valueChanged method is called whenever a node in the JTree is selected or deselected.
    @Override
    public void valueChanged(TreeSelectionEvent e) {

      // Get the last component of the selected path and cast it to DefaultMutableTreeNode.
      // This node contains our custom FileInfo object.
      DefaultMutableTreeNode node = (DefaultMutableTreeNode) e.getPath().getLastPathComponent();

      // Check if the node is not null (i.e., a node was actually selected).
      if (node != null) {

        // Retrieve the FileInfo object stored in the selected node.
        FileInfo fileInfo = (FileInfo) node.getUserObject();

        // Update the JLabels in the infoPanel to display the FileInfo details.
        nameLabel.setText("Name: " + fileInfo.getName());
        sizeLabel.setText("Size: " + fileInfo.getSize() + " bytes");
        typeLabel.setText("Type: " + fileInfo.getType());
      }
    }
  }

}

class FileInfo {
  private String name;
  private long size;
  private String type;

  public FileInfo(String name, long size, String type) {
    this.name = name;
    this.size = size;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public long getSize() {
    return size;
  }

  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return name;
  }
}
