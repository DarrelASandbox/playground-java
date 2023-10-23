package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

class MyFrame5 extends Frame {

  Button b1, b2, b3, b4, b5, b6;

  public MyFrame5() {
    super("_06GridLayout");

    setLayout(new GridLayout(3, 2));

    b1 = new Button("one");
    b2 = new Button("two");
    b3 = new Button("three");
    b4 = new Button("four");
    b5 = new Button("five");
    b6 = new Button("six");

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(new Button("Seven"));
  }
}

public class _06GridLayout {
  public static void main(String[] args) {
    MyFrame5 f = new MyFrame5();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
