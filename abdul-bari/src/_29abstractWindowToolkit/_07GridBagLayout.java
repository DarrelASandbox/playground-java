package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

class MyFrame6 extends Frame {

  Button b1, b2, b3, b4, b5, b6;

  public MyFrame6() {
    super("_07GridBagLayout");

    GridBagLayout gb = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    setLayout(gb);

    b1 = new Button("one");
    b2 = new Button("two");
    b3 = new Button("three");
    b4 = new Button("four");
    b5 = new Button("five");
    b6 = new Button("six");

    gbc.gridx = 1;
    gbc.gridy = 1;
    add(b1, gbc);

    gbc.gridx = 2;
    gbc.gridy = 2;
    add(b2, gbc);

    gbc.gridx = 3;
    gbc.gridy = 3;
    add(b3, gbc);

    gbc.gridx = 4;
    gbc.gridy = 4;
    add(b4, gbc);

    gbc.gridx = 5;
    gbc.gridy = 5;
    add(b5, gbc);

    gbc.gridx = 6;
    gbc.gridy = 6;
    add(b6, gbc);
  }
}

public class _07GridBagLayout {
  public static void main(String[] args) {
    MyFrame6 f = new MyFrame6();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
