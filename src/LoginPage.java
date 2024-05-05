import javax.swing.*;
import java.sql.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusListener;
import java.awt.event.FocusEvent;

public class LoginPage implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, usernmtxt, pswdtxt, adminlogintxt;
    JPasswordField pswfield;
    JTextField usernmfld;
    JButton loginbtn, cancelbtnl;
    // username>> Editor , admin
    // password>> 12345

    public LoginPage() {
        display = new JFrame();
        display.setBounds(350, 150, 750, 450);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(false);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        usernmtxt = new JLabel("USERNAME :");
        usernmtxt.setBounds(150, 80, 200, 100);
        usernmtxt.setForeground(Color.CYAN);
        usernmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(usernmtxt); // COMBINE
        usernmfld = new JTextField();
        usernmfld.setBounds(345, 117, 170, 30);
        usernmfld.setForeground(Color.WHITE);
        usernmfld.setFont(new Font("name", Font.BOLD, 19));
        usernmfld.setOpaque(false);
        c.add(usernmfld);

        pswdtxt = new JLabel("PASSWORD :");
        pswdtxt.setBounds(150, 150, 200, 100);
        pswdtxt.setForeground(Color.CYAN);
        pswdtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(pswdtxt); // COMBINE
        pswfield = new JPasswordField();
        pswfield.setBounds(345, 187, 170, 30);
        pswfield.setForeground(Color.WHITE);
        pswfield.setFont(new Font("name", Font.BOLD, 15));
        pswfield.setOpaque(false);
        c.add(pswfield);

        loginbtn = new JButton("LOGIN");
        loginbtn.setBounds(200, 300, 120, 30);
        loginbtn.setFont(new Font("name", Font.BOLD, 18));
        loginbtn.setForeground(Color.red);
        loginbtn.setBackground(Color.cyan);
        loginbtn.setOpaque(false);
        loginbtn.addActionListener(this);
        c.add(loginbtn); // BUTTONS
        cancelbtnl = new JButton("CANCEL");
        cancelbtnl.setBounds(380, 300, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        adminlogintxt = new JLabel("ADMIN LOGIN");
        adminlogintxt.setBounds(240, -15, 300, 100);
        adminlogintxt.setForeground(Color.CYAN);
        adminlogintxt.setFont(new Font("name", Font.BOLD, 40));
        c.add(adminlogintxt);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("UniversityAdminLoginpicture.jpg"));
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
                String username = usernmfld.getText();
                String password = pswfield.getText();
                if ((username.isEmpty() == false) && (password.isEmpty() == false)) {
                    String query = "select * from login where username='" + username + "' and password='" + password
                            + "'";
                    try {
                        Connector c = new Connector();
                        ResultSet rs = c.s.executeQuery(query);
                        if (rs.next()) {
                            new HomePage();
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
        new WelcomePage();
    }
}
//4