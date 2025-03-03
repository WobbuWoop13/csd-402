// Kyle Marlia-Conner
// 03/02/2025
// Assignment 11.2

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setHgap(10);
        flowPane.setVgap(10);
        flowPane.setPrefWrapLength(300);

        for (int i = 1; i <= 10; i++) {
            Button button = new Button("Button " + i);
            flowPane.getChildren().add(button);
        }

        Scene scene = new Scene(flowPane, 400, 200);
        primaryStage.setTitle("FlowPane Example: Try shrinking and enlarging the window!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
