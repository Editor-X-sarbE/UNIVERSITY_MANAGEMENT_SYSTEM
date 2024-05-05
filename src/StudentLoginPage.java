import javax.swing.*;
import java.sql.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

public class StudentLoginPage implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, rollnotxt, pswdtxt, studentlogintxt, emailtxt;
    JPasswordField pswfield;
    JTextField rollnofld, emailfld;
    JButton loginbtn, cancelbtnl;
    // rollno >> s3921bca00
    // email >>> 'student999@gmail.com(any)'
    // password>> 'damits'

    public StudentLoginPage() {
        display = new JFrame();
        display.setBounds(350, 150, 750, 450);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        rollnotxt = new JLabel("ROLLNO :");
        rollnotxt.setBounds(150, 80, 200, 100);
        rollnotxt.setForeground(Color.GRAY);
        rollnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(rollnotxt); // COMBINE
        rollnofld = new JTextField();
        rollnofld.setBounds(345, 117, 170, 30);
        rollnofld.setForeground(Color.WHITE);
        rollnofld.setFont(new Font("name", Font.BOLD, 19));
        rollnofld.setOpaque(false);
        c.add(rollnofld);

        emailtxt = new JLabel("EMAIL :");
        emailtxt.setBounds(150, 140, 200, 100);
        emailtxt.setForeground(Color.GRAY);
        emailtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(emailtxt); // COMBINE
        emailfld = new JTextField();
        emailfld.setBounds(345, 177, 170, 30);
        emailfld.setForeground(Color.WHITE);
        emailfld.setFont(new Font("name", Font.BOLD, 19));
        emailfld.setOpaque(false);
        c.add(emailfld);

        pswdtxt = new JLabel("PASSWORD :");
        pswdtxt.setBounds(150, 200, 200, 100);
        pswdtxt.setForeground(Color.GRAY);
        pswdtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(pswdtxt); // COMBINE
        pswfield = new JPasswordField();
        pswfield.setBounds(345, 237, 170, 30);
        pswfield.setForeground(Color.WHITE);
        pswfield.setFont(new Font("name", Font.BOLD, 15));
        pswfield.setOpaque(false);
        c.add(pswfield);

        loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(200, 320, 120, 30);
        loginbtn.setFont(new Font("name", Font.BOLD, 18));
        loginbtn.setForeground(Color.red);
        loginbtn.setBackground(Color.cyan);
        loginbtn.setOpaque(false);
        loginbtn.addActionListener(this);
        c.add(loginbtn); // BUTTONS
        cancelbtnl = new JButton("CANCEL");
        cancelbtnl.setBounds(380, 320, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        studentlogintxt = new JLabel("💢 STUDENT LOGIN 💢");
        studentlogintxt.setBounds(180, -15, 450, 100);
        studentlogintxt.setForeground(Color.LIGHT_GRAY);
        studentlogintxt.setFont(new Font("name", Font.BOLD, 40));
        c.add(studentlogintxt);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Loginstudentimage.jpg"));
        // ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Loginxpg.jpg"));
        background = new JLabel();
        background.setBounds(0, 0, 750, 450);
        Image ig = ic.getImage();
        Image ig2 = ig.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ig2);
        background.setIcon(ic2);
        c.add(background);

        display.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == loginbtn) {
                String rollno = rollnofld.getText();
                String email = emailfld.getText();
                String password = pswfield.getText();

                if ((rollno.isEmpty() == false) && (password.isEmpty() == false) && (email.isEmpty() == false)) {
                    String query = "select * from Studentlogin where rollno='" + rollno + "' and password='" + password
                            + "'";
                    try {
                        Connector c = new Connector();
                        ResultSet rs = c.s.executeQuery(query);
                        if (rs.next()) {
                            new StudentHomePage();
                        } else {
                            JOptionPane.showMessageDialog(display,
                                    "INVALID INFORMATION \n PLEASE ENTER VALID DETAILS .", "HELP",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                        c.s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(display, "             INVALID \nPLEASE ENTER VALID DETAILS :",
                            "HELP", JOptionPane.ERROR_MESSAGE);
                }
            }
            if (ae.getSource() == cancelbtnl) {
                new WelcomePage();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, "             INVALID DETAILS :\nPLEASE ENTER VALID DETAILS ",
                    "HELP", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new StudentLoginPage();
    }
}
//5