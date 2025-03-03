// Kyle Marlia-Conner
// 03/02/2025
// Assignment 11.2

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));

        Button button1 = new Button("Button 1");
        GridPane.setConstraints(button1, 0, 0);

        Button button2 = new Button("Button 2");
        GridPane.setConstraints(button2, 1, 0);

        Button button3 = new Button("Button 3");
        GridPane.setConstraints(button3, 0, 1);

        Button button4 = new Button("Button 4");
        GridPane.setConstraints(button4, 1, 1);

        Button button5 = new Button("Button 5");
        GridPane.setConstraints(button5, 0, 2, 2, 1);

        gridPane.getChildren().addAll(button1, button2, button3, button4, button5);

        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setTitle("GridPane Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
