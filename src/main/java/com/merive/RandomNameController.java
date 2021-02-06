package com.merive;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Random;

public class RandomNameController {
    public TextField text;
    public Pane pane;
    public Pane startPane;
    public Alert alert;

    public void Run() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("Result: " +
                text.getText().split(" ")[new Random().nextInt(text.getText().split(" ").length)]);
        alert.showAndWait();
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }
}
