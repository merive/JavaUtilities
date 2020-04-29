import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame jf;
    JLabel jlRes;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bRes, bPlus, bMinus, bMulti, bDivision, bClear;
    String OPERATOR = "null";
    String[] nums;
    int num1, num2;
    String res;

    /**
     * @wbp.parser.entryPoint
     */
    Calculator() {
        jf = new JFrame("Calculator");
        jf.setSize(257, 330);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlRes = new JLabel("");
        jlRes.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        jlRes.setBounds(10, 23, 230, 44);

        b1 = new JButton("1");
        b1.setBounds(10, 180, 50, 50);
        b1.setPreferredSize(new Dimension(50, 50));

        b2 = new JButton("2");
        b2.setBounds(70, 180, 50, 50);
        b2.setPreferredSize(new Dimension(50, 50));

        b3 = new JButton("3");
        b3.setBounds(130, 180, 50, 50);
        b3.setPreferredSize(new Dimension(50, 50));

        b4 = new JButton("4");
        b4.setBounds(10, 130, 50, 50);
        b4.setPreferredSize(new Dimension(50, 50));

        b5 = new JButton("5");
        b5.setBounds(70, 130, 50, 50);
        b5.setPreferredSize(new Dimension(50, 50));

        b6 = new JButton("6");
        b6.setBounds(130, 130, 50, 50);
        b6.setPreferredSize(new Dimension(50, 50));

        b7 = new JButton("7");
        b7.setBounds(10, 77, 50, 50);
        b7.setPreferredSize(new Dimension(50, 50));

        b8 = new JButton("8");
        b8.setBounds(70, 77, 50, 50);
        b8.setPreferredSize(new Dimension(50, 50));

        b9 = new JButton("9");
        b9.setBounds(130, 77, 50, 50);
        b9.setPreferredSize(new Dimension(50, 50));

        b0 = new JButton("0");
        b0.setBounds(70, 233, 50, 50);
        b0.setPreferredSize(new Dimension(50, 50));

        bRes = new JButton("=");
        bRes.setBounds(190, 233, 50, 50);
        bRes.setPreferredSize(new Dimension(50, 50));

        bPlus = new JButton("+");
        bPlus.setBounds(190, 180, 50, 50);
        bPlus.setPreferredSize(new Dimension(50, 50));

        bMinus = new JButton("-");
        bMinus.setBounds(190, 130, 50, 50);
        bMinus.setPreferredSize(new Dimension(50, 50));

        bMulti = new JButton("*");
        bMulti.setBounds(190, 77, 50, 50);
        bMulti.setPreferredSize(new Dimension(50, 50));

        bDivision = new JButton("/");
        bDivision.setBounds(130, 233, 50, 50);
        bDivision.setPreferredSize(new Dimension(50, 50));

        bClear = new JButton("C");
        bClear.setBounds(10, 233, 50, 50);
        bClear.setPreferredSize(new Dimension(50, 50));

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bRes.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMulti.addActionListener(this);
        bDivision.addActionListener(this);
        bClear.addActionListener(this);
        jf.getContentPane().setLayout(null);

        jf.getContentPane().add(jlRes);
        jf.getContentPane().add(b1);
        jf.getContentPane().add(b2);
        jf.getContentPane().add(b3);
        jf.getContentPane().add(b4);
        jf.getContentPane().add(b5);
        jf.getContentPane().add(b6);
        jf.getContentPane().add(b7);
        jf.getContentPane().add(b8);
        jf.getContentPane().add(b9);
        jf.getContentPane().add(b0);
        jf.getContentPane().add(bRes);
        jf.getContentPane().add(bPlus);
        jf.getContentPane().add(bMinus);
        jf.getContentPane().add(bMulti);
        jf.getContentPane().add(bDivision);
        jf.getContentPane().add(bClear);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Calculator::new);
    }

    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "1":
                jlRes.setText(jlRes.getText() + "1");
                break;
            case "2":
                jlRes.setText(jlRes.getText() + "2");
                break;
            case "3":
                jlRes.setText(jlRes.getText() + "3");
                break;
            case "4":
                jlRes.setText(jlRes.getText() + "4");
                break;
            case "5":
                jlRes.setText(jlRes.getText() + "5");
                break;
            case "6":
                jlRes.setText(jlRes.getText() + "6");
                break;
            case "7":
                jlRes.setText(jlRes.getText() + "7");
                break;
            case "8":
                jlRes.setText(jlRes.getText() + "8");
                break;
            case "9":
                jlRes.setText(jlRes.getText() + "9");
                break;
            case "0":
                jlRes.setText(jlRes.getText() + "0");
                break;
            case "C":
                jlRes.setText("");
                break;
            case "+":
                if (OPERATOR.equals("null")) {
                    jlRes.setText(jlRes.getText() + "+");
                    OPERATOR = ae.getActionCommand();
                } else {
                    getRes();
                }
                break;
            case "-":
                if (OPERATOR.equals("null")) {
                    jlRes.setText(jlRes.getText() + "-");
                    OPERATOR = ae.getActionCommand();
                } else {
                    getRes();
                }
                break;
            case "*":
                if (OPERATOR.equals("null")) {
                    jlRes.setText(jlRes.getText() + "*");
                    OPERATOR = ae.getActionCommand();
                } else {
                    getRes();
                }
                break;
            case "/":
                if (OPERATOR.equals("null")) {
                    jlRes.setText(jlRes.getText() + "/");
                    OPERATOR = ae.getActionCommand();
                } else {
                    getRes();
                }
                break;
            case "=":
                if (OPERATOR.equals("null")) {
                    jlRes.setText(jlRes.getText().split(OPERATOR)[0]);
                } else {
                    getRes();
                }
                break;
        }
    }

    public void getRes() {
        nums = jlRes.getText().split("\\" + OPERATOR);
        num1 = Integer.parseInt(nums[0]);
        num2 = Integer.parseInt(nums[1]);
        switch (OPERATOR) {
            case "+":
                res = Integer.toString(num1 + num2);
                jlRes.setText(res);
                OPERATOR = "null";
                break;
            case "-":
                res = Integer.toString(num1 - num2);
                jlRes.setText(res);
                OPERATOR = "null";
                break;
            case "*":
                res = Integer.toString(num1 * num2);
                jlRes.setText(res);
                OPERATOR = "null";
                break;
            case "/":
                try {
                    res = Integer.toString(num1 / num2);
                    jlRes.setText(res);
                    OPERATOR = "null";
                    break;
                } catch (ArithmeticException exc) {
                    jlRes.setText("1");
                    OPERATOR = "null";
                    break;
                }
        }
    }
}