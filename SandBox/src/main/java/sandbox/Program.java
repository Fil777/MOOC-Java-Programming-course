package sandbox;

import java.time.LocalDate;
import java.time.LocalTime;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Program extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setPrefSize(300,200);

        TextArea text = new TextArea("Hello!");
        
        GridPane gridPane = new GridPane();

        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                gridPane.add(new Button("" + x + ", " + y), x, y);
            }
        }
        
        VBox box = new VBox();
        
        box.getChildren().addAll(text, gridPane);
        
        layout.setCenter(box);
        
        LocalDate ld = LocalDate.now();
        LocalTime tm = LocalTime.now();
        String s = tm.toString();
//        int dy = LocalDate.getDayOfYear();  
//        text.setText(Integer.valueOf(dy));

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
