import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewStudentLeaveForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, viewstddtltxt, searchbartxt;
    Choice searchbarfld;
    JButton searchbtn, printbtn, addbtn, cancelbtn, updatebtn;
    JTable tablefld;

    public ViewStudentLeaveForm() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.getContentPane().setBackground(Color.yellow);
        c = display.getContentPane();

        viewstddtltxt = new JLabel("VIEW STUDENT LEAVE DETAILS");
        viewstddtltxt.setBounds(105, 0, 800, 100);
        viewstddtltxt.setForeground(Color.lightGray);
        viewstddtltxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(viewstddtltxt);

        searchbartxt = new JLabel("Search By Rollno :");
        searchbartxt.setBounds(130, 80, 250, 100);
        searchbartxt.setForeground(Color.gray);
        searchbartxt.setFont(new Font("name", Font.BOLD, 27));
        searchbartxt.setOpaque(false);
        c.add(searchbartxt); // COMBINE
        searchbarfld = new Choice();
        searchbarfld.setBounds(400, 115, 150, 30);
        searchbarfld.setForeground(Color.blue);
        searchbarfld.setFont(new Font("name", Font.BOLD, 19));
        c.add(searchbarfld); // fetching rollno in the databases__________________.........
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from studentleaveform");
            while (rs.next()) {
                searchbarfld.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        tablefld = new JTable(); // Table field for show data_______________________...........
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from studentleaveform");
            tablefld.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scroll = new JScrollPane(tablefld);
        scroll.setBounds(1, 230, 1365, 520);
        c.add(scroll);

        searchbtn = new JButton();
        searchbtn.setBounds(100, 175, 100, 30);
        searchbtn.setText("SEARCH");
        searchbtn.setFont(new Font("null", Font.BOLD, 15));
        searchbtn.setBackground(Color.cyan);
        searchbtn.setForeground(Color.green);
        searchbtn.setOpaque(false);
        searchbtn.addActionListener(this);
        c.add(searchbtn);

        printbtn = new JButton();
        printbtn.setBounds(230, 175, 100, 30);
        printbtn.setText("PRINT");
        printbtn.setFont(new Font("null", Font.BOLD, 15));
        printbtn.setBackground(Color.cyan);
        printbtn.setForeground(Color.green);
        printbtn.setOpaque(false);
        printbtn.addActionListener(this);
        c.add(printbtn);

        addbtn = new JButton();
        addbtn.setBounds(350, 175, 100, 30);
        addbtn.setText("ADD");
        addbtn.setFont(new Font("null", Font.BOLD, 15));
        addbtn.setBackground(Color.cyan);
        addbtn.setForeground(Color.green);
        addbtn.setOpaque(false);
        addbtn.addActionListener(this);
        c.add(addbtn);

        updatebtn = new JButton();
        updatebtn.setBounds(470, 175, 100, 30);
        updatebtn.setText("EXIT");
        updatebtn.setFont(new Font("null", Font.BOLD, 15));
        updatebtn.setBackground(Color.cyan);
        updatebtn.setForeground(Color.green);
        updatebtn.setOpaque(false);
        updatebtn.addActionListener(this);
        c.add(updatebtn);

        cancelbtn = new JButton();
        cancelbtn.setBounds(590, 175, 100, 30);
        cancelbtn.setText("BACK");
        cancelbtn.setFont(new Font("null", Font.BOLD, 15));
        cancelbtn.setBackground(Color.cyan);
        cancelbtn.setForeground(Color.green);
        cancelbtn.setOpaque(false);
        cancelbtn.addActionListener(this);
        c.add(cancelbtn);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("view4.jpg"));
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
            if (ae.getSource() == searchbtn) {
                String query = "select * from studentleaveform where rollno= '" + searchbarfld.getSelectedItem() + "'";
                try {
                    Connector c = new Connector();
                    ResultSet rs = c.s.executeQuery(query);
                    tablefld.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ae.getSource() == printbtn) {
                try {
                    tablefld.print();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ae.getSource() == addbtn) {
                new ApplyStudentLeaveForm();
            } else if (ae.getSource() == updatebtn) {
                System.exit(0);
            } else {
                new HomePage();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, " INVALID  DETAILS :       PLEASE  ENTER  VALID  DETAILS .", "HELP",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ViewStudentLeaveForm();
    }
}
