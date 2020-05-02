import javax.swing.*;
import java.awt.*;

public class Mail {

    JFrame jf;
    JTextField emailTF, titleTF, fromTF;
    JPasswordField passwordField;
    JLabel email, fromLb, YouPassword, mes, title, res;
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

        passwordField = new JPasswordField();
        passwordField.setBounds(27, 117, 119, 23);
        jf.getContentPane().add(passwordField);

        fromLb = new JLabel("From:");
        fromLb.setFont(new Font("Verdana", Font.PLAIN, 12));
        fromLb.setBounds(467, 29, 119, 16);
        jf.getContentPane().add(fromLb);

        fromTF = new JTextField();
        fromTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        fromTF.setColumns(10);
        fromTF.setBounds(467, 51, 119, 23);
        jf.getContentPane().add(fromTF);

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

        res = new JLabel("Result:");
        res.setFont(new Font("Verdana", Font.PLAIN, 12));
        res.setBounds(27, 344, 559, 23);
        jf.getContentPane().add(res);

        mes = new JLabel("Message:");
        mes.setFont(new Font("Verdana", Font.PLAIN, 12));
        mes.setBounds(27, 150, 119, 23);
        jf.getContentPane().add(mes);
    }
}
