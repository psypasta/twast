package battleship;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Hello World!");
            Button btn = new Button();
            btn.setText("Say 'Hello World'");
            btn.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Hello World!");
                }
            });
            Button btn1 = new Button();
            btn.setText("Say 'Hello World'");

            Rectangle rect1 = new Rectangle(100, 100, 200, 200);

            rect1.setFill(Color.MAGENTA);
            rect1.setStroke(Color.BLACK);
            rect1.setStrokeWidth(3);


            rect1.setTranslateX(100);
            rect1.setTranslateY(100);
            rect1.setRotate(90);

            HBox hbox1 = new HBox(10);     // sets spacing
            hbox1.getChildren().addAll(btn, btn1, rect1);
            hbox1.setAlignment(Pos.CENTER);
            hbox1.setPadding(new Insets(10));
            hbox1.setSpacing(10);

            //StackPane root = new StackPane();
            //root.getChildren().add(btn);
            primaryStage.setScene(new Scene(hbox1, 300, 250));
            primaryStage.show();
        }
    }
