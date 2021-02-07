package com.merive;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Random;

public class RandomNameController {

    public TextField text;
    public Alert alert;
    public Pane splash;

    public void returnResult() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("Result: " +
                text.getText().split(";")[new Random().nextInt(text.getText().split(";").length)]);
        alert.showAndWait();
    }

    public void clickToStart() {
        splash.setVisible(false);
    }
}
