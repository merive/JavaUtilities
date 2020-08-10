package Calculator;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.Arrays;

public class CalculatorController {

    public TextField ResBar;
    public String OPERATOR = "";
    public Pane pane;
    public Pane startPane;
    int num1, num2;


    @FXML
    void pressClear() {
        ResBar.setText("");
        OPERATOR = "";
    }

    @FXML
    void press0() {
        checkError();
        ResBar.setText(ResBar.getText() + "0");
    }

    @FXML
    void press1() {
        checkError();
        ResBar.setText(ResBar.getText() + "1");
    }

    @FXML
    void press2() {
        checkError();
        ResBar.setText(ResBar.getText() + "2");
    }

    @FXML
    void press3() {
        checkError();
        ResBar.setText(ResBar.getText() + "3");
    }

    @FXML
    void press4() {
        checkError();
        ResBar.setText(ResBar.getText() + "4");
    }

    @FXML
    void press5() {
        checkError();
        ResBar.setText(ResBar.getText() + "5");
    }

    @FXML
    void press6() {
        checkError();
        ResBar.setText(ResBar.getText() + "6");
    }

    @FXML
    void press7() {
        checkError();
        ResBar.setText(ResBar.getText() + "7");
    }

    @FXML
    void press8() {
        checkError();
        ResBar.setText(ResBar.getText() + "8");
    }

    @FXML
    void press9() {
        checkError();
        ResBar.setText(ResBar.getText() + "9");
    }

    @FXML
    void pressPlus() {
        checkError();
        if (OPERATOR.equals("")) {
            ResBar.setText(ResBar.getText() + "+");
            OPERATOR = "+";
        } else {
            getRes();
        }
    }

    @FXML
    void pressMinus() {
        checkError();
        if (OPERATOR.equals("")) {
            ResBar.setText(ResBar.getText() + "-");
            OPERATOR = "-";
        } else {
            getRes();
        }
    }

    @FXML
    void pressMulti() {
        checkError();
        if (OPERATOR.equals("")) {
            ResBar.setText(ResBar.getText() + "*");
            OPERATOR = "*";
        } else {
            getRes();
        }
    }

    @FXML
    void pressDivision() {
        checkError();
        if (OPERATOR.equals("")) {
            ResBar.setText(ResBar.getText() + "/");
            OPERATOR = "/";
        } else {
            getRes();
        }
    }

    @FXML
    void pressEqually() {
        checkError();
        if (OPERATOR.equals("")) {
            ResBar.setText(Arrays.toString(ResBar.getText().split(OPERATOR)));
        } else {
            getRes();
        }
    }

    public void checkError() {
        if (ResBar.getText().equals("Error")) {
            ResBar.setText("");
            OPERATOR = "";
        }
    }

    public void getRes() {
        String[] numbers = ResBar.getText().split(String.format("\\%s", OPERATOR));
        try {
            num1 = Integer.parseInt(numbers[0]);
            num2 = Integer.parseInt(numbers[1]);
        } catch (Exception e) {
            ResBar.setText("Error");
            OPERATOR = "";
        }
        switch (OPERATOR) {
            case "+":
                ResBar.setText(Integer.toString(num1 + num2));
                OPERATOR = "";
                break;
            case "-":
                ResBar.setText(Integer.toString(num1 - num2));
                OPERATOR = "";
                break;
            case "*":
                ResBar.setText(Integer.toString(num1 * num2));
                OPERATOR = "";
                break;
            case "/":
                try {
                    ResBar.setText(Integer.toString(num1 / num2));
                    OPERATOR = "";
                    break;
                } catch (ArithmeticException exc) {
                    ResBar.setText("Error");
                    OPERATOR = "";
                    break;
                }
        }
    }

    public void start() {
        startPane.setVisible(false);
        pane.setVisible(true);
    }
}
