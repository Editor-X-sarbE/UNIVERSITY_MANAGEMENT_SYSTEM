import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.proteanit.sql.*;
import net.proteanit.sql.DbUtils;

public class FeeStructureForm implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, fstructtxt;
    JTable tablefld;
    JButton printbtn, backbtn, bkstudent;

    public FeeStructureForm() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.getContentPane().setBackground(Color.white);
        c = display.getContentPane();

        fstructtxt = new JLabel("FEE STRUCTURE");
        fstructtxt.setBounds(96, -10, 800, 100);
        fstructtxt.setForeground(Color.white);
        fstructtxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(fstructtxt);

        tablefld = new JTable();         // table field for showing data
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from fee");
            tablefld.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        JScrollPane scroll = new JScrollPane(tablefld);
        scroll.setBounds(1, 110, 1365, 110);
        c.add(scroll);

        printbtn = new JButton();
        printbtn.setBounds(97, 70, 100, 30);
        printbtn.setText("PRINT");
        printbtn.setFont(new Font("null", Font.BOLD, 15));
        printbtn.setBackground(Color.cyan);
        printbtn.setForeground(Color.blue);
        printbtn.setOpaque(false);
        printbtn.addActionListener(this);
        c.add(printbtn);

        backbtn = new JButton();
        backbtn.setBounds(230, 70, 100, 30);
        backbtn.setText("BACK");
        backbtn.setFont(new Font("null", Font.BOLD, 15));
        backbtn.setBackground(Color.cyan);
        backbtn.setForeground(Color.red);
        backbtn.setOpaque(false);
        backbtn.addActionListener(this);
        c.add(backbtn);

        bkstudent = new JButton();
        bkstudent.setBounds(360, 70, 230, 30);
        bkstudent.setText("BACK to STUDENT PAGE");
        bkstudent.setFont(new Font("null", Font.BOLD, 15));
        bkstudent.setBackground(Color.cyan);
        bkstudent.setForeground(Color.red);
        bkstudent.setOpaque(false);
        bkstudent.addActionListener(this);
        // c.add(bkstudent);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("FFFFFFFFFFFFX.jpg"));
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
            if (ae.getSource() == bkstudent) {
                new StudentHomePage();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new FeeStructureForm();
    }
}
