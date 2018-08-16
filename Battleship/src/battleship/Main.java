package battleship;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private GraphicsContext context;
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) {
            StackPane root = new StackPane();
            Canvas canvas = new Canvas(WIDTH, HEIGHT);
            context = canvas.getGraphicsContext2D();

            canvas.setFocusTraversable(true);
            // canvas.setOnKeyPressed();

            root.getChildren().add(canvas);

            Scene scene = new Scene(root);

            primaryStage.setResizable(false);
            primaryStage.setTitle("Snake");
            primaryStage.setOnCloseRequest(e -> System.exit(0));
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
