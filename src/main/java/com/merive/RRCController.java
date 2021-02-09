package com.merive;

import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RRCController {
    public Spinner<Integer> key;
    public TextArea message;
    public TextField result;

    public void decrypt() {
        result.setText(Decrypt.decrypt(message.getText(), key.getValue()));
    }

    public void encrypt() {
        result.setText(Encrypt.encrypt(message.getText(), key.getValue()));
    }
}
