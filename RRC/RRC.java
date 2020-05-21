import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RRC implements ActionListener {

    JFrame jf;
    JLabel rrc, et, res;
    JTextPane jtp;
    JButton encrypt, decrypt;

    RRC() {
        jf = new JFrame("RRC");
        jf.setSize(600, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rrc = new JLabel("Random Replacement Cipher");
        rrc.setFont(new Font("Verdana", Font.PLAIN, 16));
        rrc.setBounds(175, 20, 236, 19);

        et = new JLabel("Enter text:");
        et.setFont(new Font("Verdana", Font.PLAIN, 16));
        et.setBounds(10, 67, 89, 19);

        res = new JLabel("Result: ");
        res.setFont(new Font("Verdana", Font.PLAIN, 14));
        res.setVerticalAlignment(SwingConstants.TOP);
        res.setBounds(10, 281, 566, 72);

        jtp = new JTextPane();
        jtp.setBounds(10, 96, 566, 95);

        encrypt = new JButton("Encrypt");
        encrypt.setFont(new Font("Verdana", Font.PLAIN, 16));
        encrypt.setBounds(10, 201, 284, 70);
        encrypt.addActionListener(this);

        decrypt = new JButton("Decrypt");
        decrypt.setFont(new Font("Verdana", Font.PLAIN, 16));
        decrypt.setBounds(304, 201, 272, 70);
        decrypt.addActionListener(this);
        jf.getContentPane().setLayout(null);

        jf.getContentPane().add(rrc);
        jf.getContentPane().add(et);
        jf.getContentPane().add(jtp);
        jf.getContentPane().add(encrypt);
        jf.getContentPane().add(decrypt);
        jf.getContentPane().add(res);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RRC::new);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Decrypt")) {
            res.setText("Result:\n" + Decrypt.decrypt(jtp.getText(), 23));
        } else {
            res.setText("Result:\n" + Encrypt.encrypt(jtp.getText(), 23));
        }
    }
}
