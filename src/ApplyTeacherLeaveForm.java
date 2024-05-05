import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import com.jgoodies.*;
import com.toedter.calendar.JDateChooser;

public class ApplyTeacherLeaveForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, teacherlvtxt, employeeidtxt, datetxt, timetxt;
    Choice employeeidfld, timefld;
    JButton sumbitbtn, cancelbtnl;
    JDateChooser datefld;

    public ApplyTeacherLeaveForm() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        teacherlvtxt = new JLabel("APPLY  LEAVE  (TEACHER)");
        teacherlvtxt.setBounds(310, 20, 800, 100);
        teacherlvtxt.setForeground(Color.gray);
        teacherlvtxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(teacherlvtxt);

        employeeidtxt = new JLabel("EMPLOYEE I`D :");
        employeeidtxt.setBounds(300, 140, 800, 80);
        employeeidtxt.setForeground(Color.lightGray);
        employeeidtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(employeeidtxt); // COMBINE
        employeeidfld = new Choice();
        employeeidfld.setBounds(300, 230, 250, 30);
        employeeidfld.setForeground(Color.darkGray);
        employeeidfld.setFont(new Font("name", Font.BOLD, 20));
        c.add(employeeidfld);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                employeeidfld.add(rs.getString("employee"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        datetxt = new JLabel("DATE :");
        datetxt.setBounds(300, 260, 800, 100);
        datetxt.setForeground(Color.lightGray);
        datetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(datetxt); // COMBINE
        datefld = new JDateChooser();
        datefld.setBounds(300, 350, 250, 30);
        datefld.setForeground(Color.darkGray);
        datefld.setBackground(Color.lightGray);
        datefld.setFont(new Font("name", Font.BOLD, 20));
        datefld.setOpaque(false);
        c.add(datefld);

        timetxt = new JLabel("TIME DURATION :");
        timetxt.setBounds(300, 380, 800, 80);
        timetxt.setForeground(Color.lightGray);
        timetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(timetxt); // COMBINE
        timefld = new Choice();
        timefld.setBounds(300, 470, 250, 30);
        timefld.setForeground(Color.darkGray);
        timefld.setBackground(Color.lightGray);
        timefld.setFont(new Font("name", Font.BOLD, 20));
        timefld.add("Fulltime");
        timefld.add("Halftime");
        c.add(timefld);

        sumbitbtn = new JButton("SUMBIT");
        sumbitbtn.setBounds(300, 600, 120, 30);
        sumbitbtn.setFont(new Font("name", Font.BOLD, 18));
        sumbitbtn.setForeground(Color.cyan);
        sumbitbtn.setBackground(Color.cyan);
        sumbitbtn.setOpaque(false);
        sumbitbtn.addActionListener(this);
        c.add(sumbitbtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(500, 600, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Applyteacherlvimage.jpg"));
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
                String employid = employeeidfld.getSelectedItem();
                String date = ((JTextField) datefld.getDateEditor().getUiComponent()).getText();
                String durationtime = timefld.getSelectedItem();

                if ((employid.isEmpty() == false) && (date.isEmpty() == false) && (durationtime.isEmpty() == false)) {
                    try {
                        String query = "insert into faculityleaveform values('" + employid + "', '" + date + "', '"
                                + durationtime + "')";
                        Connector c = new Connector();
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(display, "APPLIED  SUCCESSFULLY .:", "HELP",
                                JOptionPane.INFORMATION_MESSAGE);
                        new HomePage();
                    } catch (Exception e) {
                        e.printStackTrace();
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
        new ApplyTeacherLeaveForm();
    }
}
