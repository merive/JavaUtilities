import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Watch implements ActionListener {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("'Today' dd.MM.yyyy, HH:mm:ss");
    JFrame jf;
    JLabel timeLabel;
    JButton colorButton;

    public Watch() {
        jf = new JFrame("Watch");

        jf.setBackground(Color.BLACK);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(null);

        timeLabel = new JLabel("");
        timeLabel.setBounds(12, 19, 576, 59);
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 28));
        timeLabel.setForeground(Color.GREEN);
        jf.getContentPane().add(timeLabel);

        colorButton = new JButton("");
        colorButton.setBounds(100, 97, 400, 17);
        colorButton.addActionListener(this);
        colorButton.setIcon(new ImageIcon(getClass().getResource("rainbow.gif")));
        jf.getContentPane().add(colorButton);

        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime now = LocalDateTime.now();
            String nowFormatted = dateTimeFormatter.format(now);
            SwingUtilities.invokeLater(() -> timeLabel.setText(nowFormatted));
        }, 0, 1, TimeUnit.SECONDS);

        jf.setSize(615, 170);
        jf.setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(Watch::new);
    }

    public void actionPerformed(ActionEvent e) {
        Color[] colors = {Color.GRAY, Color.BLUE, Color.GREEN, Color.CYAN,
                Color.MAGENTA, Color.RED, Color.WHITE, Color.PINK, Color.YELLOW, Color.ORANGE};
        timeLabel.setForeground(colors[new Random().nextInt(colors.length - 1)]);
    }
}
