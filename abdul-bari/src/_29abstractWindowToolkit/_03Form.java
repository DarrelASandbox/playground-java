package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
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
    ta1 = new TextArea(10, 30);
    tf2 = new TextField(20);
    b2 = new Button("Click");

    TextAreaHandler tah = new TextAreaHandler();
    b2.addActionListener(tah);

    l = new List(4, true);
    c = new Choice();
    ta2 = new TextArea(20, 30);

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

    tf3.setBounds(50, 50, 300, 50);
    red.setBounds(50, 150, 300, 30);
    green.setBounds(50, 200, 300, 30);
    blue.setBounds(50, 250, 300, 30);

    ScrollbarHandler sh = new ScrollbarHandler();
    red.addAdjustmentListener(sh);
    green.addAdjustmentListener(sh);
    blue.addAdjustmentListener(sh);

    setLayout(new FlowLayout());
    // Count Button
    add(l1);
    add(b1);

    // Checkboxes
    add(l2);
    add(c1);
    add(c2);
    add(c3);

    // Radio Buttons
    add(r1);
    add(r2);
    add(r3);

    // TextField & TextEvent
    add(l3);
    add(tf1);
    add(l4);

    // TextArea
    add(ta1);
    add(l5);
    add(tf2);
    add(b2);

    // ListBox & Choice
    add(l);
    add(c);
    add(ta2);

    // Scrollbar
    add(tf3);
    add(red);
    add(green);
    add(blue);
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
    f.setSize(660, 660);
    f.setVisible(true);
  }
}