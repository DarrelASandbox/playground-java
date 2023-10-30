package src._31javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

// Different Ways of Handling Events
public class _03EventFX extends Application {
  Button b1, b2, b3;
  int count = 0;

  @Override
  public void start(Stage stage) throws Exception {
    // Implementing Interface
    b1 = new Button("b1");
    b1.setOnAction(new B1ClickHandler());
    b1.setPrefSize(100, 30);

    // Anonymous Inner Class
    b2 = new Button("b2");
    b2.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent e) {
        b2.setText("" + ++count);
      }
    });
    b2.setPrefSize(100, 30);

    // Lambda Expression
    b3 = new Button("b3");
    b3.setOnAction(e -> b3.setText("" + ++count));
    b3.setPrefSize(100, 30);

    FlowPane fp = new FlowPane(b1, b2, b3);
    Scene sc = new Scene(fp, 400, 400);
    stage.setScene(sc);
    stage.show();
  }

  private class B1ClickHandler implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent e) {
      b1.setText("" + ++count);
    }
  }

  public static void main(String[] args) {
    launch();
  }
}
