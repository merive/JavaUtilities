import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RandomName implements ActionListener {

    JFrame jf;
    JLabel jl, jlRes;
    JTextField jtf;
    JButton jb;

    RandomName() {
        jf = new JFrame("Random Name");
        jf.setSize(450, 150);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jl = new JLabel("Enter the names (Separated by space) and press ENTER.");

        jtf = new JTextField(40);
        jtf.setActionCommand("Start");

        jb = new JButton("To begin");
        jb.setPreferredSize(new Dimension(402, 25));

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
        SwingUtilities.invokeLater(RandomName::new);
    }

    public void actionPerformed(ActionEvent ae) {
        jlRes.setText("And it's: " +
                jtf.getText().split(" ")[new Random().nextInt(jtf.getText().split(" ").length)]);
    }
}
