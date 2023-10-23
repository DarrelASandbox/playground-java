package src._29abstractWindowToolkit;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class MyFrame8 extends Frame implements MouseListener, MouseMotionListener {
  Label l1, l2, l3;

  MyFrame8() {
    super("Mouse Event");
    l1 = new Label("");
    l2 = new Label("");
    l3 = new Label("");

    setLayout(null);
    l1.setBounds(10, 50, 120, 20);
    l2.setBounds(10, 80, 120, 20);
    l3.setBounds(10, 110, 100, 20);

    add(l1);
    add(l2);
    add(l3);

    addMouseListener(this);
    addMouseMotionListener(this);
  }

  @Override
  public void mouseDragged(MouseEvent e) {
    l1.setText("1. mouseDragged");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mouseMoved(MouseEvent e) {
    l1.setText("2. mouseMoved");
    l2.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    l1.setText("3. mouseClicked");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mousePressed(MouseEvent e) {
    l1.setText("4. mousePressed");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mouseReleased(MouseEvent e) {
    l1.setText("5. mouseReleased");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mouseEntered(MouseEvent e) {
    l1.setText("6. mouseEntered");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }

  @Override
  public void mouseExited(MouseEvent e) {
    l1.setText("7. MouseEvent");
    l3.setText("(" + e.getX() + "," + e.getY() + ")");
  }
}

public class _09MouseEvent {
  public static void main(String[] args) {
    MyFrame8 f = new MyFrame8();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}