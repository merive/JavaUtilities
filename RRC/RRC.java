import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RRC implements ActionListener {

    JFrame jf;
    JLabel rrc, et, res, key;
    JButton encrypt, decrypt;
    JTextArea jta, resTA;
    JSpinner keyQty;

    RRC() {
        jf = new JFrame("RRC");
        jf.setSize(610, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rrc = new JLabel("Random Replacement Cipher");
        rrc.setFont(new Font("Verdana", Font.PLAIN, 16));
        rrc.setBounds(175, 20, 236, 19);

        et = new JLabel("Enter text:");
        et.setFont(new Font("Verdana", Font.PLAIN, 16));
        et.setBounds(10, 56, 89, 19);

        res = new JLabel("Result: ");
        res.setFont(new Font("Verdana", Font.PLAIN, 14));
        res.setVerticalAlignment(SwingConstants.TOP);
        res.setBounds(10, 251, 61, 19);

        encrypt = new JButton("Encrypt");
        encrypt.setFont(new Font("Verdana", Font.PLAIN, 16));
        encrypt.setBounds(10, 176, 242, 60);
        encrypt.addActionListener(this);

        decrypt = new JButton("Decrypt");
        decrypt.setFont(new Font("Verdana", Font.PLAIN, 16));
        decrypt.setBounds(334, 176, 242, 60);
        decrypt.addActionListener(this);
        jf.getContentPane().setLayout(null);

        jf.getContentPane().add(rrc);
        jf.getContentPane().add(et);
        jf.getContentPane().add(encrypt);
        jf.getContentPane().add(decrypt);
        jf.getContentPane().add(res);

        jta = new JTextArea();
        jta.setFont(new Font("Verdana", Font.PLAIN, 14));
        jta.setColumns(4);
        jta.setWrapStyleWord(true);
        jta.setLineWrap(true);
        jta.setBackground(SystemColor.menu);
        jta.setBounds(10, 85, 566, 76);
        jf.getContentPane().add(jta);

        resTA = new JTextArea();
        resTA.setFont(new Font("Verdana", Font.PLAIN, 14));
        resTA.setColumns(4);
        resTA.setTabSize(4);
        resTA.setLineWrap(true);
        resTA.setWrapStyleWord(true);
        resTA.setBackground(SystemColor.menu);
        resTA.setBounds(10, 277, 566, 76);
        jf.getContentPane().add(resTA);


        key = new JLabel("Key:");
        key.setFont(new Font("Verdana", Font.PLAIN, 15));
        key.setBounds(275, 176, 45, 23);
        jf.getContentPane().add(key);

        keyQty = new JSpinner();
        keyQty.setFont(new Font("Verdana", Font.PLAIN, 15));
        keyQty.setModel(new SpinnerNumberModel(23, null, null, 23));
        keyQty.setBounds(262, 206, 62, 23);
        jf.getContentPane().add(keyQty);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RRC::new);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Decrypt")) {
            resTA.setText(Decrypt.decrypt(jta.getText(), (Integer) keyQty.getValue()));
        } else {
            resTA.setText(Encrypt.encrypt(jta.getText(), (Integer) keyQty.getValue()));
        }
    }
}
