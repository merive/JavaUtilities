import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.mail.MessagingException;

public class MailController {
    public TextField yEmail;
    public PasswordField yPassword;
    public TextField to;
    public Spinner<Integer> qty;
    public TextField title;
    public TextArea message;
    public TextField res;


    public void send() {
        try {
            if (!yEmail.getText().equals("")) {
                yPassword.getText();
                if (!to.getText().equals("")) {
                    for (int i = 1; i < qty.getValue() + 1; i++) {
                        SendEmail se = new SendEmail();
                        se.send(yEmail.getText(), yPassword.getText(), to.getText(),
                                title.getText(), message.getText());
                        res.setText("Result: OK.");
                    }
                } else {
                    res.setText("Result: Write To.");
                }
            } else {
                res.setText("Result: Write you email.");
            }
        } catch (MessagingException me) {
            res.setText("Result: Email or Password not accepted.");
        }
    }
}
