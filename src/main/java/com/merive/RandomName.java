package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class RandomName extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/random_name.fxml"));
        primaryStage.setTitle("RandomName");
        primaryStage.getIcons().add(new Image(getClass().getResource("icons/random_name_icon.png").toString()));
        primaryStage.setScene(new Scene(root, 600, 200));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
