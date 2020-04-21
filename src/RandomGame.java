import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomGame implements ActionListener {

    JFrame jf;
    JLabel jl, jlRes;
    JTextField jtf;
    JButton jb;

    RandomGame() {
        jf = new JFrame("Random Game");
        jf.setSize(450, 150);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jl = new JLabel("Enter the name of the games, etc. (Separated by space) and press ENTER.");

        jtf = new JTextField(40);
        jtf.setActionCommand("Start");

        jb = new JButton("To begin");
        jb.setPreferredSize(new Dimension(402,25));

        jtf.addActionListener(this);
        jb.addActionListener(this);

        jlRes = new JLabel("And it's: ");

        jf.add(jl);
        jf.add(jtf);
        jf.add(jb);
        jf.add(jlRes);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RandomGame::new);
    }

    public void actionPerformed(ActionEvent ae) {
        jlRes.setText("And it's: " +
                jtf.getText().split(" ")[new Random().nextInt(jtf.getText().split(" ").length)]);
    }
}
