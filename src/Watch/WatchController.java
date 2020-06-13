import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class WatchController {

    @FXML
    Label time;

    public void setTime() {
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
}
