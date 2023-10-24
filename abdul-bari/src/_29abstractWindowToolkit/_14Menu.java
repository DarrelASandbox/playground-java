package src._29abstractWindowToolkit;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;

class MyFrame13 extends Frame {
  Menu file, sub;
  MenuItem open, save, close, closeAll;
  CheckboxMenuItem auto;
  TextField tf;

  MyFrame13() {
    super("Menu");
    open = new MenuItem("Open");
    save = new MenuItem("Save");
    close = new MenuItem("Close");
    closeAll = new MenuItem("Close All");

    auto = new CheckboxMenuItem("Auto Save");
    file = new Menu("File");
    sub = new Menu("Close");

    file.add(open);
    file.add(save);
    file.add(sub);
    file.add(auto);

    sub.add(close);
    sub.add(closeAll);

    MenuBar mb = new MenuBar();
    mb.add(file);
    setMenuBar(mb);

    tf = new TextField(20);
    setLayout(new FlowLayout());
    add(tf);

    open.addActionListener((ActionEvent e) -> tf.setText("Open"));
    save.addActionListener((ActionEvent e) -> tf.setText("Save"));
    close.addActionListener((ActionEvent e) -> tf.setText("Close"));
    closeAll.addActionListener((ActionEvent e) -> tf.setText("Close All"));

    auto.addItemListener((ItemEvent e) -> {
      if (auto.getState())
        tf.setText("Auto On");
      else
        tf.setText("Auto Off");
    });
  }
}

public class _14Menu {
  public static void main(String[] args) {
    MyFrame13 f = new MyFrame13();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
