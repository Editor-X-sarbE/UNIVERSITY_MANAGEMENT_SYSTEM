import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.*;
import net.proteanit.sql.DbUtils;

public class ExaminationResultForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, viewstddtltxt, searchbartxt1, searchbartxt2, allsubtxt, allmarktxt;
    Choice searchbarfld1, searchbarfld2;
    JButton searchbtn, searchbtnx, printbtn, printbtnx, addbtn, cancelbtn, updatebtn;
    JTable tablefld1, tablefld2;

    public ExaminationResultForm() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.getContentPane().setBackground(Color.yellow);
        c = display.getContentPane();

        viewstddtltxt = new JLabel("CHECK RESULT");
        viewstddtltxt.setBounds(135, 150, 400, 90);
        viewstddtltxt.setForeground(Color.BLACK);
        viewstddtltxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(viewstddtltxt);

        allsubtxt = new JLabel("ALL SUBJECTS");
        allsubtxt.setBounds(1155, 285, 200, 30);
        allsubtxt.setForeground(Color.darkGray);
        allsubtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(allsubtxt);

        allmarktxt = new JLabel("ALL MARKS");
        allmarktxt.setBounds(1195, 515, 200, 30);
        allmarktxt.setForeground(Color.darkGray);
        allmarktxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(allmarktxt);

        searchbartxt1 = new JLabel("Search By Rollno :");
        searchbartxt1.setBounds(105, 205, 250, 100);
        searchbartxt1.setForeground(Color.DARK_GRAY);
        searchbartxt1.setFont(new Font("name", Font.BOLD, 27));
        searchbartxt1.setOpaque(false);
        c.add(searchbartxt1); // COMBINE
        searchbarfld1 = new Choice();
        searchbarfld1.setBounds(400, 240, 150, 30);
        searchbarfld1.setForeground(Color.blue);
        searchbarfld1.setFont(new Font("name", Font.BOLD, 19));
        c.add(searchbarfld1);

        try { // fetching rollno in the databases for subject__________________.........
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from subject");
            while (rs.next()) {
                searchbarfld1.add(rs.getString("rollno"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Table field1 for show data for subject
        // tables_______________________...........
        tablefld1 = new JTable();
        tablefld1.setOpaque(false);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from subject");
            tablefld1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scroll = new JScrollPane(tablefld1);
        scroll.setBounds(1, 315, 1365, 200);
        scroll.setOpaque(false);
        c.add(scroll);

        // searchbar txt eith field
        // 2___________________________________________________________.
        searchbartxt2 = new JLabel("Search By Rollno :");
        searchbartxt2.setBounds(130, 445, 250, 90);
        searchbartxt2.setForeground(Color.DARK_GRAY);
        searchbartxt2.setFont(new Font("name", Font.BOLD, 27));
        searchbartxt2.setOpaque(false);
        // c.add(searchbartxt2); //COMBINE
        searchbarfld2 = new Choice();
        searchbarfld2.setBounds(400, 475, 150, 30);
        searchbarfld2.setForeground(Color.blue);
        searchbarfld2.setFont(new Font("name", Font.BOLD, 19));
        // c.add(searchbarfld2);

        tablefld2 = new JTable(); // Table field2 for show data mark tables_______________________...........
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from marks");
            tablefld2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scrollx = new JScrollPane(tablefld2);
        scrollx.setBounds(1, 545, 1365, 200);
        c.add(scrollx);

        searchbtn = new JButton();
        searchbtn.setBounds(100, 285, 100, 30);
        searchbtn.setText("SEARCH");
        searchbtn.setFont(new Font("null", Font.BOLD, 15));
        searchbtn.setBackground(Color.cyan);
        searchbtn.setForeground(Color.green);
        searchbtn.setOpaque(false);
        searchbtn.addActionListener(this);
        c.add(searchbtn);

        searchbtnx = new JButton("SEARCH");
        searchbtnx.setBounds(580, 475, 100, 30);
        searchbtnx.setText("SEARCH");
        searchbtnx.setFont(new Font("null", Font.BOLD, 15));
        searchbtnx.setBackground(Color.cyan);
        searchbtnx.setForeground(Color.green);
        searchbtnx.setOpaque(false);
        searchbtnx.addActionListener(this);
        // c.add(searchbtnx);

        printbtn = new JButton();
        printbtn.setBounds(230, 285, 100, 30);
        printbtn.setText("PRINT");
        printbtn.setFont(new Font("null", Font.BOLD, 15));
        printbtn.setBackground(Color.cyan);
        printbtn.setForeground(Color.green);
        printbtn.setOpaque(false);
        printbtn.addActionListener(this);
        c.add(printbtn);

        printbtnx = new JButton();
        printbtnx.setBounds(100, 515, 100, 30);
        printbtnx.setText("PRINTX");
        printbtnx.setFont(new Font("null", Font.BOLD, 15));
        printbtnx.setBackground(Color.cyan);
        printbtnx.setForeground(Color.green);
        printbtnx.setOpaque(false);
        printbtnx.addActionListener(this);
        c.add(printbtnx);

        cancelbtn = new JButton();
        cancelbtn.setBounds(350, 285, 100, 30);
        cancelbtn.setText("BACK");
        cancelbtn.setFont(new Font("null", Font.BOLD, 15));
        cancelbtn.setBackground(Color.cyan);
        cancelbtn.setForeground(Color.red);
        cancelbtn.setOpaque(false);
        cancelbtn.addActionListener(this);
        c.add(cancelbtn);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("sher.jpg"));
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
                String query1 = "select * from subject where rollno= '" + searchbarfld1.getSelectedItem() + "'";
                try {
                    Connector c = new Connector();
                    ResultSet rs = c.s.executeQuery(query1);
                    tablefld1.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            else if (ae.getSource() == printbtn) {
                try {
                    tablefld1.print();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ae.getSource() == printbtnx) {
                try {
                    tablefld2.print();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (ae.getSource() == addbtn) {
                new NewStudentInformationpage();
            } else if (ae.getSource() == updatebtn) {
                new UpdateStudentInformationPage();
            } else {
                new HomePage();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display, " INVALID  DETAILS :       PLEASE  ENTER  VALID  DETAILS .", "HELP",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ExaminationResultForm();
    }
}
