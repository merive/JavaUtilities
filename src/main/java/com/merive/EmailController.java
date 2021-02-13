package com.merive;

import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.mail.MessagingException;

public class EmailController {
    public TextField login, password, title, to;
    public TextArea message;
    public Alert alert;

    public void send() {
        try {
            if (!login.getText().equals("")) {
                password.getText();
                if (!to.getText().equals("")) {
                    Sender se = new Sender();
                    se.send(login.getText(), password.getText(), to.getText(),
                            title.getText(), message.getText());
                    getAlert("Result: OK");
                } else {
                    getAlert("Result: Write To.");
                }
            } else {
                getAlert("Result: Write you email.");
            }
        } catch (MessagingException me) {
            getAlert("Result: Email or Password not accepted.");
        }
    }

    public void getAlert(String res) {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText(res);
        alert.showAndWait();
    }
}
