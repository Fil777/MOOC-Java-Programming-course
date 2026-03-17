package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        layout.setMaxSize(350, 200);
        TextArea jokeArea = new TextArea();
        TextArea answerArea = new TextArea();
        TextArea explanationArea = new TextArea();
        VBox contents = new VBox();
        contents.getChildren().addAll(jokeArea, answerArea,explanationArea);
        HBox buttonsBox = new HBox();
        buttonsBox.setSpacing(20);
        Button btnJoke = new Button("Joke");
        btnJoke.setMinWidth(100);
        Button btnAnswer = new Button("Answer");
        btnAnswer.setMinWidth(100);
        Button btnExplanation = new Button("Explanation");
        btnExplanation.setMinWidth(100);
        
        buttonsBox.getChildren().addAll(btnJoke, btnAnswer, btnExplanation);
        
        layout.setBottom(buttonsBox);
        layout.setCenter(contents);

        jokeArea.setText("What do you call a bear with no teeth?");

        Scene view = new Scene(layout);

        btnJoke.setOnAction((event) -> {
            jokeArea.setText("What do you call a bear with no teeth?");
        });
        
        btnAnswer.setOnAction((event) -> {
            answerArea.setText("A gummy bear.");
        });
        
        btnExplanation.setOnAction((event) -> {
            explanationArea.setText("Dump joke.");
        });
        
        
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
