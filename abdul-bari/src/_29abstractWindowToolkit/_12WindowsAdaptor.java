package src._29abstractWindowToolkit;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame11 extends Frame {
  MyFrame11() {
    super("Windows Adaptor");
    addWindowListener(new MyWindowAdapter());
  }

  class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent we) {
      System.exit(0);
    }
  }
}

public class _12WindowsAdaptor {
  public static void main(String[] args) {
    MyFrame11 f = new MyFrame11();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
