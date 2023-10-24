package src._29abstractWindowToolkit;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

class MyFrame15 extends Frame implements Runnable {
  int x, y, tx, ty;

  MyFrame15() {
    super("Animation");
    x = 100;
    y = 100;
    tx = ty = 1;

    Thread t = new Thread(this);
    t.start();
  }

  public void paint(Graphics g) {
    g.setColor(Color.CYAN);
    g.fillOval(x, y, 50, 50);

  }

  @Override
  public void run() {
    while (true) {
      x += tx;
      y += ty;

      if (x < 0 || x > 450)
        tx = tx * -1;
      if (y < 20 || y > 350)
        ty = ty * -1;
      repaint();

      try {
        Thread.sleep(3);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class _16Animation {
  public static void main(String[] args) {
    MyFrame15 f = new MyFrame15();
    f.setSize(500, 400);
    f.setVisible(true);
  }
}
