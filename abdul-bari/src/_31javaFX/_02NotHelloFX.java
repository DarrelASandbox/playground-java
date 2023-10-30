package src._31javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class _02NotHelloFX extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Button b = new Button("Click _Me");
    b.setTextFill(Color.ORANGE);
    b.setMnemonicParsing(true);

    Tooltip tp = new Tooltip("Don't touch me!");
    b.setTooltip(tp);
    b.setStyle("-fx-border-color:purple;-fx-background-color:black");

    Alert a = new Alert(AlertType.INFORMATION, "OUCH!");
    b.setOnAction(e -> a.show());

    FlowPane fp = new FlowPane();
    fp.getChildren().add(b);
    Scene sc = new Scene(fp, 400, 400);
    stage.setScene(sc);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
