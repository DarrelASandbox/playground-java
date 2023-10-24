package src._29abstractWindowToolkit;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame12 extends Frame {
  TextField tf;
  Button b1, b2, b3;
  int count = 0;

  // Constructor for MyFrame12
  MyFrame12() {
    super("Event Handling");

    // Initialize UI components
    tf = new TextField("0", 20);
    b1 = new Button("Click");
    b2 = new Button("Click");
    b3 = new Button("Click");

    setLayout(new FlowLayout());

    // Add components to frame
    add(tf);
    add(b1);
    add(b2);
    add(b3);

    // Create an instance of the custom ActionListener
    MyListener ml = new MyListener();

    // Attach the custom ActionListener to button b1
    b1.addActionListener(ml);

    // Attach an anonymous inner class as ActionListener to button b2
    b2.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        count++;
        tf.setText(String.valueOf(count));
      }
    });

    // Attach a lambda function as ActionListener to button b3
    b3.addActionListener((ActionEvent e) -> {
      count++;
      tf.setText(String.valueOf(count));
    });
  }

  // Custom ActionListener class
  class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
      count++;
      tf.setText(String.valueOf(count));
    }
  }
}

public class _13EventHandling {
  public static void main(String[] args) {
    MyFrame12 f = new MyFrame12();
    f.setSize(500, 500);
    f.setVisible(true);
  }
}
