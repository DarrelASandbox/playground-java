package src._29abstractWindowToolkit;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class MyFrame10 extends Frame implements ItemListener {
  Button b1, b2, b3;
  TextField tf1, tf2, tf3;

  Panel p1;
  Panel p2;
  Panel cp;
  Panel mainP;

  Checkbox c1, c2;
  CardLayout cl;

  public MyFrame10() {
    super("CardLayout");

    CheckboxGroup cg = new CheckboxGroup();

    c1 = new Checkbox("One", true, cg);
    c2 = new Checkbox("Two", false, cg);

    c1.addItemListener(this);
    c2.addItemListener(this);

    b1 = new Button("One");
    b2 = new Button("Two");
    b3 = new Button("Three");

    tf1 = new TextField(10);
    tf2 = new TextField(10);
    tf3 = new TextField(10);

    cp = new Panel();
    cp.add(c1);
    cp.add(c2);

    p1 = new Panel();
    p1.add(b1);
    p1.add(b2);
    p1.add(b3);

    p2 = new Panel();
    p2.add(tf1);
    p2.add(tf2);
    p2.add(tf3);

    mainP = new Panel();
    cl = new CardLayout();
    mainP.setLayout(cl);

    mainP.add("One", p1);
    mainP.add("Two", p2);

    add(cp, BorderLayout.NORTH);
    add(mainP, BorderLayout.CENTER);
  }

  @Override
  public void itemStateChanged(ItemEvent e) {
    if (c1.getState())
      cl.first(mainP);
    else
      cl.last(mainP);
  }
}

public class _11CardLayout {
  public static void main(String[] args) {
    MyFrame10 f = new MyFrame10();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
