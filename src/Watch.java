import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Watch {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Today' dd.MM.yyyy, HH:mm:ss");

    public Watch() {
        JFrame jf = new JFrame("Watch");

        jf.setBackground(Color.BLACK);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel timeLabel = new JLabel("");
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        timeLabel.setForeground(Color.GREEN);
        jf.getContentPane().add(timeLabel);

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime now = LocalDateTime.now();
            String nowFormatted = dateTimeFormatter.format(now);
            SwingUtilities.invokeLater(() -> timeLabel.setText(nowFormatted));
        }, 0, 1, TimeUnit.SECONDS);

        jf.setSize(610, 155);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Watch::new);
    }
}
