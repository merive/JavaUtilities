package com.merive;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(new Image(getClass().getResource("calculator.png").toString()));
        primaryStage.setScene(new Scene(root, 216, 242));
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
