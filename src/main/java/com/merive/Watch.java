package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Watch extends Application {

    public static void main(String[] args) {
        launch();
        System.exit(0);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Watch.fxml"));
        primaryStage.setTitle("Watch");
        primaryStage.getIcons().add(new Image(getClass().getResource("clock.png").toString()));
        primaryStage.setScene(new Scene(root, 615, 170));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}

