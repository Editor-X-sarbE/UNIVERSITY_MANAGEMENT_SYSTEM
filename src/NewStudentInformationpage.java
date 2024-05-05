import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class NewStudentInformationpage implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, newfaculityinfotxt, nametxt, rollnotxt, adresstxt, emailtxt, classxiitxt, branchtxt, fathernmtxt,
            dobtxt, phonenotxt, adharnotxt, classxtxt, coursetxt;
    JTextField namefld, rollnofld, adressfld, emailfld, classxiifld, fathernmfld, phonenofld, adharnofld, classxfld;
    JButton sumbitbtn, cancelbtnl;
    Random ran = new Random();
    long randomno = Math.abs((ran.nextLong() % 100) + 100);
    JComboBox coursefld, branchfld;
    JDateChooser dobfld;

    public NewStudentInformationpage() {
        display = new JFrame();
        display.setBounds(-7, 0, 1387, 780);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        newfaculityinfotxt = new JLabel("NEW  STUDENT  INFORMATION");
        newfaculityinfotxt.setBounds(390, 20, 800, 100);
        newfaculityinfotxt.setForeground(Color.gray);
        newfaculityinfotxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(newfaculityinfotxt);

        nametxt = new JLabel("NAME          :");
        nametxt.setBounds(200, 120, 200, 100);
        nametxt.setForeground(Color.ORANGE);
        nametxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(nametxt); // COMBINE
        namefld = new JTextField();
        namefld.setBounds(365, 155, 200, 30);
        namefld.setForeground(Color.WHITE);
        namefld.setFont(new Font("name", Font.BOLD, 19));
        namefld.setOpaque(false);
        c.add(namefld);

        rollnotxt = new JLabel("ROLL NO    :");
        rollnotxt.setBounds(200, 190, 200, 100);
        rollnotxt.setForeground(Color.ORANGE);
        rollnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(rollnotxt); // COMBINE
        rollnofld = new JTextField("S3924BCA" + randomno);
        rollnofld.setBounds(365, 225, 200, 30);
        rollnofld.setForeground(Color.white);
        rollnofld.setFont(new Font("name", Font.BOLD, 19));
        rollnofld.setOpaque(false);
        c.add(rollnofld);

        adresstxt = new JLabel("ADDRESS   :");
        adresstxt.setBounds(200, 255, 200, 100);
        adresstxt.setForeground(Color.ORANGE);
        adresstxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(adresstxt); // COMBINE
        adressfld = new JTextField();
        adressfld.setBounds(365, 290, 200, 30);
        adressfld.setForeground(Color.WHITE);
        adressfld.setFont(new Font("name", Font.BOLD, 19));
        adressfld.setOpaque(false);
        c.add(adressfld);

        emailtxt = new JLabel("EMAIL I'D    :");
        emailtxt.setBounds(200, 330, 200, 100);
        emailtxt.setForeground(Color.ORANGE);
        emailtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(emailtxt); // COMBINE
        emailfld = new JTextField();
        emailfld.setBounds(365, 365, 200, 30);
        emailfld.setForeground(Color.white);
        emailfld.setFont(new Font("name", Font.BOLD, 15));
        emailfld.setOpaque(false);
        c.add(emailfld);

        classxiitxt = new JLabel("CLASS XII(%):");
        classxiitxt.setBounds(200, 400, 200, 100);
        classxiitxt.setForeground(Color.ORANGE);
        classxiitxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(classxiitxt); // COMBINE
        classxiifld = new JTextField();
        classxiifld.setBounds(365, 435, 200, 30);
        classxiifld.setForeground(Color.WHITE);
        classxiifld.setFont(new Font("name", Font.BOLD, 19));
        classxiifld.setOpaque(false);
        c.add(classxiifld);

        branchtxt = new JLabel("BRANCH :");
        branchtxt.setBounds(200, 470, 200, 100);
        branchtxt.setForeground(Color.ORANGE);
        branchtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(branchtxt); // COMBINE
        String[] branches = { "<-select->", "CS", "EE", "EC" };
        branchfld = new JComboBox<>(branches);
        branchfld.setBounds(365, 505, 200, 30);
        branchfld.setForeground(Color.WHITE);
        branchfld.setBackground(Color.darkGray);
        branchfld.setFont(new Font("name", Font.BOLD, 16));
        c.add(branchfld);

        fathernmtxt = new JLabel("FATHER NAME   :");
        fathernmtxt.setBounds(720, 120, 200, 100);
        fathernmtxt.setForeground(Color.ORANGE);
        fathernmtxt.setFont(new Font("name", Font.BOLD, 20));
        c.add(fathernmtxt); // COMBINE
        fathernmfld = new JTextField();
        fathernmfld.setBounds(900, 155, 200, 30);
        fathernmfld.setForeground(Color.WHITE);
        fathernmfld.setFont(new Font("name", Font.BOLD, 19));
        fathernmfld.setOpaque(false);
        c.add(fathernmfld);

        dobtxt = new JLabel("D_O_B           :");
        dobtxt.setBounds(720, 190, 200, 100);
        dobtxt.setForeground(Color.ORANGE);
        dobtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(dobtxt); // COMBINE
        dobfld = new JDateChooser();
        dobfld.setBounds(900, 225, 200, 30);
        dobfld.setForeground(Color.WHITE);
        dobfld.setFont(new Font("name", Font.BOLD, 19));
        dobfld.setOpaque(false);
        c.add(dobfld);

        phonenotxt = new JLabel("PHONE NO    :");
        phonenotxt.setBounds(720, 255, 200, 100);
        phonenotxt.setForeground(Color.ORANGE);
        phonenotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(phonenotxt); // COMBINE
        phonenofld = new JTextField();
        phonenofld.setBounds(900, 290, 200, 30);
        phonenofld.setForeground(Color.WHITE);
        phonenofld.setFont(new Font("name", Font.BOLD, 19));
        phonenofld.setOpaque(false);
        c.add(phonenofld);

        adharnotxt = new JLabel("ADHAR NO    :");
        adharnotxt.setBounds(720, 325, 200, 100);
        adharnotxt.setForeground(Color.ORANGE);
        adharnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(adharnotxt); // COMBINE
        adharnofld = new JTextField();
        adharnofld.setBounds(900, 360, 200, 30);
        adharnofld.setForeground(Color.WHITE);
        adharnofld.setFont(new Font("name", Font.BOLD, 19));
        adharnofld.setOpaque(false);
        c.add(adharnofld);

        classxtxt = new JLabel("CLASSX(%)   :");
        classxtxt.setBounds(720, 395, 200, 100);
        classxtxt.setForeground(Color.ORANGE);
        classxtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(classxtxt); // COMBINE
        classxfld = new JTextField();
        classxfld.setBounds(900, 430, 200, 30);
        classxfld.setForeground(Color.WHITE);
        classxfld.setFont(new Font("name", Font.BOLD, 19));
        classxfld.setOpaque(false);
        c.add(classxfld);

        coursetxt = new JLabel("COURSE       :");
        coursetxt.setBounds(720, 465, 200, 100);
        coursetxt.setForeground(Color.ORANGE);
        coursetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(coursetxt); // COMBINE
        String[] option = { "<-select->", "BCA", "BBA", "MBA", "MCA", "Bsc", "B.Tek", "M.Tek" };
        coursefld = new JComboBox<>(option);
        coursefld.setBounds(900, 500, 200, 30);
        coursefld.setForeground(Color.WHITE);
        coursefld.setBackground(Color.darkGray);
        coursefld.setFont(new Font("name", Font.BOLD, 17));
        c.add(coursefld);

        sumbitbtn = new JButton("SUMBIT");
        sumbitbtn.setBounds(480, 600, 120, 30);
        sumbitbtn.setFont(new Font("name", Font.BOLD, 18));
        sumbitbtn.setForeground(Color.red);
        sumbitbtn.setBackground(Color.cyan);
        sumbitbtn.setOpaque(false);
        sumbitbtn.addActionListener(this);
        c.add(sumbitbtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(680, 600, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("newstudentinfoimage.jpg"));
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
            if (ae.getSource() == sumbitbtn) {
                String name = namefld.getText();
                String rollno = rollnofld.getText();
                String address = adressfld.getText();
                String email = emailfld.getText();
                String cxii = classxiifld.getText();
                String branchh = (String) branchfld.getSelectedItem();
                String fname = fathernmfld.getText();

                String dob = ((JTextField) dobfld.getDateEditor().getUiComponent()).getText();
                // int pno=Integer.parseInt(dob);
                String phno = phonenofld.getText();
                long ph = Long.parseLong(phno);
                String adhr = adharnofld.getText();
                long addhar = Long.parseLong(adhr);
                String cx = classxfld.getText();
                String courses = (String) coursefld.getSelectedItem();

                if ((name.isEmpty() == false) && (rollno.isEmpty() == false) && (address.isEmpty() == false)
                        && (email.isEmpty() == false) && (cxii.isEmpty() == false) && (email.isEmpty() == false)
                        && (fname.isEmpty() == false) && (dob.isEmpty() == false) && (phno.isEmpty() == false)
                        && (adhr.isEmpty() == false) && (cx.isEmpty() == false) && (courses.isEmpty() == false)
                        && (branchh.isEmpty() == false)) {
                    try {
                        String query = "insert into student values('" + name + "', '" + rollno + "', '" + address
                                + "', '" + email + "', '" + cxii + "', '" + branchh + "', '" + fname + "', '" + dob
                                + "', '" + phno + "', '" + adhr + "', '" + cx + "', '" + courses + "')";

                        Connector con = new Connector();
                        con.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(display, " STUDENT DETAILS INSERTED SUCCESSFULLY .:", "POPUP",
                                JOptionPane.INFORMATION_MESSAGE);
                        new HomePage();
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(display,
                                " ERROR OCCURED IN DATABASES \n CAN'T STORE DATA SUCCESSFULLY.:", "HELP",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(display, " INVALID  PLEASE  ENTER  VALID  DETAILS .:", "HELP",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (ae.getSource() == cancelbtnl) {
                new HomePage(); // home page
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, " INVALID  DETAILS :       PLEASE  ENTER  VALID  DETAILS .", "HELP",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new WelcomePage();
    }
}
