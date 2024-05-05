import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewFeedbacks implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, vwfdbktxt, searchtxt;
    JTable tablefld;
    JButton printbtn, backbtn, searchbtn;
    Choice rollnofld;

    public ViewFeedbacks() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.getContentPane().setBackground(Color.white);
        c = display.getContentPane();

        vwfdbktxt = new JLabel("VIEW FEEDBACKS💢");
        vwfdbktxt.setBounds(900, 15, 500, 50);
        vwfdbktxt.setForeground(Color.lightGray);
        vwfdbktxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(vwfdbktxt);

        searchtxt = new JLabel("Search by Rollno👇🏻");
        searchtxt.setBounds(1080, 50, 270, 50);
        searchtxt.setForeground(Color.lightGray);
        searchtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(searchtxt);

        rollnofld = new Choice();
        rollnofld.setBounds(1080, 100, 250, 30);
        rollnofld.setForeground(Color.gray);
        rollnofld.setFont(new Font("name", Font.BOLD, 20));
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
        // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TABLE FIELD
        tablefld = new JTable();
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from Feedbacks");
            tablefld.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scroll = new JScrollPane(tablefld);
        scroll.setBounds(1, 410, 1365, 335);
        c.add(scroll);

        printbtn = new JButton();
        printbtn.setBounds(1120, 150, 100, 30);
        printbtn.setText("PRINT");
        printbtn.setFont(new Font("null", Font.BOLD, 15));
        printbtn.setBackground(Color.cyan);
        printbtn.setForeground(Color.blue);
        printbtn.setOpaque(false);
        printbtn.addActionListener(this);
        c.add(printbtn);

        backbtn = new JButton();
        backbtn.setBounds(1000, 150, 100, 30);
        backbtn.setText("BACK");
        backbtn.setFont(new Font("null", Font.BOLD, 15));
        backbtn.setBackground(Color.cyan);
        backbtn.setForeground(Color.red);
        backbtn.setOpaque(false);
        backbtn.addActionListener(this);
        c.add(backbtn);

        searchbtn = new JButton();
        searchbtn.setBounds(1240, 150, 100, 30);
        searchbtn.setText("SEARCH");
        searchbtn.setFont(new Font("null", Font.BOLD, 15));
        searchbtn.setBackground(Color.cyan);
        searchbtn.setForeground(Color.blue);
        searchbtn.setOpaque(false);
        searchbtn.addActionListener(this);
        c.add(searchbtn);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Viewfeedbacksimage.jpg"));
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
            if (ae.getSource() == printbtn) {
                tablefld.print();
            }
            if (ae.getSource() == backbtn) {
                new HomePage();
            }
            if (ae.getSource() == searchbtn) {
                String query = "select * from Feedbacks where rollno= '" + rollnofld.getSelectedItem() + "'";
                try {
                    Connector c = new Connector();
                    ResultSet rs = c.s.executeQuery(query);
                    tablefld.setModel(DbUtils.resultSetToTableModel(rs));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ViewFeedbacks();
    }
}
