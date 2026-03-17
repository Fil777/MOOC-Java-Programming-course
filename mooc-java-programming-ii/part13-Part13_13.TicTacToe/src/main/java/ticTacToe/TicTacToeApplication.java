package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import ticTacToe.FairPlay;
import ticTacToe.UserInterface;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage stage) {

        FairPlay game = new FairPlay();
        UserInterface ui = new UserInterface();

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                ui.play(game, x, y) ;
            }
        }

        Scene view = new Scene(ui.getPlayField(game), 400, 300);

        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
