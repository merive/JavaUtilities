package SendEmail;

import javax.mail.MessagingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mail implements ActionListener {

    JFrame jf;
    JTextField emailTF, titleTF, toTF;
    JPasswordField passwordTF;
    JLabel email, toLb, YouPassword, mes, title, res;
    JButton send;
    JTextPane message;

    Mail() {
        jf = new JFrame("Mail");
        jf.setSize(631, 414);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(null);

        email = new JLabel("You email:");
        email.setFont(new Font("Verdana", Font.PLAIN, 12));
        email.setBounds(27, 26, 77, 23);
        jf.getContentPane().add(email);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        emailTF.setBounds(27, 51, 119, 23);
        jf.getContentPane().add(emailTF);
        emailTF.setColumns(10);

        YouPassword = new JLabel("You password:");
        YouPassword.setFont(new Font("Verdana", Font.PLAIN, 12));
        YouPassword.setBounds(27, 92, 119, 23);
        jf.getContentPane().add(YouPassword);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(27, 117, 119, 23);
        jf.getContentPane().add(passwordTF);

        toLb = new JLabel("To:");
        toLb.setFont(new Font("Verdana", Font.PLAIN, 12));
        toLb.setBounds(467, 29, 119, 16);
        jf.getContentPane().add(toLb);

        toTF = new JTextField();
        toTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        toTF.setColumns(10);
        toTF.setBounds(467, 51, 119, 23);
        jf.getContentPane().add(toTF);

        title = new JLabel("Title:");
        title.setFont(new Font("Verdana", Font.PLAIN, 12));
        title.setBounds(467, 95, 119, 16);
        jf.getContentPane().add(title);

        titleTF = new JTextField();
        titleTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        titleTF.setColumns(10);
        titleTF.setBounds(467, 117, 119, 23);
        jf.getContentPane().add(titleTF);

        message = new JTextPane();
        message.setBounds(27, 173, 559, 170);
        jf.getContentPane().add(message);

        send = new JButton("Send");
        send.setBounds(170, 51, 273, 89);
        jf.getContentPane().add(send);
        send.addActionListener(this);

        res = new JLabel("Result:");
        res.setFont(new Font("Verdana", Font.PLAIN, 12));
        res.setBounds(27, 344, 559, 23);
        jf.getContentPane().add(res);

        mes = new JLabel("Message:");
        mes.setFont(new Font("Verdana", Font.PLAIN, 12));
        mes.setBounds(27, 150, 119, 23);
        jf.getContentPane().add(mes);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Mail::new);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
        if (!emailTF.getText().equals("")) {
            passwordTF.getPassword();
            if (!toTF.getText().equals("")) {
                SendEmail se = new SendEmail();
                se.send(emailTF.getText(), new String(passwordTF.getPassword()), toTF.getText(),
                        titleTF.getText(), message.getText());
                res.setText("Result: OK.");
            }
            else {
                res.setText("Result: Write To.");
            }
        }
        else {
            res.setText("Result: Write you email.");
        }
        } catch (MessagingException me) {
            res.setText("Result: Username and Password not accepted.");
        }
    }
}
