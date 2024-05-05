import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class EnterStudentMarkForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, enterstdmarktxt, sltrollnotxt, selectsemtxt, entersubtxt, entermarktxt;
    JTextField subject1, subject2, subject3, subject4, mark1, mark2, mark3, mark4;
    JButton sumbitbtn, cancelbtnl, subjectbtn;
    Choice searchbarfld, selectsemfld;

    public EnterStudentMarkForm() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        selectsemtxt = new JLabel("SELECT SEM      ⏩");
        selectsemtxt.setBounds(300, 200, 230, 60);
        selectsemtxt.setForeground(Color.LIGHT_GRAY);
        selectsemtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(selectsemtxt);
        selectsemfld = new Choice();
        selectsemfld.setBounds(590, 220, 200, 30);
        selectsemfld.setForeground(Color.darkGray);
        selectsemfld.setBackground(Color.white);
        selectsemfld.setFont(new Font("name", Font.BOLD, 23));
        c.add(selectsemfld);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from semester_subjects");
            while (rs.next()) {
                selectsemfld.add(rs.getString("Semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        enterstdmarktxt = new JLabel("ENTER MARK FOR  (STUDENT)");
        enterstdmarktxt.setBounds(310, 20, 800, 100);
        enterstdmarktxt.setForeground(Color.GRAY);
        enterstdmarktxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(enterstdmarktxt);

        // rollno txt
        sltrollnotxt = new JLabel("SELECT ROLLNO 👉");
        sltrollnotxt.setBounds(300, 120, 250, 100);
        sltrollnotxt.setForeground(Color.lightGray);
        sltrollnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(sltrollnotxt);         // COMBINE
        searchbarfld = new Choice();
        searchbarfld.setBounds(590, 160, 200, 30);
        searchbarfld.setForeground(Color.darkGray);
        searchbarfld.setFont(new Font("name", Font.BOLD, 23));
        c.add(searchbarfld);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from student");
            while (rs.next()) {
                searchbarfld.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        entersubtxt = new JLabel("ENTER SUBJECT 🔰");
        entersubtxt.setBounds(300, 250, 800, 100);
        entersubtxt.setForeground(Color.white);
        entersubtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(entersubtxt);

        entermarktxt = new JLabel("ENTER MARK 🔰");
        entermarktxt.setBounds(800, 250, 300, 100);
        entermarktxt.setForeground(Color.white);
        entermarktxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(entermarktxt);

        subject1 = new JTextField();
        subject1.setBounds(300, 360, 280, 30);
        subject1.setForeground(Color.WHITE);
        subject1.setFont(new Font("name", Font.BOLD, 23));
        subject1.setOpaque(false);
        subject1.setEditable(false);
        c.add(subject1);

        subject2 = new JTextField();
        subject2.setBounds(300, 420, 280, 30);
        subject2.setForeground(Color.WHITE);
        subject2.setFont(new Font("name", Font.BOLD, 23));
        subject2.setOpaque(false);
        subject2.setEditable(false);
        c.add(subject2);

        subject3 = new JTextField();
        subject3.setBounds(300, 480, 280, 30);
        subject3.setForeground(Color.WHITE);
        subject3.setFont(new Font("name", Font.BOLD, 23));
        subject3.setOpaque(false);
        subject3.setEditable(false);
        c.add(subject3);

        subject4 = new JTextField();
        subject4.setBounds(300, 530, 280, 30);
        subject4.setForeground(Color.WHITE);
        subject4.setFont(new Font("name", Font.BOLD, 23));
        subject4.setOpaque(false);
        subject4.setEditable(false);
        c.add(subject4);

        mark1 = new JTextField();
        mark1.setBounds(800, 360, 280, 30);
        mark1.setForeground(Color.WHITE);
        mark1.setFont(new Font("name", Font.BOLD, 23));
        mark1.setOpaque(false);
        c.add(mark1);

        mark2 = new JTextField();
        mark2.setBounds(800, 420, 280, 30);
        mark2.setForeground(Color.WHITE);
        mark2.setFont(new Font("name", Font.BOLD, 23));
        mark2.setOpaque(false);
        c.add(mark2);

        mark3 = new JTextField();
        mark3.setBounds(800, 480, 280, 30);
        mark3.setForeground(Color.WHITE);
        mark3.setFont(new Font("name", Font.BOLD, 23));
        mark3.setOpaque(false);
        c.add(mark3);

        mark4 = new JTextField();
        mark4.setBounds(800, 530, 280, 30);
        mark4.setForeground(Color.WHITE);
        mark4.setFont(new Font("name", Font.BOLD, 23));
        mark4.setOpaque(false);
        c.add(mark4);

        sumbitbtn = new JButton("SUMBIT");
        sumbitbtn.setBounds(550, 600, 120, 30);
        sumbitbtn.setFont(new Font("name", Font.BOLD, 18));
        sumbitbtn.setForeground(Color.cyan);
        sumbitbtn.setBackground(Color.cyan);
        sumbitbtn.setOpaque(false);
        sumbitbtn.addActionListener(this);
        c.add(sumbitbtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(730, 600, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        try {         // set query for fetch data in the databses
            Connector c = new Connector();
            String query = "select * from semester_subjects where Semester='" + selectsemfld.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                subject1.setText(rs.getString("Sub_1"));
                subject2.setText(rs.getString("Sub_2"));
                subject3.setText(rs.getString("Sub_3"));
                subject4.setText(rs.getString("Sub_4"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // displayed the data in the frame
        selectsemfld.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Connector c = new Connector();
                    String query = "select * from semester_subjects where Semester='" + selectsemfld.getSelectedItem()
                            + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        subject1.setText(rs.getString("Sub_1"));
                        subject2.setText(rs.getString("Sub_2"));
                        subject3.setText(rs.getString("Sub_3"));
                        subject4.setText(rs.getString("Sub_4"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Entermarkimage.jpg"));
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
                String sub1 = subject1.getText();
                String sub2 = subject2.getText();
                String sub3 = subject3.getText();
                String sub4 = subject4.getText();
                String mrk1 = mark1.getText();
                String mrk2 = mark2.getText();
                String mrk3 = mark3.getText();
                String mrk4 = mark4.getText();
                if ((sub1.isEmpty() == false) && (sub2.isEmpty() == false) && (sub3.isEmpty() == false)
                        && (sub4.isEmpty() == false) && (mrk1.isEmpty() == false) && (mrk2.isEmpty() == false)
                        && (mrk3.isEmpty() == false) && (mrk4.isEmpty() == false)) {
                    try {
                        Connector c = new Connector();
                        String query1 = "insert into subject values('" + searchbarfld.getSelectedItem() + "', '"
                                + selectsemfld.getSelectedItem() + "','" + subject1.getText() + "','"
                                + subject2.getText() + "','" + subject3.getText() + "','" + subject4.getText() + "')";
                        String query2 = "insert into marks values('" + searchbarfld.getSelectedItem() + "', '"
                                + selectsemfld.getSelectedItem() + "','" + mark1.getText() + "','" + mark2.getText()
                                + "','" + mark3.getText() + "','" + mark4.getText() + "')";

                        c.s.executeUpdate(query1);
                        c.s.executeUpdate(query2);
                        JOptionPane.showMessageDialog(display, " SUCCESSFUL DETAILED  PLEASE ENTER TO CONTINUE .:",
                                "HELP", JOptionPane.INFORMATION_MESSAGE);
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
        new EnterStudentMarkForm();
    }
}
