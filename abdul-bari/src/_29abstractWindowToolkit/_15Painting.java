package src._29abstractWindowToolkit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MyFrame14 extends Frame {
  int x = 0, y = 0;

  MyFrame14() {
    super("Painting");

    /* 
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
      }
    });
    */

    addMouseMotionListener(new MouseAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();
      }
    });
  }

  public void paint(Graphics g) {
    g.setColor(Color.ORANGE);
    g.setFont(new Font("Times New Roman", Font.BOLD, 30));
    g.drawString("Hello", x, y);
    // g.fillOval(x, y, 50, 50);
  }
}

public class _15Painting {
  public static void main(String[] args) {
    MyFrame14 f = new MyFrame14();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}

/* 
In Java's AWT (Abstract Window Toolkit), the `paint()` method is a special method that's responsible for rendering graphics on the component. It's not designed to be called directly by the programmer for several reasons:

1. **Thread Safety**: The AWT event dispatching thread is responsible for invoking `paint()`. Calling `paint()` directly from another thread could lead to thread safety issues.

2. **Optimization**: AWT may combine multiple `repaint()` requests into a single `paint()` call to optimize redrawing and reduce flicker. Calling `paint()` directly would bypass these optimizations.

3. **State Management**: The `Graphics` object that's passed to `paint()` is prepared by the AWT and may contain important state information. When you call `repaint()`, AWT can set up this `Graphics` object appropriately before calling `paint()`.

4. **Consistency**: Using `repaint()` ensures that the painting process remains consistent with the rest of the AWT painting mechanism, including features like double buffering.

Here's how it works:

- When you call `repaint()`, you're essentially asking the AWT event dispatching thread to call `paint()` "as soon as it can."
  
- The `repaint()` method doesn't immediately cause `paint()` to execute. Instead, it schedules a repaint event to be processed by the event dispatching thread. This allows the AWT to manage painting in a thread-safe and optimized manner.

- The `paint()` method then gets called automatically by the AWT event dispatching thread, ensuring that the `Graphics` object and other state information are properly set up.

So, in your code, when you call `repaint()` inside the `mouseClicked()` method, you're asking the system to schedule a `paint()` call, which will then draw the oval at the new coordinates `(x, y)`.

This approach keeps your GUI responsive and allows Java's AWT to manage the painting process efficiently.
 */
