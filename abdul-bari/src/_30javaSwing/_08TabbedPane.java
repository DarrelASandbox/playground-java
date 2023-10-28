package src._30javaSwing;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame23 extends JFrame implements ListSelectionListener {

  JSplitPane sp;
  JList<String> list;
  JLabel l;

  MyFrame23() {
    super("SplitPane");
    String cols[] = { "RED", "GREEN", "BLUE", "YELLOW", "MAGENTA", "ORANGE", "BLACK" };

    list = new JList<String>(cols);
    list.setSelectedIndex(0);
    list.addListSelectionListener(this);

    JScrollPane p1 = new JScrollPane(list);
    l = new JLabel(" ");
    l.setOpaque(true);
    l.setBackground(Color.RED);
    JScrollPane p2 = new JScrollPane(l);

    JTabbedPane tp = new JTabbedPane();
    tp.addTab("Colors", p1);
    tp.addTab("Label", p2);
    add(tp);
  }

  @Override
  public void valueChanged(ListSelectionEvent e) {
    String str = (String) list.getSelectedValue();

    switch (str) {
      case "RED":
        l.setBackground(Color.RED);
        break;
      case "GREEN":
        l.setBackground(Color.GREEN);
        break;
      case "BLUE":
        l.setBackground(Color.BLUE);
        break;
      case "YELLOW":
        l.setBackground(Color.YELLOW);
        break;
      case "MAGENTA":
        l.setBackground(Color.MAGENTA);
        break;
      case "ORANGE":
        l.setBackground(Color.ORANGE);
        break;
      case "BLACK":
        l.setBackground(Color.BLACK);
        break;
    }
  }
}

public class _08TabbedPane {
  public static void main(String[] args) {
    MyFrame23 f = new MyFrame23();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
