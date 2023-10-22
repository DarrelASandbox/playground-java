package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class _01FirstApp {
  public static void main(String[] args) {
    Frame f = new Frame("My First App");
    f.setLayout(new FlowLayout());

    Label l = new Label("Name");
    TextField tf = new TextField(20);
    Button b = new Button("OK");

    f.add(l);
    f.add(tf);
    f.add(b);

    f.setSize(300, 300);
    f.setVisible(true);
  }
}
