package src._29abstractWindowToolkit;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame9 extends Frame implements WindowListener {
  Label l1;

  MyFrame9() {
    super("Window Event");
    l1 = new Label("                                        ");
    setLayout(new FlowLayout());
    add(l1);
    addWindowListener(this);
  }

  @Override
  public void windowOpened(WindowEvent e) {
    l1.setText("windowOpened");
  }

  @Override
  public void windowClosing(WindowEvent e) {
    l1.setText("windowClosing");
    System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
    l1.setText("windowClosed");
  }

  @Override
  public void windowIconified(WindowEvent e) {
    l1.setText("windowIconified");
  }

  @Override
  public void windowDeiconified(WindowEvent e) {
    l1.setText("windowDeiconified");
  }

  @Override
  public void windowActivated(WindowEvent e) {
    l1.setText("windowActivated");
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    l1.setText("windowDeactivated");
  }
}

public class _10WindowEvent {
  public static void main(String[] args) {
    MyFrame9 f = new MyFrame9();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
