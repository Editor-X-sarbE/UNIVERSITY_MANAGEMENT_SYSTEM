import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import com.jgoodies.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class UpdateEventPage implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, eventadmintxt, eventnmtxt, clgnametxt, eventtimetxt, bookslottxt, eventdatetxt, eventloctntxt,
            eventstatustxt, selectevntxt;
    JTextField eventdatefld, clgnamefld, eventtimefld, slotfld, eventloctnfld, eventnmfldx;
    Choice eventstatusfld, eventnmfld;
    JButton addbtn, cancelbtnl;

    public UpdateEventPage() {
        display = new JFrame();
        display.setBounds(-7, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        eventadmintxt = new JLabel("🏄 UPDATE EVENT PAGE 🥇");
        eventadmintxt.setBounds(200, 20, 800, 100);
        eventadmintxt.setForeground(Color.darkGray);
        eventadmintxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(eventadmintxt);

        eventnmtxt = new JLabel("EVENT NAME :");
        eventnmtxt.setBounds(200, 155, 180, 50);
        eventnmtxt.setForeground(Color.MAGENTA);
        eventnmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventnmtxt); // COMBINE
        eventnmfldx = new JTextField(); // choice field
        eventnmfldx.setBounds(400, 165, 250, 30);
        eventnmfldx.setForeground(Color.blue);
        eventnmfldx.setBackground(Color.lightGray);
        eventnmfldx.setFont(new Font("name", Font.BOLD, 23));
        eventnmfldx.setEditable(false);
        c.add(eventnmfldx);

        selectevntxt = new JLabel("SELECT EVENT 👇🏻");
        selectevntxt.setBounds(690, 230, 220, 50);
        selectevntxt.setForeground(Color.green);
        selectevntxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(selectevntxt); // COMBINE
        eventnmfld = new Choice(); // choice field
        eventnmfld.setBounds(690, 290, 250, 30);
        eventnmfld.setForeground(Color.blue);
        eventnmfld.setFont(new Font("name", Font.BOLD, 23));
        c.add(eventnmfld);
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from EventPageAdmin");
            while (rs.next()) {
                eventnmfld.add(rs.getString("Eventname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try { // set query for fetch data in the databses
            Connector c = new Connector();
            String query = "select * from EventPageAdmin where Eventname='" + eventnmfld.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                eventnmfldx.setText(rs.getString("Eventname"));
                clgnamefld.setText(rs.getString("Clgname"));
                eventtimefld.setText(rs.getString("Eventtime"));
                eventdatefld.setText(rs.getString("Eventdate"));
                eventloctnfld.setText(rs.getString("Location"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        eventnmfld.addItemListener(new ItemListener() { // displayed the data in the frame
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Connector c = new Connector();
                    String query = "select * from EventPageAdmin where Eventname='" + eventnmfld.getSelectedItem()
                            + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        eventnmfldx.setText(rs.getString("Eventname"));
                        clgnamefld.setText(rs.getString("Clgname"));
                        eventtimefld.setText(rs.getString("Eventtime"));
                        eventdatefld.setText(rs.getString("Eventdate"));
                        eventloctnfld.setText(rs.getString("Location"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        eventdatetxt = new JLabel("EVENT DATE :");
        eventdatetxt.setBounds(200, 330, 800, 100);
        eventdatetxt.setForeground(Color.MAGENTA);
        eventdatetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventdatetxt); // COMBINE
        eventdatefld = new JTextField();
        eventdatefld.setBounds(400, 365, 250, 30);
        eventdatefld.setForeground(Color.blue);
        eventdatefld.setBackground(Color.lightGray);
        eventdatefld.setFont(new Font("name", Font.BOLD, 20));
        eventdatefld.setEditable(false);
        c.add(eventdatefld);

        eventtimetxt = new JLabel("EVENT TIME :");
        eventtimetxt.setBounds(200, 270, 800, 80);
        eventtimetxt.setForeground(Color.magenta);
        eventtimetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventtimetxt); // COMBINE
        eventtimefld = new JTextField();
        eventtimefld.setBounds(400, 300, 250, 30);
        eventtimefld.setForeground(Color.blue);
        eventtimefld.setBackground(Color.lightGray);
        eventtimefld.setFont(new Font("name", Font.BOLD, 20));
        eventtimefld.setEditable(false);
        c.add(eventtimefld);

        clgnametxt = new JLabel("CLG NAME :");
        clgnametxt.setBounds(200, 210, 200, 80);
        clgnametxt.setForeground(Color.MAGENTA);
        clgnametxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(clgnametxt); // COMBINE
        clgnamefld = new JTextField();
        clgnamefld.setBounds(400, 235, 250, 30);
        clgnamefld.setForeground(Color.blue);
        clgnamefld.setBackground(Color.lightGray);
        clgnamefld.setFont(new Font("name", Font.BOLD, 20));
        clgnamefld.setEditable(false);
        c.add(clgnamefld);

        eventloctntxt = new JLabel("LOCATION :");
        eventloctntxt.setBounds(200, 410, 800, 80);
        eventloctntxt.setForeground(Color.magenta);
        eventloctntxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventloctntxt); // COMBINE
        eventloctnfld = new JTextField();
        eventloctnfld.setBounds(400, 435, 250, 30);
        eventloctnfld.setForeground(Color.blue);
        eventloctnfld.setBackground(Color.lightGray);
        eventloctnfld.setFont(new Font("name", Font.BOLD, 20));
        eventloctnfld.setEditable(false);
        c.add(eventloctnfld);

        eventstatustxt = new JLabel("STATUS :");
        eventstatustxt.setBounds(200, 475, 200, 80);
        eventstatustxt.setForeground(Color.MAGENTA);
        eventstatustxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventstatustxt); // COMBINE
        eventstatusfld = new Choice();
        eventstatusfld.setBounds(400, 500, 250, 30);
        eventstatusfld.setForeground(Color.black);
        eventstatusfld.setBackground(Color.lightGray);
        eventstatusfld.setFont(new Font("name", Font.BOLD, 20));
        eventstatusfld.add("Not Started");
        eventstatusfld.add("Started ");
        eventstatusfld.add("Delay ");
        eventstatusfld.add("Shift ");
        eventstatusfld.add("At End ");
        eventstatusfld.add("Ended ");
        c.add(eventstatusfld);

        addbtn = new JButton("UPDATE");
        addbtn.setBounds(300, 600, 120, 30);
        addbtn.setFont(new Font("name", Font.BOLD, 18));
        addbtn.setForeground(Color.green);
        addbtn.setBackground(Color.lightGray);
        addbtn.setOpaque(false);
        addbtn.addActionListener(this);
        c.add(addbtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(500, 600, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Updateeventimg.jpg"));
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
            if (ae.getSource() == addbtn) {
                String Eventname = eventnmfldx.getText();
                String Clgname = clgnamefld.getText();
                String Eventtime = eventtimefld.getText();
                String Eventdate = eventdatefld.getText();
                String Location = eventloctnfld.getText();
                String Status = eventstatusfld.getSelectedItem();

                if ((Eventname.isEmpty() == false) && (Clgname.isEmpty() == false) && (Eventtime.isEmpty() == false)
                        && (Eventdate.isEmpty() == false) && (Location.isEmpty() == false)
                        && (Status.isEmpty() == false)) {
                    try {
                        String query = "update EventPageAdmin set Status='" + Status + "'where Eventname ='"
                                + eventnmfld.getSelectedItem() + "'";
                        Connector c = new Connector();
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(display, " STUDENT DETAILED UPDATED SUCCESSFULLY .:", "HELP",
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
        new UpdateEventPage();
    }
}
