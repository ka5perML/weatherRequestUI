package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class Main extends Application {

    public static void main(String[] args) throws IOException {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/info.fxml"));
        Image ico = new Image("/images.png");
        stage.initStyle(StageStyle.DECORATED);
        stage.setTitle("Погода без смс и регистрации");
        stage.getIcons().add(ico);
        stage.setScene(new Scene(root,720,520));
        stage.setResizable(false);
        stage.show();
    }

}