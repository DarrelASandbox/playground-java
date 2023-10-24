package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CustomPanel extends Panel {
  private int top, left, bottom, right;

  public CustomPanel(int top, int left, int bottom, int right) {
    this.top = top;
    this.left = left;
    this.bottom = bottom;
    this.right = right;
  }

  @Override
  public Insets getInsets() {
    return new Insets(top, left, bottom, right);
  }
}

class MyFrame2 extends Frame implements ActionListener, ItemListener {
  int count = 0;
  Label l1, l2, l3, l4, l5;
  Button b1, b2;
  Checkbox c1, c2, c3;
  Checkbox r1, r2, r3;
  CheckboxGroup cbg;
  TextField tf1, tf2, tf3;
  TextArea ta1, ta2;
  List l;
  Choice c;
  Scrollbar red, green, blue;

  // Constructor to initialize the UI components
  public MyFrame2() {
    super("Third App");

    l1 = new Label("" + count);
    b1 = new Button("Click");
    b1.addActionListener(this);

    l2 = new Label("Nothing is selected");
    cbg = new CheckboxGroup();
    c1 = new Checkbox("Java");
    c2 = new Checkbox("Python");
    c3 = new Checkbox("Golang");

    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);

    r1 = new Checkbox("Java", false, cbg);
    r2 = new Checkbox("Python", false, cbg);
    r3 = new Checkbox("Golang", true, cbg);

    l3 = new Label("No text is entered yet");
    l4 = new Label("Enter key is not hit yet");
    tf1 = new TextField(20);

    TextFieldHandler tfh = new TextFieldHandler();
    tf1.addTextListener(tfh);
    tf1.addActionListener(tfh);

    l5 = new Label("No text is entered yet");
    ta1 = new TextArea(10, 20);
    tf2 = new TextField(20);
    b2 = new Button("Click");

    TextAreaHandler tah = new TextAreaHandler();
    b2.addActionListener(tah);

    l = new List(7, true);
    c = new Choice();
    ta2 = new TextArea(7, 10);

    l.add("Monday");
    l.add("Tuesday");
    l.add("Wednesday");
    l.add("Thursday");
    l.add("Friday");
    l.add("Saturday");
    l.add("Sunday");

    c.add("January");
    c.add("February");
    c.add("March");
    c.add("April");

    ListBoxAndChoiceHandler lh = new ListBoxAndChoiceHandler();
    l.addItemListener(lh);
    c.addItemListener(lh);
    l.addActionListener(lh);

    red = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
    green = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
    blue = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);

    tf3 = new TextField(20);

    ScrollbarHandler sh = new ScrollbarHandler();
    red.addAdjustmentListener(sh);
    green.addAdjustmentListener(sh);
    blue.addAdjustmentListener(sh);

    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    // Count Button
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.gridwidth = 1;
    gbc.gridheight = 1;
    Panel p1 = new Panel(new FlowLayout());
    p1.add(l1);
    p1.add(b1);
    add(p1, gbc);

    // Empty spaces
    for (int i = 1; i <= 3; i++) {
      gbc.gridx = i;
      add(new Label(), gbc);
    }

    // Checkboxes
    gbc.gridy = 1;
    gbc.gridx = 0;
    add(l2, gbc);

    gbc.gridx = 1;
    Panel p2 = new Panel(new FlowLayout());
    p2.add(c1);
    p2.add(c2);
    p2.add(c3);
    add(p2, gbc);

    // Empty spaces
    for (int i = 2; i <= 3; i++) {
      gbc.gridx = i;
      add(new Label(), gbc);
    }

    // Radio Buttons
    gbc.gridy = 2;
    gbc.gridx = 1;
    Panel p3 = new Panel(new FlowLayout());
    p3.add(r1);
    p3.add(r2);
    p3.add(r3);
    add(p3, gbc);

    // Empty spaces
    for (int i = 0; i <= 3; i++) {
      if (i != 1) {
        gbc.gridx = i;
        add(new Label(), gbc);
      }
    }

    // TextField & TextEvent
    gbc.gridy = 3;
    CustomPanel cp4 = new CustomPanel(10, 10, 10, 10);
    cp4.add(l3);
    gbc.gridx = 0;
    add(cp4, gbc);

    CustomPanel cp5 = new CustomPanel(10, 10, 10, 10);
    cp5.add(tf1);
    gbc.gridx = 1;
    add(cp5, gbc);

    CustomPanel cp6 = new CustomPanel(10, 10, 10, 10);
    cp6.add(l4);
    gbc.gridx = 2;
    add(cp6, gbc);

    // Empty space
    gbc.gridx = 3;
    add(new Label(), gbc);

    // TextArea
    gbc.gridy = 4;
    gbc.gridx = 0;
    add(ta1, gbc);
    gbc.gridx = 1;
    add(l5, gbc);
    gbc.gridx = 2;
    add(tf2, gbc);
    gbc.gridx = 3;
    add(b2, gbc);

    // ListBox & Choice
    gbc.gridy = 5;
    gbc.gridx = 0;
    add(l, gbc);
    gbc.gridx = 1;
    add(c, gbc);
    gbc.gridx = 2;
    add(ta2, gbc);
    gbc.gridx = 3;
    add(new Label()); // Empty space

    // Scrollbar
    gbc.gridy = 6;
    gbc.gridx = 0;
    add(tf3, gbc);
    gbc.gridx = 1;
    add(red, gbc);
    gbc.gridx = 2;
    add(green, gbc);
    gbc.gridx = 3;
    add(blue, gbc);

    addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }

  // Implement the actionPerformed method for button click events
  @Override
  public void actionPerformed(ActionEvent e) {
    count++;
    l1.setText("" + count);
  }

  // Implement the itemStateChanged method for checkbox events
  @Override
  public void itemStateChanged(ItemEvent e) {
    String str = "";
    if (c1.getState())
      str = str + " " + c1.getLabel();
    if (c2.getState())
      str = str + " " + c2.getLabel();
    if (c3.getState())
      str = str + " " + c3.getLabel();
    if (str.isEmpty())
      str = "Nothing is selected";

    l2.setText(str);
  }

  // Inner class to handle TextField events
  class TextFieldHandler implements TextListener, ActionListener {
    @Override
    public void textValueChanged(TextEvent e) {
      l3.setText(tf1.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      l4.setText(tf1.getText());
    }
  }

  // Inner class to handle TextArea events
  class TextAreaHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      ta1.append("\nta.append: " + tf2.getText());
      ta1.insert(tf2.getText(), ta1.getCaretPosition());
    }
  }

  // Inner class to handle List and Choice events
  class ListBoxAndChoiceHandler implements ItemListener, ActionListener {
    @Override
    public void itemStateChanged(ItemEvent e) {
      if (e.getSource() == l)
        ta2.setText(l.getSelectedItem());
      else
        ta2.setText(c.getSelectedItem());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      String list[] = l.getSelectedItems();
      String txt = "";
      for (String string : list)
        txt += string + "\n";
      System.out.println(txt);
      ta2.setText(txt);
    }
  }

  // Inner class to handle Scrollbar events
  class ScrollbarHandler implements AdjustmentListener {
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
      tf3.setBackground(new Color(red.getValue(), green.getValue(), blue.getValue()));
    }
  }
}

public class _03Form {
  public static void main(String[] args) {
    MyFrame2 f = new MyFrame2();
    f.setSize(780, 720);
    f.setVisible(true);
  }
}