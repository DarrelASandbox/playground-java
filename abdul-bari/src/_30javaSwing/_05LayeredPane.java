package src._30javaSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class MyFrame20 extends JFrame implements ActionListener {

  JLayeredPane lp;
  JRadioButton r1, r2, r3;
  JLabel l1, l2, l3, l4;

  MyFrame20() {
    super("Border");
    r1 = new JRadioButton("Red");
    r2 = new JRadioButton("Green");
    r3 = new JRadioButton("Blue", true);
    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);

    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);

    JPanel p1 = new JPanel();
    p1.add(r1);
    p1.add(r2);
    p1.add(r3);

    l1 = new JLabel("Red");
    l1.setBounds(10, 10, 200, 200);
    l1.setBackground(Color.RED);
    l1.setOpaque(true);

    l2 = new JLabel("Green");
    l2.setBounds(50, 50, 250, 250);
    l2.setBackground(Color.GREEN);
    l2.setOpaque(true);

    l3 = new JLabel("Blue");
    l3.setBounds(70, 70, 300, 300);
    l3.setBackground(Color.BLUE);
    l3.setOpaque(true);

    l4 = new JLabel("Black");
    l4.setBounds(100, 100, 150, 150);
    l4.setBackground(Color.BLACK);
    l4.setOpaque(true);

    lp = new JLayeredPane();
    lp.add(l1, Integer.valueOf(0));
    lp.add(l2, Integer.valueOf(1));
    lp.add(l3, Integer.valueOf(2));
    lp.add(l4, Integer.valueOf(3));

    add(p1, BorderLayout.NORTH);
    add(lp, BorderLayout.CENTER);

    addMouseMotionListener(new MouseAdapter() {
      public void mouseMoved(MouseEvent e) {
        l4.setLocation(e.getX(), e.getY());
      }
    });
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (r1.isSelected())
      lp.setLayer(l4, 1);
    if (r2.isSelected())
      lp.setLayer(l4, 2);
    if (r2.isSelected())
      lp.setLayer(l4, 3);
  }
}

public class _05LayeredPane {
  public static void main(String[] args) {
    MyFrame20 f = new MyFrame20();
    f.setSize(800, 800);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
