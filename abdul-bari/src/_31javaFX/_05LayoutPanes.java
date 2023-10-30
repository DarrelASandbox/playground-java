package src._31javaFX;

import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class _05LayoutPanes extends Application {
  @Override
  public void start(Stage stage) throws Exception {
    // Buttons for FlowPane
    Button btn1 = new Button("One");
    Button btn2 = new Button("Two");
    Button btn3 = new Button("Three");
    Button btn4 = new Button("Four");
    Button btn5 = new Button("Five");

    // Buttons for TilePane
    Button btn6 = new Button("One");
    Button btn7 = new Button("Two");
    Button btn8 = new Button("Three");
    Button btn9 = new Button("Four");
    Button btn10 = new Button("Five");

    // Buttons for BorderPane
    Button btn11 = new Button("One");
    Button btn12 = new Button("Two");
    Button btn13 = new Button("Three");
    Button btn14 = new Button("Four");
    Button btn15 = new Button("Five");

    // Buttons for HBox
    Button btn16 = new Button("One");
    Button btn17 = new Button("Two");
    Button btn18 = new Button("Three");
    Button btn19 = new Button("Four");
    Button btn20 = new Button("Five");

    // Buttons for GridPane
    Button btn21 = new Button("One");
    Button btn22 = new Button("Two");
    Button btn23 = new Button("Three");
    Button btn24 = new Button("Four");
    Button btn25 = new Button("Five");

    FlowPane fp = new FlowPane();
    fp.setStyle("-fx-border-color: purple;");
    fp.setHgap(10);
    fp.setVgap(5);
    fp.getChildren().addAll(btn1, btn2, btn3, btn4, btn5);

    TilePane tp = new TilePane();
    tp.setStyle("-fx-border-color: orange;");
    tp.getChildren().addAll(btn6, btn7, btn8, btn9, btn10);

    BorderPane bp = new BorderPane();
    bp.setStyle("-fx-border-color: purple;");
    bp.setTop(btn11);
    bp.setBottom(btn12);
    bp.setLeft(btn13);
    bp.setRight(btn14);
    bp.setCenter(btn15);

    HBox hb = new HBox();
    hb.setStyle("-fx-border-color: orange;");
    hb.getChildren().addAll(btn16, btn17, btn18, btn19, btn20);

    GridPane gp = new GridPane();
    gp.setStyle("-fx-border-color: purple;");
    gp.add(btn21, 0, 0);
    gp.add(btn22, 1, 0);
    gp.add(btn23, 0, 1);
    gp.add(btn24, 1, 1);
    gp.add(btn25, 2, 2);

    ImageView iv1 = null;
    ImageView iv2 = null;
    ImageView iv3 = null;

    ImageView iv4 = null;
    ImageView iv5 = null;
    ImageView iv6 = null;

    ImageView iv7 = null;
    ImageView iv8 = null;
    ImageView iv9 = null;

    String baseURL = "src/_31javaFX/images/";
    String pic1 = "curious_white_hair_princess_by_nwawalrus_dfswcwl-pre.jpg";
    String pic2 = "cyberpunk_game_concept_art_2_by_nwawalrus_dgaepfy-pre.jpg";
    String pic3 = "random_ai_art_2_by_nwawalrus_dfmcmug-pre.jpg";

    iv1 = new ImageView(new Image(new FileInputStream(baseURL + pic1)));
    iv2 = new ImageView(new Image(new FileInputStream(baseURL + pic2)));
    iv3 = new ImageView(new Image(new FileInputStream(baseURL + pic3)));

    iv4 = new ImageView(new Image(new FileInputStream(baseURL + pic1)));
    iv5 = new ImageView(new Image(new FileInputStream(baseURL + pic2)));
    iv6 = new ImageView(new Image(new FileInputStream(baseURL + pic3)));

    iv7 = new ImageView(new Image(new FileInputStream(baseURL + pic1)));
    iv8 = new ImageView(new Image(new FileInputStream(baseURL + pic2)));
    iv9 = new ImageView(new Image(new FileInputStream(baseURL + pic3)));

    ScrollPane sp1 = new ScrollPane(iv1);
    ScrollPane sp2 = new ScrollPane(iv2);
    ScrollPane sp3 = new ScrollPane(iv3);

    SplitPane sp = new SplitPane(sp1, sp2, sp3);
    sp.setStyle("-fx-border-color: orange;");
    sp.setDividerPositions(1.0 / 3, 2.0 / 3);

    Tab t1 = new Tab("princess", iv4);
    Tab t2 = new Tab("cyberpunk", iv5);
    Tab t3 = new Tab("ai_art", iv6);

    TabPane tbp = new TabPane();
    tbp.setStyle("-fx-border-color: purple;");
    tbp.getTabs().addAll(t1, t2, t3);

    ScrollPane sp4 = new ScrollPane(iv7);
    ScrollPane sp5 = new ScrollPane(iv8);
    ScrollPane sp6 = new ScrollPane(iv9);

    TitledPane ttp1 = new TitledPane("princess", sp4);
    TitledPane ttp2 = new TitledPane("cyberpunk", sp5);
    TitledPane ttp3 = new TitledPane("ai_art", sp6);

    Accordion ad = new Accordion();
    ad.setStyle("-fx-border-color: orange;");
    ad.getPanes().addAll(ttp1, ttp2, ttp3);

    VBox root = new VBox();
    root.getChildren().addAll(fp, tp, bp, hb, gp, sp, tbp, ad);
    VBox.setMargin(fp, new Insets(10, 0, 10, 0));
    VBox.setMargin(tp, new Insets(10, 0, 10, 0));
    VBox.setMargin(bp, new Insets(10, 0, 10, 0));
    VBox.setMargin(hb, new Insets(10, 0, 10, 0));
    VBox.setMargin(gp, new Insets(10, 0, 10, 0));
    VBox.setMargin(sp, new Insets(10, 0, 10, 0));
    VBox.setMargin(tbp, new Insets(10, 0, 10, 0));
    VBox.setMargin(ad, new Insets(10, 0, 10, 0));

    Scene sc = new Scene(root, 1080, 810);
    stage.setScene(sc);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
