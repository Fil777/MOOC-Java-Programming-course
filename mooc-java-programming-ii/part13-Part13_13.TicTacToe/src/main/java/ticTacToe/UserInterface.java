package ticTacToe;

import javafx.scene.Parent;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Fil
 */
import ticTacToe.FairPlay;

public class UserInterface {

    private BorderPane layout;
    private Label playInfo;
    private Label playStop;
    private GridPane playField;
    private Button[][] buttons;

    public UserInterface() {
        layout = new BorderPane();
        playField = new GridPane();
        playInfo = new Label("Turn: X");
        playInfo.setFont(Font.font("Monospaced", 30.0));
        playStop = new Label("");
        playStop.setFont(Font.font("Monospaced", 30.0));
        layout.setTop(playInfo);
        layout.setCenter(playField);
        layout.setBottom(playStop);
        buttons = new Button[3][3];
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                buttons[x][y] = new Button(" ");
                buttons[x][y].setFont(Font.font("Monospaced", 40.0));
                playField.add(buttons[x][y], x, y);
            }
        }
    }

    public Parent getPlayField(FairPlay game) {
        return layout;
    }

    public void play(FairPlay game, int x, int y) {
        buttons[x][y].setOnAction((event) -> {
            if (game.isEmpty(x, y)) {
                if (!game.victory()) {
                    buttons[x][y].setText(game.getTurn());
                    game.makeTurn(x, y);
                    playInfo.setText("Turn: " + game.getTurn());
                    if (game.victory()) {
                        playInfo.setText("The end!");
                        playStop.setText("The end!");
                    } 
                }
            }
        });
    }
}
