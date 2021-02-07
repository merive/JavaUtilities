package com.merive;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.util.Random;

public class RandomNameController {

    public TextField text;
    public Alert alert;

    public void returnResult() {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("Result: " +
                text.getText().split(";")[new Random().nextInt(text.getText().split(";").length)]);
        alert.showAndWait();
    }
}
