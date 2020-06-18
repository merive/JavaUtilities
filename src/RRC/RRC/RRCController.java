package RRC;

import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

public class RRCController {
    public Spinner<Integer> key;
    public TextArea mes, res;
    public Pane pane;
    public Pane startPane;

    public void decrypt() {
        res.setText(Decrypt.decrypt(mes.getText(), key.getValue()));
    }

    public void encrypt() {
        res.setText(Encrypt.encrypt(mes.getText(), key.getValue()));
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }
}
