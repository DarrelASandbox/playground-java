package src._30javaSwing;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

class MyFrame17 extends JFrame {

  JLabel l;
  JTextField tf;
  JButton b;

  JPanel p;

  MyFrame17() {
    super("Border");
    setLayout(new FlowLayout());

    l = new JLabel("Name");
    tf = new JTextField(20);
    b = new JButton("OK");
    p = new JPanel();

    p.add(l);
    p.add(tf);
    p.add(b);

    Border br = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED),
        "Login", TitledBorder.CENTER, TitledBorder.LEFT);
    p.setBorder(br);

    add(p);
  }

}

public class _02Border {
  public static void main(String[] args) {
    MyFrame17 f = new MyFrame17();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
