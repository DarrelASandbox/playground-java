package src._30javaSwing;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

class MyFrame16 extends JFrame implements ActionListener {

  JLabel l;
  JButton b1, b2;
  int count = 0;

  JTextField tf1;
  JFormattedTextField ftf1, ftf2;

  JCheckBox c1, c2;
  JRadioButton r1, r2;
  JTextField tf2;

  MyFrame16() {
    super("First Swing");

    setLayout(new FlowLayout());

    l = new JLabel("Clicked " + count + " times");
    b1 = new JButton();
    b2 = new JButton("Cancel");

    add(l);
    add(b1);
    add(b2);

    b1.addActionListener(this);

    // Set 'b1' as the default button for the root pane.
    // This means that pressing the 'Return' key while the focus is within the root pane will trigger 'b1'.
    // If the focus is on 'b1', pressing the 'Space' key will also trigger the button.
    // Note: To navigate to 'b1' or between other focusable components within the root pane,
    // the user can use the 'Tab' key. Once 'b1' is focused, pressing 'Return' or 'Space' will trigger it.
    getRootPane().setDefaultButton(b1);
    b1.setIcon(new ImageIcon("abdul-bari/src/_00diagrams/icons8-click-50.png"));
    b1.setToolTipText("Counter");

    tf1 = new JTextField(15);

    DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
    ftf1 = new JFormattedTextField(df);
    ftf1.setColumns(15);
    ftf1.setValue(new Date());

    NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormatter nft = new NumberFormatter(nf);
    nft.setAllowsInvalid(false);
    JFormattedTextField ftf2 = new JFormattedTextField(nft);
    ftf2.setColumns(15);
    ftf2.setValue(0);

    JTextArea ta = new JTextArea(10, 10);

    add(tf1);
    add(ftf1);
    add(ftf2);
    add(ta);

    tf2 = new JTextField("Hello World", 20);
    tf2.setBounds(10, 20, 100, 80);

    c1 = new JCheckBox("Bold");
    c1.setMnemonic(KeyEvent.VK_B);
    c2 = new JCheckBox("Italic");
    c2.setMnemonic(KeyEvent.VK_I);

    r1 = new JRadioButton("lower");
    r2 = new JRadioButton("UPPER");

    ButtonGroup bg = new ButtonGroup();
    bg.add(r1);
    bg.add(r2);

    ButtonHandler bh = new ButtonHandler();
    c1.addActionListener(bh);
    c2.addActionListener(bh);
    r1.addActionListener(bh);
    r2.addActionListener(bh);

    add(c1);
    add(c2);
    add(r1);
    add(r2);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    count++;
    l.setText("Clicked " + count + " times");
  }

  class ButtonHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      switch (e.getActionCommand()) {
        case "lower":
          tf2.setText(tf2.getText().toLowerCase());
        case "UPPER":
          tf2.setText(tf2.getText().toUpperCase());
      }

      int b = 0, i = 0;

      if (c1.isSelected())
        b = Font.BOLD;
      if (c2.isSelected())
        i = Font.ITALIC;

      Font f = new Font("Times New Roman", b | i, 15);
      tf2.setFont(f);
    }
  }
}

public class _01FirstSwing {
  public static void main(String[] args) {
    MyFrame16 f = new MyFrame16();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
