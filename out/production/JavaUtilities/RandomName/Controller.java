import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    public Label res;
    public TextField text;

    public void Run(ActionEvent actionEvent) {
        res.setText("And it's: " +
                text.getText().split(" ")[new Random().nextInt(text.getText().split(" ").length)]);
    }
}
