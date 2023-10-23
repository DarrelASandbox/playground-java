package src._29abstractWindowToolkit;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

class MyFrame7 extends Frame implements KeyListener {
  Label l1, l2, l3, l4;

  MyFrame7() {
    super("Key Event");
    l1 = new Label("");
    l2 = new Label("");
    l3 = new Label("");
    l4 = new Label("");

    // Set layout to null for custom positioning
    setLayout(null);

    // Set bounds for labels
    l1.setBounds(30, 40, 200, 20);
    l2.setBounds(30, 70, 100, 20);
    l3.setBounds(30, 100, 100, 20);
    l4.setBounds(30, 120, 100, 20);

    add(l1);
    add(l2);
    add(l3);
    add(l4);

    addKeyListener(this);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    l1.setText(new Date(e.getWhen()) + "");
    l2.setText("keyTyped");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    l3.setText("keyPressed");
    l4.setText("");
  }

  @Override
  public void keyReleased(KeyEvent e) {
    l1.setText("");
    l2.setText("");
    l3.setText("");
    l4.setText("keyReleased");
  }
}

public class _08KeyEvent {
  public static void main(String[] args) {
    MyFrame7 f = new MyFrame7();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
