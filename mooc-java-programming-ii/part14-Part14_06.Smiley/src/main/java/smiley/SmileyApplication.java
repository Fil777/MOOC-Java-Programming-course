package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {
    
    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(350, 350);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);

        painter.setFill(Color.WHITE);
        painter.clearRect(0, 0, 350, 350);
        painter.setFill(Color.BLACK);
        painter.fillRect(70,50, 50, 50); 
        painter.fillRect(220,50, 50, 50); 
        painter.fillRect(70,250, 200, 50); 
        painter.fillRect(20,200, 50, 50);
        painter.fillRect(270,200, 50, 50);
        
        Scene view = new Scene(paintingLayout); 

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
