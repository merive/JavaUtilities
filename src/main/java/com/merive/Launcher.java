package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Launcher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("launcher.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("MTools");
        stage.getIcons().add(new Image(getClass().getResource("settings.png").toString()));
        stage.setScene(scene);
        stage.getIcons().add(new Image(getClass().getResource("settings.png").toString()));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}

