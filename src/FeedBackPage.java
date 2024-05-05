import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class FeedBackPage implements ActionListener {
    JFrame display;
    Container c;
    JTextArea fdbkareas;
    JLabel background, fdbcktxt, fdtxt, rollnotxt;
    Choice rollnofld;
    JButton printbtn, sumbitbtn, backbtn, exitbtn, bkstudent;

    public FeedBackPage() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        fdbcktxt = new JLabel("Feedback Form");
        fdbcktxt.setBounds(420, 15, 800, 50);
        fdbcktxt.setForeground(Color.gray);
        fdbcktxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(fdbcktxt);

        fdtxt = new JLabel("Write your own feedback...........");
        fdtxt.setBounds(10, 197, 400, 40);
        fdtxt.setForeground(Color.WHITE);
        fdtxt.setFont(new Font("name", Font.BOLD, 30));
        c.add(fdtxt);

        fdbkareas = new JTextArea();
        fdbkareas.setBounds(0, 240, 1370, 500);
        fdbkareas.setFont(new Font("name", Font.BOLD, 25));
        c.add(fdbkareas);

        printbtn = new JButton();
        printbtn.setBounds(130, 15, 100, 30);
        printbtn.setText("PRINT");
        printbtn.setFont(new Font("null", Font.BOLD, 15));
        printbtn.setBackground(Color.cyan);
        printbtn.setForeground(Color.white);
        printbtn.setOpaque(false);
        printbtn.addActionListener(this);
        c.add(printbtn);

        backbtn = new JButton();
        backbtn.setBounds(10, 55, 100, 30);
        backbtn.setText("BACK");
        backbtn.setFont(new Font("null", Font.BOLD, 15));
        backbtn.setBackground(Color.cyan);
        backbtn.setForeground(Color.white);
        backbtn.setOpaque(false);
        backbtn.addActionListener(this);
        c.add(backbtn);

        bkstudent = new JButton();
        bkstudent.setBounds(10, 90, 230, 30);
        bkstudent.setText("BACK to STUDENT PAGE");
        bkstudent.setFont(new Font("null", Font.BOLD, 15));
        bkstudent.setBackground(Color.cyan);
        bkstudent.setForeground(Color.white);
        bkstudent.setOpaque(false);
        bkstudent.addActionListener(this);
        c.add(bkstudent);

        exitbtn = new JButton();
        exitbtn.setBounds(10, 15, 100, 30);
        exitbtn.setText("EXIT");
        exitbtn.setFont(new Font("null", Font.BOLD, 15));
        exitbtn.setBackground(Color.cyan);
        exitbtn.setForeground(Color.white);
        exitbtn.setOpaque(false);
        exitbtn.addActionListener(this);
        c.add(exitbtn);

        sumbitbtn = new JButton();
        sumbitbtn.setBounds(130, 55, 100, 30);
        sumbitbtn.setText("SUMBIT");
        sumbitbtn.setFont(new Font("null", Font.BOLD, 15));
        sumbitbtn.setBackground(Color.cyan);
        sumbitbtn.setForeground(Color.white);
        sumbitbtn.setOpaque(false);
        sumbitbtn.addActionListener(this);
        c.add(sumbitbtn);

        rollnotxt = new JLabel("SELECT ROLLNO 👇🏻");
        rollnotxt.setBounds(10, 120, 240, 40);
        rollnotxt.setForeground(Color.lightGray);
        rollnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(rollnotxt); // COMBINE
        rollnofld = new Choice();
        rollnofld.setBounds(10, 160, 200, 30);
        rollnofld.setForeground(Color.darkGray);
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

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Checkresultimg.jpg"));
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
                String rolnox = rollnofld.getSelectedItem();
                String feedbacks = fdbkareas.getText();
                if ((rolnox.isEmpty() == false) && (feedbacks.isEmpty() == false)) {
                    try {
                        String query = "insert into Feedbacks values('" + rolnox + "' , '" + feedbacks + "')";
                        Connector con = new Connector();
                        con.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(display, " FEEDBACK SUMBIT SUCCESSFULLY .:", "POPUP",
                                JOptionPane.INFORMATION_MESSAGE);
                        new StudentHomePage();
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(display,
                                " ERROR OCCURED IN DATABASES \n CAN'T STORE DATA SUCCESSFULLY.:", "HELP",
                                JOptionPane.ERROR_MESSAGE);
                        new StudentHomePage();
                    }
                } else {
                    JOptionPane.showMessageDialog(display,
                            "SELECT YOUR ROLLNO AND \n WRITE SOMETHING IN THE FEEDBACK FORM .:", "POPUP",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (ae.getSource() == printbtn) {
                String txts = fdbkareas.getText();
                if (txts.isEmpty() == false) {
                    fdbkareas.print();
                    new HomePage();
                } else {
                    JOptionPane.showMessageDialog(display, " WRITE SOMETHING IN THE FEEDBACK FORM .:", "POPUP",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if (ae.getSource() == backbtn) {
                new StudentHomePage();
            }
            if (ae.getSource() == bkstudent) {
                new StudentHomePage();
            }
            if (ae.getSource() == exitbtn) {
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, " INVALID  DETAILS :       PLEASE  ENTER  VALID  DETAILS .", "HELP",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new FeedBackPage();
    }
}
