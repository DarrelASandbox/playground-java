package src._29abstractWindowToolkit;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

class MyFrame4 extends Frame {

  Button b1, b2, b3, b4, b5, b6;

  public MyFrame4() {
    super("_05BorderLayout");
    b1 = new Button("one");
    b2 = new Button("two");
    b3 = new Button("three");
    b4 = new Button("four");
    b5 = new Button("five");

    add(b1, BorderLayout.NORTH);
    // add(b2, BorderLayout.EAST);
    add(b3, BorderLayout.SOUTH);
    add(b4, BorderLayout.WEST);
    add(b5, BorderLayout.CENTER);

    Panel p = new Panel();
    p.setLayout(new GridLayout(3, 1));
    p.add(new Button("Mon"));
    p.add(new Button("Tue"));
    p.add(new Button("Wed"));
    add(p, BorderLayout.EAST);
  }
}

public class _05BorderLayout {
  public static void main(String[] args) {
    MyFrame4 f = new MyFrame4();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
