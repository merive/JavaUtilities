import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class RandomNameController {

    public Label res;
    public TextField text;
    public javafx.scene.layout.Pane Pane;

    public void Run() {
        res.setText("And it's: " +
                text.getText().split(" ")[new Random().nextInt(text.getText().split(" ").length)]);
    }
}