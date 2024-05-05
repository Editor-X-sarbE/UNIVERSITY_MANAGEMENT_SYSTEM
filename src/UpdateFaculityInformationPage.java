import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class UpdateFaculityInformationPage implements ActionListener {
    JFrame display;
    Container c;
    JLabel background, newfaculityinfotxt, nametxt, employeeidtxt, adresstxt, emailtxt, classxiitxt, educationtxt,
            fathernmtxt, dobtxt, phonenotxt, adharnotxt, classxtxt, departmenttxt, searchbartxt;
    JTextField namefld, employeefld, adressfld, emailfld, classxiifld, educationfld, fathernmfld, dobfld, phonenofld,
            adharnofld, classxfld, departmentfld;
    JButton sumbitbtn, cancelbtnl, searchbtn;
    Choice searchbarfld;

    public UpdateFaculityInformationPage() {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        newfaculityinfotxt = new JLabel("UPDATE  FACULITY  INFORMATION");
        newfaculityinfotxt.setBounds(310, 20, 800, 90);
        newfaculityinfotxt.setForeground(Color.gray);
        newfaculityinfotxt.setFont(new Font("name", Font.BOLD, 45));
        c.add(newfaculityinfotxt);

        searchbartxt = new JLabel("SELECT  EMPLOYEE I`D :");
        searchbartxt.setBounds(200, 80, 320, 100);
        searchbartxt.setForeground(Color.orange);
        searchbartxt.setFont(new Font("name", Font.BOLD, 19));
        searchbartxt.setOpaque(false);
        c.add(searchbartxt); // combine
        searchbarfld = new Choice();
        searchbarfld.setBounds(545, 115, 300, 30);
        searchbarfld.setForeground(Color.darkGray);
        searchbarfld.setFont(new Font("name", Font.BOLD, 19));
        c.add(searchbarfld); // combine
        try {
            Connector c = new Connector();
            ResultSet rs = c.s.executeQuery("select * from teacher");
            while (rs.next()) {
                searchbarfld.add(rs.getString("employee"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        searchbtn = new JButton();
        searchbtn.setBounds(950, 115, 100, 30);
        searchbtn.setText("SEARCH");
        searchbtn.setFont(new Font("null", Font.BOLD, 15));
        searchbtn.setBackground(Color.cyan);
        searchbtn.setForeground(Color.green);
        searchbtn.setOpaque(false);
        searchbtn.addActionListener(this);
        // c.add(searchbtn);

        nametxt = new JLabel("NAME          :");
        nametxt.setBounds(200, 150, 200, 100);
        nametxt.setForeground(Color.ORANGE);
        nametxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(nametxt); // COMBINE
        namefld = new JTextField();
        namefld.setBounds(365, 185, 200, 30);
        namefld.setForeground(Color.WHITE);
        namefld.setFont(new Font("name", Font.BOLD, 19));
        namefld.setOpaque(false);
        namefld.setEditable(false);
        c.add(namefld);

        employeeidtxt = new JLabel("EMPLOYEE ID':");
        employeeidtxt.setBounds(200, 220, 200, 100);
        employeeidtxt.setForeground(Color.ORANGE);
        employeeidtxt.setFont(new Font("name", Font.BOLD, 20));
        c.add(employeeidtxt); // COMBINE
        employeefld = new JTextField();
        employeefld.setBounds(365, 255, 200, 30);
        employeefld.setForeground(Color.WHITE);
        employeefld.setFont(new Font("name", Font.BOLD, 19));
        employeefld.setOpaque(false);
        employeefld.setEditable(false);
        c.add(employeefld);

        adresstxt = new JLabel("ADDRESS   :");
        adresstxt.setBounds(200, 285, 200, 100);
        adresstxt.setForeground(Color.ORANGE);
        adresstxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(adresstxt); // COMBINE
        adressfld = new JTextField();
        adressfld.setBounds(365, 320, 200, 30);
        adressfld.setForeground(Color.WHITE);
        adressfld.setFont(new Font("name", Font.BOLD, 19));
        adressfld.setOpaque(false);
        c.add(adressfld);

        emailtxt = new JLabel("EMAIL I'D    :");
        emailtxt.setBounds(200, 360, 200, 100);
        emailtxt.setForeground(Color.ORANGE);
        emailtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(emailtxt); // COMBINE
        emailfld = new JTextField();
        emailfld.setBounds(365, 395, 200, 30);
        emailfld.setForeground(Color.white);
        emailfld.setFont(new Font("name", Font.BOLD, 15));
        emailfld.setOpaque(false);
        c.add(emailfld);

        classxiitxt = new JLabel("CLASS XII(%):");
        classxiitxt.setBounds(200, 430, 200, 100);
        classxiitxt.setForeground(Color.ORANGE);
        classxiitxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(classxiitxt); // COMBINE
        classxiifld = new JTextField();
        classxiifld.setBounds(365, 465, 200, 30);
        classxiifld.setForeground(Color.WHITE);
        classxiifld.setFont(new Font("name", Font.BOLD, 19));
        classxiifld.setOpaque(false);
        classxiifld.setEditable(false);
        c.add(classxiifld);

        educationtxt = new JLabel("EDUCATION :");
        educationtxt.setBounds(200, 500, 200, 100);
        educationtxt.setForeground(Color.ORANGE);
        educationtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(educationtxt); // COMBINE
        educationfld = new JTextField();
        educationfld.setBounds(365, 535, 200, 30);
        educationfld.setForeground(Color.WHITE);
        educationfld.setFont(new Font("name", Font.BOLD, 19));
        educationfld.setOpaque(false);
        c.add(educationfld);

        fathernmtxt = new JLabel("FATHER NAME   :");
        fathernmtxt.setBounds(720, 150, 200, 100);
        fathernmtxt.setForeground(Color.ORANGE);
        fathernmtxt.setFont(new Font("name", Font.BOLD, 20));
        c.add(fathernmtxt); // COMBINE
        fathernmfld = new JTextField();
        fathernmfld.setBounds(900, 185, 200, 30);
        fathernmfld.setForeground(Color.WHITE);
        fathernmfld.setFont(new Font("name", Font.BOLD, 19));
        fathernmfld.setOpaque(false);
        fathernmfld.setEditable(false);
        c.add(fathernmfld);

        dobtxt = new JLabel("D_O_B           :");
        dobtxt.setBounds(720, 220, 200, 100);
        dobtxt.setForeground(Color.ORANGE);
        dobtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(dobtxt); // COMBINE
        dobfld = new JTextField();
        dobfld.setBounds(900, 255, 200, 30);
        dobfld.setForeground(Color.WHITE);
        dobfld.setFont(new Font("name", Font.BOLD, 19));
        dobfld.setOpaque(false);
        dobfld.setEditable(false);
        c.add(dobfld);

        phonenotxt = new JLabel("PHONE NO    :");
        phonenotxt.setBounds(720, 285, 200, 100);
        phonenotxt.setForeground(Color.ORANGE);
        phonenotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(phonenotxt); // COMBINE
        phonenofld = new JTextField();
        phonenofld.setBounds(900, 320, 200, 30);
        phonenofld.setForeground(Color.WHITE);
        phonenofld.setFont(new Font("name", Font.BOLD, 19));
        phonenofld.setOpaque(false);
        c.add(phonenofld);

        adharnotxt = new JLabel("ADHAR NO    :");
        adharnotxt.setBounds(720, 355, 200, 100);
        adharnotxt.setForeground(Color.ORANGE);
        adharnotxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(adharnotxt); // COMBINE
        adharnofld = new JTextField();
        adharnofld.setBounds(900, 390, 200, 30);
        adharnofld.setForeground(Color.WHITE);
        adharnofld.setFont(new Font("name", Font.BOLD, 19));
        adharnofld.setOpaque(false);
        c.add(adharnofld);

        classxtxt = new JLabel("CLASSX(%)   :");
        classxtxt.setBounds(720, 425, 200, 100);
        classxtxt.setForeground(Color.ORANGE);
        classxtxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(classxtxt); // COMBINE
        classxfld = new JTextField();
        classxfld.setBounds(900, 460, 200, 30);
        classxfld.setForeground(Color.WHITE);
        classxfld.setFont(new Font("name", Font.BOLD, 19));
        classxfld.setOpaque(false);
        classxfld.setEditable(false);
        c.add(classxfld);

        departmenttxt = new JLabel("DEPARTMENT:");
        departmenttxt.setBounds(720, 495, 200, 100);
        departmenttxt.setForeground(Color.ORANGE);
        departmenttxt.setFont(new Font("name", Font.BOLD, 25));
        c.add(departmenttxt); // COMBINE
        departmentfld = new JTextField();
        departmentfld.setBounds(900, 530, 200, 30);
        departmentfld.setForeground(Color.WHITE);
        departmentfld.setFont(new Font("name", Font.BOLD, 19));
        departmentfld.setOpaque(false);
        c.add(departmentfld);

        // set query for fetch data in the databses
        try {
            Connector c = new Connector();
            String query = "select * from teacher where employee='" + searchbarfld.getSelectedItem() + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                namefld.setText(rs.getString("name"));
                employeefld.setText(rs.getString("employee"));
                classxiifld.setText(rs.getString("cls_xii"));
                dobfld.setText(rs.getString("dob"));
                fathernmfld.setText(rs.getString("fname"));
                classxfld.setText(rs.getString("cls_x"));
                adressfld.setText(rs.getString("address"));
                emailfld.setText(rs.getString("email"));
                educationfld.setText(rs.getString("education"));
                phonenofld.setText(rs.getString("phnoo"));
                adharnofld.setText(rs.getString("addhar"));
                departmentfld.setText(rs.getString("depaetmnt"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // displayed the ordor data in frame
        searchbarfld.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent ie) {
                try {
                    Connector c = new Connector();
                    String query = "select * from teacher where employee='" + searchbarfld.getSelectedItem() + "'";
                    ResultSet rs = c.s.executeQuery(query);
                    while (rs.next()) {
                        namefld.setText(rs.getString("name"));
                        employeefld.setText(rs.getString("employee"));
                        classxiifld.setText(rs.getString("cls_xii"));
                        dobfld.setText(rs.getString("dob"));
                        fathernmfld.setText(rs.getString("fname"));
                        classxfld.setText(rs.getString("cls_x"));
                        adressfld.setText(rs.getString("address"));
                        emailfld.setText(rs.getString("email"));
                        educationfld.setText(rs.getString("education"));
                        phonenofld.setText(rs.getString("phnoo"));
                        adharnofld.setText(rs.getString("addhar"));
                        departmentfld.setText(rs.getString("depaetmnt"));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        // sumbitbutton and cancel buttons
        sumbitbtn = new JButton("UPDATE");
        sumbitbtn.setBounds(480, 630, 120, 30);
        sumbitbtn.setFont(new Font("name", Font.BOLD, 18));
        sumbitbtn.setForeground(Color.red);
        sumbitbtn.setBackground(Color.cyan);
        sumbitbtn.setOpaque(false);
        sumbitbtn.addActionListener(this);
        c.add(sumbitbtn); // BUTTONS
        cancelbtnl = new JButton("BACK");
        cancelbtnl.setBounds(680, 630, 120, 30);
        cancelbtnl.setFont(new Font("name", Font.BOLD, 18));
        cancelbtnl.setForeground(Color.red);
        cancelbtnl.setBackground(Color.cyan);
        cancelbtnl.setOpaque(false);
        cancelbtnl.addActionListener(this);
        c.add(cancelbtnl);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("NewfaculityInformationpage.jpeg"));
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
                String address = adressfld.getText();
                String email = emailfld.getText();
                String education = educationfld.getText();
                String phoneno = phonenofld.getText();
                String addharno = adharnofld.getText();
                String department = departmentfld.getText();

                if ((address.isEmpty() == false) && (email.isEmpty() == false) && (education.isEmpty() == false)
                        && (phoneno.isEmpty() == false) && (addharno.isEmpty() == false)
                        && (department.isEmpty() == false)) {
                    try {
                        String query = "update teacher set address='" + address + "', email='" + email
                                + "', education='" + education + "', phnoo='" + phoneno + "', addhar='" + addharno
                                + "', depaetmnt='" + department + "'where employee ='" + searchbarfld.getSelectedItem()
                                + "'";
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
        new WelcomePage();
    }
}
