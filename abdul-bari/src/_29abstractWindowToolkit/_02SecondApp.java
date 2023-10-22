package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

class MyFrame extends Frame {
  Label l;
  TextField tf;
  Button b;

  public MyFrame() {
    super("My App");
    setLayout(new FlowLayout());
    l = new Label("Name");
    tf = new TextField(20);
    b = new Button("OK");

    add(l);
    add(tf);
    add(b);
  }
}

public class _02SecondApp {
  public static void main(String[] args) {
    MyFrame f = new MyFrame();
    f.setSize(300, 300);
    f.setVisible(true);
  }
}
