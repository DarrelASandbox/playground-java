package src._30javaSwing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyFrame25 extends JFrame implements ActionListener, ListSelectionListener, ChangeListener {

  JComboBox<String> cb;
  JList<String> list;
  JSpinner sp1, sp2;
  JTextField tf;

  MyFrame25() {
    super("JSpinner, JList and JComboBox");
    String countries[] = { "India", "US", "UK", "Canada", "Australia" };
    String months[] = {
        "January", "February", "March",
        "April", "May", "June",
        "July", "August", "September",
        "October", "November", "December"
    };
    String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

    cb = new JComboBox<String>(countries);
    list = new JList<String>(months);
    list.setVisibleRowCount(5);
    tf = new JTextField(15);

    sp1 = new JSpinner(new SpinnerNumberModel(1, 1, 31, 1));
    sp2 = new JSpinner(new SpinnerListModel(days));

    setLayout(new FlowLayout());
    add(cb);
    add(sp1);
    add(sp2);
    add(new JScrollPane(list));
    add(tf);

    cb.addActionListener(this);
    list.addListSelectionListener(this);
    sp1.addChangeListener(this);
    sp2.addChangeListener(this);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    tf.setText((String) cb.getSelectedItem());
  }

  @Override
  public void valueChanged(ListSelectionEvent e) {
    tf.setText(list.getSelectedValue());
  }

  @Override
  public void stateChanged(ChangeEvent e) {
    if (e.getSource() == sp1)
      tf.setText(sp1.getValue() + "");
    else
      tf.setText(sp2.getValue() + "");

  }
}

class _010JSpinnerJListJComboBox {
  public static void main(String[] args) {
    MyFrame25 f = new MyFrame25();
    f.setSize(500, 500);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
