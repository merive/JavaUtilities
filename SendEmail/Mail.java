import javax.mail.MessagingException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mail implements ActionListener {

    JFrame jf;
    JTextField emailTF, titleTF, toTF;
    JPasswordField passwordTF;
    JLabel email, toLb, YouPassword, mes, title, res, spam;
    JButton send;
    JTextPane message;
    JList<Integer> list;
    Integer[] qty = new Integer[99];

    /**
     * @wbp.parser.entryPoint
     */
    Mail() {
        jf = new JFrame("Mail");
        jf.setSize(773, 510);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.getContentPane().setLayout(null);

        email = new JLabel("You email:");
        email.setFont(new Font("Verdana", Font.PLAIN, 12));
        email.setBounds(27, 26, 77, 23);
        jf.getContentPane().add(email);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        emailTF.setBounds(27, 51, 157, 23);
        jf.getContentPane().add(emailTF);
        emailTF.setColumns(10);

        YouPassword = new JLabel("You password:");
        YouPassword.setFont(new Font("Verdana", Font.PLAIN, 12));
        YouPassword.setBounds(27, 92, 119, 23);
        jf.getContentPane().add(YouPassword);

        passwordTF = new JPasswordField();
        passwordTF.setBounds(27, 117, 157, 23);
        jf.getContentPane().add(passwordTF);

        toLb = new JLabel("To:");
        toLb.setFont(new Font("Verdana", Font.PLAIN, 12));
        toLb.setBounds(202, 29, 177, 16);
        jf.getContentPane().add(toLb);

        toTF = new JTextField();
        toTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        toTF.setColumns(10);
        toTF.setBounds(202, 51, 177, 23);
        jf.getContentPane().add(toTF);

        title = new JLabel("Title:");
        title.setFont(new Font("Verdana", Font.PLAIN, 12));
        title.setBounds(202, 95, 177, 16);
        jf.getContentPane().add(title);

        titleTF = new JTextField();
        titleTF.setFont(new Font("Verdana", Font.PLAIN, 12));
        titleTF.setColumns(10);
        titleTF.setBounds(202, 115, 177, 24);
        jf.getContentPane().add(titleTF);

        message = new JTextPane();
        message.setBounds(27, 173, 709, 158);
        jf.getContentPane().add(message);

        send = new JButton("Send");
        send.setBounds(27, 341, 709, 89);
        send.setFont(new Font("Verdana", Font.PLAIN, 14));
        jf.getContentPane().add(send);
        send.addActionListener(this);

        res = new JLabel("Result:");
        res.setFont(new Font("Verdana", Font.PLAIN, 12));
        res.setBounds(27, 440, 709, 23);
        jf.getContentPane().add(res);

        mes = new JLabel("Message:");
        mes.setFont(new Font("Verdana", Font.PLAIN, 12));
        mes.setBounds(27, 150, 709, 23);
        jf.getContentPane().add(mes);

        this.spam = new JLabel("Spam:");
        this.spam.setFont(new Font("Verdana", Font.PLAIN, 12));
        jf.getContentPane().add(this.spam);

        for (int i = 1; i < 99; i++) qty[i] = i;

        JLabel spam = new JLabel("Spam:");
        spam.setFont(new Font("Verdana", Font.PLAIN, 16));
        spam.setBounds(530, 25, 58, 48);
        jf.getContentPane().add(spam);

        list = new JList<>(qty);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setFont(new Font("Verdana", Font.PLAIN, 12));
        list.setBounds(460, 73, 275, 80);
        jf.getContentPane().add(list);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setBounds(400, 66, 336, 74);
        jf.getContentPane().add(scrollPane);

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
                    if (list.getSelectedIndex() > 0) {
                        for (int i = 1; i < list.getSelectedIndex() + 1; i++) {
                            SendEmail se = new SendEmail();
                            se.send(emailTF.getText(), new String(passwordTF.getPassword()), toTF.getText(),
                                    titleTF.getText(), message.getText());
                            res.setText("Result: OK.");
                        }
                    } else {
                        SendEmail se = new SendEmail();
                        se.send(emailTF.getText(), new String(passwordTF.getPassword()), toTF.getText(),
                                titleTF.getText(), message.getText());
                        res.setText("Result: OK.");
                    }
                } else {
                    res.setText("Result: Write To.");
                }
            } else {
                res.setText("Result: Write you email.");
            }
        } catch (MessagingException me) {
            res.setText("Result: Username and Password not accepted.");
        }
    }
}