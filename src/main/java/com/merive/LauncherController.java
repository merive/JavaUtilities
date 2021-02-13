package com.merive;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LauncherController implements Initializable {

    @FXML
    Label label;

    @FXML
    Button startButton, noteButton, calculatorButton, mailButton, watchButton, RRCButton, exitButton;

    @FXML
    ImageView launcherImage, noteImage, calculatorImage, mailImage, watchImage, RRCImage;

    String selectedApplication;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selectedApplication = "";
    }

    public void clickStartButton() {
        if (!selectedApplication.equals("")) {
            switch (selectedApplication) {
                case "Note":
                    Platform.runLater(() -> {
                        try {
                            new Note().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case "Calculator":
                    Platform.runLater(() -> {
                        try {
                            new Calculator().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case "Email":
                    Platform.runLater(() -> {
                        try {
                            new Email().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case "Time":
                    Platform.runLater(() -> {
                        try {
                            new Time().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
                case "RRC":
                    Platform.runLater(() -> {
                        try {
                            new RRC().start(new Stage());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                    break;
            }
        }
    }

    public void clickNote() {
        selectedApplication = "Note";
        resetButtons();
        noteButton.setStyle("-fx-background-color: #3282b8; -fx-border-color: #bbe1fa; -fx-border-width: 4px;");
        resetImage();
        noteImage.setVisible(true);
        label.setText("Selected: Note");
    }

    public void clickCalculator() {
        selectedApplication = "Calculator";
        resetButtons();
        calculatorButton.setStyle("-fx-background-color: #3282b8; -fx-border-color: #bbe1fa; -fx-border-width: 4px;");
        resetImage();
        calculatorImage.setVisible(true);
        label.setText("Selected: Calculator");
    }

    public void clickMail() {
        selectedApplication = "Email";
        resetButtons();
        mailButton.setStyle("-fx-background-color: #3282b8; -fx-border-color: #bbe1fa; -fx-border-width: 4px;");
        resetImage();
        mailImage.setVisible(true);
        label.setText("Selected: Email");
    }

    public void clickWatch() {
        selectedApplication = "Time";
        resetButtons();
        watchButton.setStyle("-fx-background-color: #3282b8; -fx-border-color: #bbe1fa; -fx-border-width: 4px;");
        resetImage();
        watchImage.setVisible(true);
        label.setText("Selected: Time");
    }

    public void clickRRC() {
        selectedApplication = "RRC";
        resetButtons();
        RRCButton.setStyle("-fx-background-color: #3282b8; -fx-border-color: #bbe1fa; -fx-border-width: 4px;");
        resetImage();
        RRCImage.setVisible(true);
        label.setText("Selected: RRC");
    }

    public void exit() {
        System.exit(0);
    }

    public void resetButtons() {
        noteButton.setStyle("-fx-background-color: #bbe1fa; -fx-border-color: #0f4c75; -fx-border-width: 4px;");
        calculatorButton.setStyle("-fx-background-color: #bbe1fa; -fx-border-color: #0f4c75; -fx-border-width: 4px;");
        mailButton.setStyle("-fx-background-color: #bbe1fa; -fx-border-color: #0f4c75; -fx-border-width: 4px;");
        watchButton.setStyle("-fx-background-color: #bbe1fa; -fx-border-color: #0f4c75; -fx-border-width: 4px;");
        RRCButton.setStyle("-fx-background-color: #bbe1fa; -fx-border-color: #0f4c75; -fx-border-width: 4px;");
    }

    public void resetImage() {
        launcherImage.setVisible(false);
        noteImage.setVisible(false);
        calculatorImage.setVisible(false);
        mailImage.setVisible(false);
        watchImage.setVisible(false);
        RRCImage.setVisible(false);
    }
}
