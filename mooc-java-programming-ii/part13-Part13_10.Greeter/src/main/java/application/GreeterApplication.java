package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {

        // 1. Creating the view for asking a password
        // 1.1 Creating components to be used
        Label instructionText1 = new Label("Enter your name: ");
        TextField loginField = new TextField();
        Label instructionText2 = new Label("Enter your password: ");
        PasswordField passwordField = new PasswordField();
        Button startButton = new Button("Login");
        Label errorMessage = new Label();

        // 1.2 creating layout and adding components to it
        GridPane layout = new GridPane();

        layout.add(instructionText1, 0, 0);
        layout.add(loginField, 1, 0);
        layout.add(instructionText2, 0, 1);
        layout.add(passwordField, 1, 1);
        layout.add(startButton, 0, 2);
        layout.add(errorMessage, 0, 3);

        // 1.3 styling the layout
        layout.setPrefSize(400, 240);
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(20, 20, 20, 20));

        // 1.4 creating the view itself and setting it to use the layout
        Scene loginView = new Scene(layout);

        // 2. Creating a view for showing the welcome message
        Label welcomeText = new Label();

        StackPane welcomeLayout = new StackPane();
        welcomeLayout.setPrefSize(300, 100);
        welcomeLayout.getChildren().add(welcomeText);
        welcomeLayout.setAlignment(Pos.CENTER);

        // 3. Adding listener for login field.
        loginField.textProperty().addListener((change, oldValue, newValue) -> {
            loginField.setText(capitalize(newValue));
        });

        Scene welcomeView = new Scene(welcomeLayout);
        // 4. Adding an event handler to the login button.
        // The view is changed after button pressed.
        startButton.setOnAction((event) -> {
            if (loginField.getText() == null || passwordField.getText() == null) {
                errorMessage.setText("Null login or password!");
                return;
            }
            if (loginField.getText().isEmpty() || passwordField.getText().isEmpty()) {
                errorMessage.setText("Empty login or password!");
                return;
            }
            if (!passwordField.getText().trim().equals("password")) {
                errorMessage.setText("Unknown password!");
                return;
            }
            welcomeText.setText("Welcome " + loginField.getText() + "!");
            window.setScene(welcomeView);
        });

        window.setScene(loginView);
        window.show();
    }
    
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] parts = str.trim().split("[,\\s]+");
        String result = "";
        for (String word : parts) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
