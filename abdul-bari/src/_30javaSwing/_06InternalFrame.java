package src._30javaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class MyInternalFrame extends JInternalFrame {
  static int count = 0;
  JTextArea ta;
  JScrollPane sp;

  MyInternalFrame() {
    super("Document " + (++count), true, true, true, true);

    ta = new JTextArea();
    sp = new JScrollPane(ta);
    add(sp);

    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem m1 = new JMenuItem("Save");

    file.add(m1);
    mb.add(file);
    setJMenuBar(mb);

    setSize(300, 300);
    setLocation(50, 50);
    setVisible(true);
  }
}

class MyFrame21 extends JFrame implements ActionListener {
  JDesktopPane dp;

  MyFrame21() {
    super("InternalFrame");
    dp = new JDesktopPane();
    setContentPane(dp);
    JMenuBar mb = new JMenuBar();
    JMenu d = new JMenu("Document");
    JMenuItem m1 = new JMenuItem("new");

    d.add(m1);
    mb.add(d);
    setJMenuBar(mb);

    m1.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    MyInternalFrame mi = new MyInternalFrame();
    dp.add(mi);
  }
}

public class _06InternalFrame {
  public static void main(String[] args) {
    MyFrame21 f = new MyFrame21();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
