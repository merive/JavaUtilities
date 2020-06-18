package RandomName;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Random;

public class RandomNameController {

    public Label res;
    public TextField text;
    public Pane pane;
    public Pane startPane;

    public void Run() {
        res.setText("And it's: " +
                text.getText().split(" ")[new Random().nextInt(text.getText().split(" ").length)]);
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }
}
