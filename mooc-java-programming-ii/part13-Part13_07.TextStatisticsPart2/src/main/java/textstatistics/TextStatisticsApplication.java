package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox texts = new HBox();
        texts.setSpacing(10);
        Label[] labels = {
            new Label("Letters: "),
            new Label("Words: "),
            new Label("The longest word is: ")};
        texts.getChildren().addAll(labels);
        TextArea textArea = new TextArea();

        layout.setBottom(texts);
        layout.setCenter(textArea);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" "); //("[\\.:?!,\\s]+");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            labels[0].setText("Letters: " + characters);
            labels[1].setText("Words: " + words);
            labels[2].setText("The longest word is: " + longest);
        }
        );

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
