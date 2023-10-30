package src._31javaFX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

class Customer {
  private int customerId;
  private String name;
  private String address;

  public Customer(int c, String n, String a) {
    customerId = c;
    name = n;
    address = a;
  }

  public Customer(String id, String text, String text2) {
  }

  public int getID() {
    return customerId;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String add) {
    address = add;
  }
}

public class _04Form extends Application {
  String path = "src/_31javaFX/customer.txt";

  Text t;
  RadioButton r1, r2, r3;
  CheckBox c1, c2, c3;
  ChoiceBox<Integer> cb;

  int count = 0;

  @Override
  public void start(Stage stage) throws Exception {
    // Checkbox, RadioButton, HBox & VBox layout
    t = new Text("Form");
    HBox hb1 = new HBox();
    hb1.setAlignment(Pos.CENTER);
    hb1.setPrefHeight(48);
    hb1.getChildren().add(t);

    r1 = new RadioButton("Red");
    r2 = new RadioButton("Green");
    r3 = new RadioButton("Blue");

    ToggleGroup tg = new ToggleGroup();
    r1.setToggleGroup(tg);
    r2.setToggleGroup(tg);
    r3.setToggleGroup(tg);

    HBox hb2 = new HBox();
    hb2.setAlignment(Pos.CENTER);
    hb2.getChildren().addAll(r1, r2, r3);
    hb2.setSpacing(15);
    hb2.setPadding(new Insets(10, 10, 10, 10));

    c1 = new CheckBox("Normal");
    c2 = new CheckBox("Bold");
    c3 = new CheckBox("Italic");

    HBox hb3 = new HBox();
    hb3.setAlignment(Pos.CENTER);
    hb3.getChildren().addAll(c1, c2, c3);
    hb3.setSpacing(15);
    hb3.setPadding(new Insets(10, 10, 10, 10));

    cb = new ChoiceBox<>();
    cb.getItems().addAll(13, 24, 32, 48);
    cb.setValue(13);

    VBox vb1 = new VBox();
    vb1.setAlignment(Pos.CENTER);
    vb1.setSpacing(15);
    vb1.setPadding(new Insets(10, 10, 10, 10));
    vb1.getChildren().addAll(hb1, hb2, hb3, cb);

    r1.setOnAction(new RadioAndCBHandler());
    r2.setOnAction(new RadioAndCBHandler());
    r3.setOnAction(new RadioAndCBHandler());
    c1.setOnAction(new RadioAndCBHandler());
    c2.setOnAction(new RadioAndCBHandler());
    c3.setOnAction(new RadioAndCBHandler());
    cb.setOnAction(new RadioAndCBHandler());

    // TextArea & Slider
    TextArea ta = new TextArea();
    ta.setPrefColumnCount(85);
    ta.setPrefRowCount(5);

    Slider sl = new Slider(10, 50, 10);
    sl.setMajorTickUnit(5);
    sl.setShowTickMarks(true);
    sl.setShowTickLabels(true);
    sl.valueProperty().addListener(e -> ta.setFont(Font.font(sl.getValue())));

    VBox vb2 = new VBox();
    vb2.setSpacing(15);
    vb2.setPadding(new Insets(10, 50, 10, 50));
    vb2.getChildren().addAll(ta, sl);

    // DatePicker, ColorPicker & FileChooser
    DatePicker dp = new DatePicker();
    dp.setShowWeekNumbers(true);
    dp.setOnAction(e -> ta.setText("Date: " + dp.getValue() + "\n" + ta.getText()));

    ColorPicker cp = new ColorPicker();
    cp.setOnAction(e -> ta.setStyle("-fx-text-fill:#" +
        cp.getValue().toString().substring(2, 8)));

    Button b1 = new Button("Open");
    b1.setOnAction(e -> {
      FileChooser fc = new FileChooser();
      java.io.File file = fc.showOpenDialog(stage);

      try (Scanner sc = new Scanner(new FileInputStream(file))) {
        String str = "";
        while (sc.hasNext()) {
          str = str + sc.nextLine() + "\n";
          ta.setText(str);
        }
      } catch (FileNotFoundException e1) {
        e1.printStackTrace();
      }
    });

    VBox vb3 = new VBox();
    vb3.setAlignment(Pos.CENTER);
    vb3.setSpacing(15);
    vb3.setPadding(new Insets(10, 10, 10, 10));
    vb3.getChildren().addAll(dp, cp, b1);

    // ComboBox & Form Application
    HashMap<Integer, Customer> hm = new HashMap<>();
    ComboBox<Integer> customer = new ComboBox<>();

    try (Scanner sc = new Scanner(new FileInputStream(path))) {
      int c;
      String n = null;
      String a;

      while (sc.hasNext()) {
        c = sc.nextInt();
        n = sc.next();
        a = sc.next();
        hm.put(c, new Customer(c, n, a));
        customer.getItems().add(c);

        if (c > count)
          count = c;
      }
    } catch (Exception e) {
      System.out.println(e);
    }

    Label l1 = new Label("Customer ID");
    Label l2 = new Label("Name");
    Label l3 = new Label("Address");

    TextField name = new TextField();
    TextField address = new TextField();
    name.setPrefColumnCount(15);
    address.setPrefColumnCount(20);

    Button create = new Button("Create");
    Button save = new Button("Save");

    create.setOnAction(e -> {
      customer.setValue(++count);
      name.setText("");
      address.setText("");
    });

    save.setOnAction(e -> {
      hm.put(count, new Customer(count, name.getText(), address.getText()));
      try (PrintStream ps = new PrintStream(new FileOutputStream(path))) {
        for (Customer ct : hm.values()) {
          ps.println(ct.getID());
          ps.println(ct.getName());
          ps.println(ct.getAddress());
        }
      } catch (FileNotFoundException e1) {
        e1.printStackTrace();
      }
    });

    customer.setOnAction(e -> {
      Integer selectedId = customer.getValue();
      if (selectedId != null) {
        Customer selectedCustomer = hm.get(selectedId);
        if (selectedCustomer != null) {
          name.setText(selectedCustomer.getName());
          address.setText(selectedCustomer.getAddress());
        }
      }
    });

    HBox hb4 = new HBox();
    HBox hb5 = new HBox();
    HBox hb6 = new HBox();
    HBox hb7 = new HBox();

    hb4.getChildren().addAll(l1, customer);
    hb4.setAlignment(Pos.CENTER);
    hb5.getChildren().addAll(l2, name);
    hb5.setAlignment(Pos.CENTER);
    hb6.getChildren().addAll(l3, address);
    hb6.setAlignment(Pos.CENTER);
    hb7.getChildren().addAll(create, save);
    hb7.setAlignment(Pos.CENTER);

    VBox vb4 = new VBox();
    vb4.setAlignment(Pos.CENTER);
    vb4.setSpacing(15);
    vb4.setPadding(new Insets(10, 10, 10, 10));
    vb4.getChildren().addAll(hb4, hb5, hb6, hb7);

    // Create a root layout to hold both vb1 and vb2
    VBox rootLayout = new VBox();
    rootLayout.setSpacing(20);
    rootLayout.getChildren().addAll(vb1, vb2, vb3, vb4);

    Scene sc = new Scene(rootLayout, 480, 820);
    stage.setScene(sc);
    stage.show();
  }

  private class RadioAndCBHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
      FontWeight fw = FontWeight.NORMAL;
      FontPosture fp = FontPosture.REGULAR;

      if (c1.isSelected()) {
        c2.setSelected(false);
        c3.setSelected(false);
      }

      if (r1.isSelected())
        t.setFill(Paint.valueOf("RED"));
      if (r2.isSelected())
        t.setFill(Paint.valueOf("GREEN"));
      if (r3.isSelected())
        t.setFill(Paint.valueOf("BLUE"));

      if (c2.isSelected())
        fw = FontWeight.BOLD;
      if (c3.isSelected())
        fp = FontPosture.ITALIC;

      t.setFont(Font.font("Helvetica", fw, fp, cb.getValue()));
    }
  }

  public static void main(String[] args) {
    launch(args);
  }
}
