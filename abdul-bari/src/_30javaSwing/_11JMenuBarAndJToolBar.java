package src._30javaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

class MyFrame26 extends JFrame implements ActionListener {
  JToolBar tb;
  JButton b1, b2, b3, b4, b5, b6, b7;
  JTextArea ta;

  MyFrame26() {
    super("JMenuBar and JToolBar");
    tb = new JToolBar();
    b1 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-save-50.png"));
    b2 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-open-50.png"));
    b3 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-new-50.png"));
    b4 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-cut-50.png"));
    b5 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-copy-50.png"));
    b6 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-split-30.png"));
    b7 = new JButton(new ImageIcon("abdul-bari/src/_30javaSwing/icons/icons8-close-50.png"));

    tb.add(b1);
    tb.add(b2);
    tb.add(b3);
    tb.add(new JToolBar.Separator());

    tb.add(b4);
    tb.add(b5);
    tb.add(b6);
    tb.add(b7);

    ta = new JTextArea();
    JScrollPane sp = new JScrollPane(ta);
    add(tb, BorderLayout.NORTH);
    add(sp, BorderLayout.CENTER);

    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File");
    JMenuItem m1 = new JMenuItem("save");
    JMenuItem m2 = new JMenuItem("open");

    m2.setMnemonic(KeyEvent.VK_O);

    file.add(m1);
    file.addSeparator();
    file.add(m2);
    mb.add(file);
    setJMenuBar(mb);

    b2.setActionCommand("open");
    b2.addActionListener(this);
    m2.addActionListener(this);
    b1.addActionListener(this);
    b1.addActionListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("open")) {
      JFileChooser fc = new JFileChooser();
      fc.showOpenDialog(this);
      File f = fc.getSelectedFile();

      try (FileInputStream fis = new FileInputStream(f)) {
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String str = new String(b);
        ta.setText(str);
      } catch (IOException e1) {
        e1.printStackTrace();
      }
    } else {
      Color col = JColorChooser.showDialog(this, "Font Color", Color.ORANGE);
      ta.setForeground(col);
    }

  }
}

public class _11JMenuBarAndJToolBar {
  public static void main(String[] args) {
    MyFrame26 f = new MyFrame26();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
