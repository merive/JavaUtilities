package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Mail extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Mail.fxml"));
        primaryStage.setTitle("Mail");
        primaryStage.getIcons().add(new Image(getClass().getResource("email.png").toString()));
        primaryStage.setScene(new Scene(root, 700, 360));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}