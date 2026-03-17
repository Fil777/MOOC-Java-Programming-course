package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Application.Parameters params = getParameters();
        String myTitle = params.getNamed().get("title");
        window.setTitle(myTitle);
        window.show();
    }



}
