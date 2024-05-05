import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import com.jgoodies.*;
import com.toedter.calendar.JDateChooser;

public class EventPageAdmin implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, eventadmintxt, eventnmtxt, clgnametxt, eventtimetxt, bookslottxt, eventdatetxt, eventloctntxt,
            eventstatustxt;
    JTextField eventnmfld, eventtimefld, slotfld, eventloctnfld;
    Choice clgnamefld, eventstatusfld;
    JButton addbtn, cancelbtnl;
    JDateChooser eventdatefld;

    public EventPageAdmin() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        eventadmintxt = new JLabel("🏄 ADD EVENT PAGE 🥇");
        eventadmintxt.setBounds(200, 20, 800, 100);
        eventadmintxt.setForeground(Color.darkGray);
        eventadmintxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(eventadmintxt);

        eventnmtxt = new JLabel("EVENT NAME :");
        eventnmtxt.setBounds(200, 140, 800, 80);
        eventnmtxt.setForeground(Color.MAGENTA);
        eventnmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventnmtxt); // COMBINE
        eventnmfld = new JTextField();
        eventnmfld.setBounds(400, 165, 250, 30);
        eventnmfld.setForeground(Color.blue);
        eventnmfld.setBackground(Color.lightGray);
        eventnmfld.setFont(new Font("name", Font.BOLD, 20));
        c.add(eventnmfld);

        eventdatetxt = new JLabel("EVENT DATE :");
        eventdatetxt.setBounds(200, 330, 800, 100);
        eventdatetxt.setForeground(Color.MAGENTA);
        eventdatetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(eventdatetxt); // COMBINE
        eventdatefld = new JDateChooser();
        eventdatefld.setBounds(400, 365, 250, 30);
        eventdatefld.setForeground(Color.white);
        eventdatefld.setBackground(Color.lightGray);
        eventdatefld.setFont(new Font("name", Font.BOLD, 20));
        eventdatefld.setOpaque(false);
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
        c.add(eventtimefld);

        clgnametxt = new JLabel("CLG NAME :");
        clgnametxt.setBounds(200, 210, 200, 80);
        clgnametxt.setForeground(Color.MAGENTA);
        clgnametxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(clgnametxt); // COMBINE
        clgnamefld = new Choice();
        clgnamefld.setBounds(400, 235, 250, 30);
        clgnamefld.setForeground(Color.blue);
        clgnamefld.setBackground(Color.lightGray);
        clgnamefld.setFont(new Font("name", Font.BOLD, 20));
        clgnamefld.add("DAMITS");
        clgnamefld.add("BPUT ");
        clgnamefld.add("Kuchinda College ");
        clgnamefld.add("Rourkela Law College");
        clgnamefld.add("Silicon Institute of Technology");
        clgnamefld.add("Badriprasad IT Technology");
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

        addbtn = new JButton("ADD");
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

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Eveennttt.jpg"));
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
                String Eventname = eventnmfld.getText();
                String Clgname = clgnamefld.getSelectedItem();
                String Eventtime = eventtimefld.getText();
                String Eventdate = ((JTextField) eventdatefld.getDateEditor().getUiComponent()).getText();
                String Location = eventloctnfld.getText();
                String Status = eventstatusfld.getSelectedItem();

                if ((Eventname.isEmpty() == false) && (Clgname.isEmpty() == false) && (Eventtime.isEmpty() == false)
                        && (Eventdate.isEmpty() == false) && (Location.isEmpty() == false)
                        && (Status.isEmpty() == false)) {
                    try {
                        String query = "insert into EventPageAdmin values('" + Eventname + "', '" + Clgname + "', '"
                                + Eventtime + "', '" + Eventdate + "', '" + Location + "', '" + Status + "')";
                        Connector c = new Connector();
                        c.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(display, "ADDED  SUCCESSFULLY .:", "POPUP",
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
        new EventPageAdmin();
    }
}
