package hurraa;

import java.io.File;
import javax.sound.sampled.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.media.AudioClip;

public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();

        Button nappi = new Button("Hurraa!");
        pane.setCenter(nappi);

//      compiled after update of file "pom.xml" :
//        <dependency>
//            <groupId>org.openjfx</groupId>
//            <artifactId>javafx-media</artifactId>
//            <version>18.0.1</version>
//        </dependency>
        AudioClip sound = new AudioClip("file:Applause-Yannick_Lemieux.wav");

        nappi.setOnAction((event) -> {
            sound.play();
            //playSound("htf_theme.mp3");
            //playSound("Applause-Yannick_Lemieux.wav");
        });

        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void playSound(String soundFileName) {
        try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(soundFileName)));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
