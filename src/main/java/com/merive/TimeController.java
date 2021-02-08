package com.merive;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimeController implements Initializable {

    @FXML
    Label time;

    public void start() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Today' dd.MM.yyyy, HH:mm:ss");
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime now = LocalDateTime.now();
            String nowFormatted = dateTimeFormatter.format(now);
            Platform.runLater(() -> time.setText(nowFormatted));
        }, 0, 1, TimeUnit.SECONDS);
    }

    public void setColor() {
        Color[] colors = {Color.GRAY, Color.BLUE, Color.GREEN, Color.CYAN,
                Color.MAGENTA, Color.RED, Color.WHITE, Color.PINK, Color.YELLOW, Color.ORANGE};
        time.setTextFill(colors[new Random().nextInt(colors.length - 1)]);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        start();
    }
}
