package com.merive;

import javafx.scene.control.Alert;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class RRCController {
    public Spinner<Integer> key;
    public TextArea mes, res;
    public Pane pane;
    public Pane startPane;
    public Alert alert;

    public void decrypt() {
        res.setText(Decrypt.decrypt(mes.getText(), key.getValue()));
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("Decrypted");
        alert.showAndWait();
    }

    public void encrypt() {
        res.setText(Encrypt.encrypt(mes.getText(), key.getValue()));
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText("Encrypted");
        alert.showAndWait();
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }
}
