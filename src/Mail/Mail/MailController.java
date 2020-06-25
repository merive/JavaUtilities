package Mail;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;

import javax.mail.MessagingException;

public class MailController {
    public TextField yEmail;
    public PasswordField yPassword;
    public TextField to;
    public Spinner<Integer> qty;
    public TextField title;
    public TextArea message;
    public Pane startPane;
    public Pane pane;
    public Alert alert;

    public void send() {
        try {
            if (!yEmail.getText().equals("")) {
                yPassword.getText();
                if (!to.getText().equals("")) {
                    for (int i = 1; i < qty.getValue() + 1; i++) {
                        SendEmail se = new SendEmail();
                        se.send(yEmail.getText(), yPassword.getText(), to.getText(),
                                title.getText(), message.getText());
                        openAlert("Result: OK");

                    }
                } else {
                    openAlert("Result: Write To.");
                }
            } else {
                openAlert("Result: Write you email.");
            }
        } catch (MessagingException me) {
            openAlert("Result: Email or Password not accepted.");
        }
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }

    public void openAlert(String res) {
        alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setHeaderText(null);
        alert.setContentText(res);
        alert.showAndWait();
    }
}
