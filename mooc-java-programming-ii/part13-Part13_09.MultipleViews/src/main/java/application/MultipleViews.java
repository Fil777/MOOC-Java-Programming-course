package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane bPane = new BorderPane();
        Button btnToSecond = new Button("To the second view!");
        bPane.setTop(new Label("First view!"));
        bPane.setCenter(btnToSecond);

        Button btnToThird = new Button("To the third view!");
        VBox vBox = new VBox();
        vBox.getChildren().add(btnToThird);
        vBox.getChildren().add(new Label("Second view!"));
        
        GridPane gPane = new GridPane();
        gPane.add(new Label("Third view!"), 0, 0);
        Button btnToFirst = new Button("To the first view!");
        gPane.add(btnToFirst, 1, 1);

        Scene first = new Scene(bPane);
        Scene second = new Scene(vBox);
        Scene third = new Scene(gPane);

        btnToSecond.setOnAction((event) -> {
            window.setScene(second);
        });

        btnToThird.setOnAction((event) -> {
            window.setScene(third);
        });

        btnToFirst.setOnAction((event) -> {
            window.setScene(first);
        });

        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
}
