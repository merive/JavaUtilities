import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;

public class RRCController {
    public Spinner<Integer> key;
    public TextArea mes, res;

    public void decrypt() {
        res.setText(Decrypt.decrypt(mes.getText(), key.getValue()));
    }

    public void encrypt() {
        res.setText(Encrypt.encrypt(mes.getText(), key.getValue()));
    }
}
