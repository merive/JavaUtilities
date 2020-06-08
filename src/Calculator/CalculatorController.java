import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    public TextField ResBar;


    @FXML
    void pressClear() {
        ResBar.setText("");
    }

    @FXML
    void press0() {
        ResBar.setText(ResBar.getText() + "0");
    }

    @FXML
    void press1() {
        ResBar.setText(ResBar.getText() + "1");
    }

    @FXML
    void press2() {
        ResBar.setText(ResBar.getText() + "2");
    }

    @FXML
    void press3() {
        ResBar.setText(ResBar.getText() + "3");
    }

    @FXML
    void press4() {
        ResBar.setText(ResBar.getText() + "4");
    }

    @FXML
    void press5() {
        ResBar.setText(ResBar.getText() + "5");
    }

    @FXML
    void press6() {
        ResBar.setText(ResBar.getText() + "6");
    }

    @FXML
    void press7() {
        ResBar.setText(ResBar.getText() + "7");
    }

    @FXML
    void press8() {
        ResBar.setText(ResBar.getText() + "8");
    }

    @FXML
    void press9() {
        ResBar.setText(ResBar.getText() + "9");
    }
}
