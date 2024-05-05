import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage implements ActionListener {
    static int x = 1;
    JFrame display;
    Container c;
    JLabel background, welcometxt;
    JButton adminpagebtn, studentpagebtn;

    public WelcomePage() {
        display = new JFrame();
        display.setBounds(-10, 0, 1387, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // display.addActionListener(this);
        c = display.getContentPane();

        welcometxt = new JLabel("WELCOME");
        welcometxt.setBounds(520, 60, 1000, 70);
        welcometxt.setForeground(Color.DARK_GRAY);
        welcometxt.setFont(new Font("name", Font.BOLD, 80));
        // c.add(welcometxt);

        ////////////////// HOMEPAGE BUTON VISIBLE (OFF) ///////////////////
        adminpagebtn = new JButton("ADMIN");
        adminpagebtn.setBounds(1250, 16, 100, 30);
        adminpagebtn.setBackground(Color.gray);
        adminpagebtn.setFont(new Font("name", Font.BOLD, 15));
        adminpagebtn.addActionListener(this);
        c.add(adminpagebtn);

        studentpagebtn = new JButton("STUDENT");
        studentpagebtn.setBounds(1250, 50, 100, 30);
        studentpagebtn.setBackground(Color.gray);
        studentpagebtn.setFont(new Font("name", Font.BOLD, 14));
        studentpagebtn.addActionListener(this);
        c.add(studentpagebtn);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Wcimg.jpg"));
        background = new JLabel();
        background.setBounds(0, 0, 1370, 770);
        Image ig = ic.getImage();
        Image ig2 = ig.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ig2);
        background.setIcon(ic2);
        c.add(background);

        display.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == adminpagebtn) {
                new LoginPage();
            }
            if (ae.getSource() == studentpagebtn) {
                new StudentLoginPage();
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
//1