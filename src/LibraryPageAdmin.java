import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import com.jgoodies.*;
import com.toedter.calendar.JDateChooser;

public class LibraryPageAdmin implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, libadmintxt, booknmtxt, authornmtxt, serialnotxt, bookslottxt, datetxt, bookcontenttxt;
    JTextField libadminfld, booknmfld, authornmfld, serialnofld, slotfld, bookcontentfld;
    Choice bookslotfld;
    JButton addbtn, cancelbtnl;
    JDateChooser datefld;

    public LibraryPageAdmin() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        libadmintxt = new JLabel("📖 LIBRARY ADD BOOK PAGE 📖");
        libadmintxt.setBounds(340, 20, 800, 100);
        libadmintxt.setForeground(Color.gray);
        libadmintxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(libadmintxt);

        booknmtxt = new JLabel("BOOK NAME :");
        booknmtxt.setBounds(200, 140, 800, 80);
        booknmtxt.setForeground(Color.white);
        booknmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(booknmtxt); // COMBINE
        booknmfld = new JTextField();
        booknmfld.setBounds(400, 165, 250, 30);
        booknmfld.setForeground(Color.white);
        booknmfld.setBackground(Color.lightGray);
        booknmfld.setFont(new Font("name", Font.BOLD, 20));
        booknmfld.setOpaque(false);
        c.add(booknmfld);

        datetxt = new JLabel("DATE :");
        datetxt.setBounds(200, 400, 800, 100);
        datetxt.setForeground(Color.white);
        datetxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(datetxt); // COMBINE
        datefld = new JDateChooser();
        datefld.setBounds(400, 435, 250, 30);
        datefld.setForeground(Color.white);
        datefld.setBackground(Color.lightGray);
        datefld.setFont(new Font("name", Font.BOLD, 20));
        datefld.setOpaque(false);
        c.add(datefld);

        serialnotxt = new JLabel("SERIAL NO :");
        serialnotxt.setBounds(200, 270, 800, 80);
        serialnotxt.setForeground(Color.white);
        serialnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(serialnotxt); // COMBINE
        serialnofld = new JTextField();
        serialnofld.setBounds(400, 300, 250, 30);
        serialnofld.setForeground(Color.white);
        serialnofld.setBackground(Color.lightGray);
        serialnofld.setFont(new Font("name", Font.BOLD, 20));
        serialnofld.setOpaque(false);
        c.add(serialnofld);

        bookslottxt = new JLabel("BOOK SLOT :");
        bookslottxt.setBounds(200, 340, 200, 80);
        bookslottxt.setForeground(Color.white);
        bookslottxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(bookslottxt); // COMBINE
        bookslotfld = new Choice();
        bookslotfld.setBounds(400, 365, 250, 30);
        bookslotfld.setForeground(Color.black);
        bookslotfld.setBackground(Color.lightGray);
        bookslotfld.setFont(new Font("name", Font.BOLD, 20));
        bookslotfld.add("Slot 1");
        bookslotfld.add("Slot 2");
        bookslotfld.add("Slot 3");
        bookslotfld.add("Slot 4");
        bookslotfld.add("Slot 5");
        c.add(bookslotfld);

        authornmtxt = new JLabel("AUTHOR NAME :");
        authornmtxt.setBounds(200, 210, 800, 80);
        authornmtxt.setForeground(Color.white);
        authornmtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(authornmtxt); // COMBINE
        authornmfld = new JTextField();
        authornmfld.setBounds(400, 235, 250, 30);
        authornmfld.setForeground(Color.white);
        authornmfld.setBackground(Color.lightGray);
        authornmfld.setFont(new Font("name", Font.BOLD, 20));
        authornmfld.setOpaque(false);
        c.add(authornmfld);

        bookcontenttxt = new JLabel("Descripition :");
        bookcontenttxt.setBounds(200, 470, 800, 80);
        bookcontenttxt.setForeground(Color.CYAN);
        bookcontenttxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(bookcontenttxt); // COMBINE
        bookcontentfld = new JTextField("> Avilavle");
        bookcontentfld.setBounds(400, 495, 250, 30);
        bookcontentfld.setForeground(Color.red);
        bookcontentfld.setBackground(Color.lightGray);
        bookcontentfld.setFont(new Font("name", Font.BOLD, 20));
        bookcontentfld.setEditable(true);
        c.add(bookcontentfld);

        addbtn = new JButton("ADD");
        addbtn.setBounds(300, 600, 120, 30);
        addbtn.setFont(new Font("name", Font.BOLD, 18));
        addbtn.setForeground(Color.cyan);
        addbtn.setBackground(Color.cyan);
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

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Librariesimage.jpg"));
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
                String Bookname = booknmfld.getText();
                String Authorname = authornmfld.getText();
                String Serialno = serialnofld.getText();
                String Bookslot = (String) bookslotfld.getSelectedItem();
                String Dates = ((JTextField) datefld.getDateEditor().getUiComponent()).getText();
                String Books = bookcontentfld.getText();

                if ((Bookname.isEmpty() == false) && (Authorname.isEmpty() == false) && (Serialno.isEmpty() == false)
                        && (Bookslot.isEmpty() == false) && (Dates.isEmpty() == false) && (Books.isEmpty() == false)) {
                    try {
                        String query = "insert into LibraryPageAdmin values('" + Bookname + "', '" + Authorname + "', '"
                                + Serialno + "', '" + Bookslot + "', '" + Dates + "', '" + Books + "')";
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
        new LibraryPageAdmin();
    }
}
