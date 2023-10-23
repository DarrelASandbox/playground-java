package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

class MyFrame3 extends Frame {

  Button b1, b2, b3, b4, b5, b6;

  public MyFrame3() {
    super("_04FlowLayout");
    b1 = new Button("one");
    b2 = new Button("two");
    b3 = new Button("three");
    b4 = new Button("four");
    b5 = new Button("five");
    b6 = new Button("six");

    FlowLayout fl = new FlowLayout();
    fl.setAlignment(FlowLayout.RIGHT);
    setLayout(fl);

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
  }
}

public class _04FlowLayout {
  public static void main(String[] args) {
    MyFrame3 f = new MyFrame3();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
