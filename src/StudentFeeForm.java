import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;
import java.util.EventObject;

public class StudentFeeForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, studentfeetxt, rollnotxt, amounttxt, nametxt, fathernmtxt, coursetxt, branchtxt, semestertxt;
    JTextField namefld, fathernmfld, branchfld, amountfld, coursefld;
    JButton updatebtn, payfeebtn, cancelbtnl, seefeebtn;
    JComboBox semesterfld;
    Choice rollnofld;

    public StudentFeeForm() {
        display = new JFrame();
        display.setBounds(-8, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        studentfeetxt = new JLabel("STUDENT FEE SUMBITION ");
        studentfeetxt.setBounds(370, 20, 800, 100);
        studentfeetxt.setForeground(Color.orange);
        studentfeetxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(studentfeetxt);

        rollnotxt = new JLabel("👉 SELECT ROLLNO ");
        rollnotxt.setBounds(980, 120, 800, 100);
        rollnotxt.setForeground(Color.lightGray);
        rollnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(rollnotxt); // COMBINE
        rollnofld = new Choice();
        rollnofld.setBounds(680, 155, 280, 30);
        rollnofld.setForeground(Color.darkGray);
        rollnofld.setBackground(Color.lightGray);
        rollnofld.setFont(new Font("name", Font.BOLD, 23));
        c.add(rollnofld);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                rollnofld.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        nametxt = new JLabel("👉 STUDENT NAME ");
        nametxt.setBounds(980, 180, 800, 100);
        nametxt.setForeground(Color.lightGray);
        nametxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(nametxt); // COMBINE
        namefld = new JTextField();
        namefld.setBounds(680, 215, 280, 30);
        namefld.setForeground(Color.WHITE);
        namefld.setFont(new Font("name", Font.BOLD, 23));
        namefld.setOpaque(false);
        namefld.setEditable(false);
        c.add(namefld);

        coursetxt = new JLabel("👉 COURSE ");
        coursetxt.setBounds(980, 295, 800, 100);
        coursetxt.setForeground(Color.lightGray);
        coursetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(coursetxt); // COMBINE
        coursefld = new JTextField();
        coursefld.setBounds(680, 330, 280, 30);
        coursefld.setForeground(Color.white);
        coursefld.setFont(new Font("name", Font.BOLD, 23));
        coursefld.setOpaque(false);
        coursefld.setEditable(false);
        c.add(coursefld);
        
        // set query for fetch data in the databses
        try {
            Connector c = new Connector();
            String query = "select * from student where rollno='" + rollnofld.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                namefld.setText(rs.getString("name"));
                fathernmfld.setText(rs.getString("fname"));
                coursefld.setText(rs.getString("courses"));
                branchfld.setText(rs.getString("branch"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // displayed the ordor data in frame
        rollnofld.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Connector c = new Connector();
                    String query = "select * from student where rollno='" + rollnofld.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        namefld.setText(rs.getString("name"));
                        fathernmfld.setText(rs.getString("fname"));
                        coursefld.setText(rs.getString("courses"));
                        branchfld.setText(rs.getString("branch"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        fathernmtxt = new JLabel("👉 FATHER NAME ");
        fathernmtxt.setBounds(980, 240, 800, 100);
        fathernmtxt.setForeground(Color.lightGray);
        fathernmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(fathernmtxt); // COMBINE
        fathernmfld = new JTextField();
        fathernmfld.setBounds(680, 275, 280, 30);
        fathernmfld.setForeground(Color.WHITE);
        fathernmfld.setFont(new Font("name", Font.BOLD, 23));
        fathernmfld.setOpaque(false);
        fathernmfld.setEditable(false);
        c.add(fathernmfld);

        branchtxt = new JLabel("👉 BRANCH ");
        branchtxt.setBounds(980, 345, 800, 100);
        branchtxt.setForeground(Color.lightGray);
        branchtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(branchtxt); // COMBINE
        branchfld = new JTextField();
        branchfld.setBounds(680, 380, 280, 30);
        branchfld.setForeground(Color.white);
        branchfld.setFont(new Font("name", Font.BOLD, 23));
        branchfld.setOpaque(false);
        branchfld.setEditable(false);
        c.add(branchfld);

        semestertxt = new JLabel("👉 SEMESTER ");
        semestertxt.setBounds(980, 400, 800, 100);
        semestertxt.setForeground(Color.lightGray);
        semestertxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(semestertxt); // COMBINE
        String sem[] = { "<-select->", "Semester_1", "Semester_2", "Semester_3", "Semester_4", "Semester_5",
                "Semester_6", };
        semesterfld = new JComboBox(sem);
        semesterfld.setBounds(680, 435, 280, 30);
        semesterfld.setForeground(Color.darkGray);
        semesterfld.setBackground(Color.lightGray);
        semesterfld.setFont(new Font("name", Font.BOLD, 23));
        semesterfld.setOpaque(false);
        c.add(semesterfld);

        amounttxt = new JLabel("👉 ENTER AMOUNT ");
        amounttxt.setBounds(980, 450, 800, 100);
        amounttxt.setForeground(Color.lightGray);
        amounttxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(amounttxt); // COMBINE
        amountfld = new JTextField();
        amountfld.setBounds(680, 485, 280, 30);
        amountfld.setForeground(Color.white);
        amountfld.setFont(new Font("name", Font.BOLD, 23));
        amountfld.setOpaque(false);
        c.add(amountfld);

        updatebtn = new JButton("EXIT");
        updatebtn.setBounds(630, 600, 120, 30);
        updatebtn.setFont(new Font("name", Font.BOLD, 18));
        updatebtn.setForeground(Color.red);
        updatebtn.setBackground(Color.cyan);
        updatebtn.setOpaque(false);
        updatebtn.addActionListener(this);
        c.add(updatebtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(1030, 600, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl); // BUTTONS
        payfeebtn = new JButton("PAYFEE");
        payfeebtn.setBounds(900, 600, 120, 30);
        payfeebtn.setFont(new Font("name", Font.BOLD, 18));
        payfeebtn.setForeground(Color.cyan);
        payfeebtn.setBackground(Color.cyan);
        payfeebtn.setOpaque(false);
        payfeebtn.addActionListener(this);
        c.add(payfeebtn); // BUTTONS
        seefeebtn = new JButton("SEEFEE");
        seefeebtn.setBounds(760, 600, 120, 30);
        seefeebtn.setFont(new Font("name", Font.BOLD, 18));
        seefeebtn.setForeground(Color.green);
        seefeebtn.setBackground(Color.cyan);
        seefeebtn.setOpaque(false);
        seefeebtn.addActionListener(this);
        c.add(seefeebtn);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("studentfeeimage.jpg"));
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
            if (ae.getSource() == payfeebtn) {
                String rln = rollnofld.getSelectedItem();
                String sm = (String) semesterfld.getSelectedItem();
                String nm = namefld.getText();
                String fnm = fathernmfld.getText();
                String crs = coursefld.getText();
                String brn = branchfld.getText();
                String amount = amountfld.getText();
                int amounts = Integer.parseInt(amount);

                if ((sm.isEmpty() == false) && (nm.isEmpty() == false) && (fnm.isEmpty() == false)
                        && (crs.isEmpty() == false) && (brn.isEmpty() == false) && (rln.isEmpty() == false)
                        && (amount.isEmpty() == false)) {
                    JOptionPane.showMessageDialog(display, " AMOUNT PAID SUCCESSFULLY   .:", "HELP",
                            JOptionPane.INFORMATION_MESSAGE);
                    new HomePage();
                } else {
                    JOptionPane.showMessageDialog(display, " INVALID  PLEASE  ENTER  VALID  DETAILS .:", "HELP",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (ae.getSource() == cancelbtnl) {
                new HomePage(); // home page
            }
            if (ae.getSource() == seefeebtn) {
                new FeeStructureForm(); // frr structure pages
            }
            if (ae.getSource() == updatebtn) {
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, "PLEASE ENTER AMOUNT ", "help", JOptionPane.NO_OPTION);
        }
    }

    public static void main(String[] args) {
        new StudentFeeForm();
    }
}
