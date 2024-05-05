import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class StudentHomePage implements ActionListener {
  JFrame display;
  Container c;
  JLabel background, usernmtxt, pswdtxt, adminlogintxt;
  JMenuBar menubar;
  JMenu unvimage, library, feestructure, abouts, collegelist, event, dropbox, utility, back, exit;
  JMenuItem unvimagex, libraryx, feestructurex, aboutsx, collegelistx, eventx, dropboxx, utilityx, backx, exitx,
      notepad, calculator, browser;

  public StudentHomePage() {
    display = new JFrame();
    display.setBounds(-5, 0, 1377, 775);
    display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
    display.setLayout(null);
    display.setResizable(true);
    display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    c = display.getContentPane();

    menubar = new JMenuBar();
    menubar.setBounds(0, 0, display.getWidth(), 20);
    menubar.setFont(new Font("name", Font.BOLD, 15));
    menubar.setOpaque(false);

    unvimage = new JMenu("IMAGES");
    unvimage.setForeground(Color.white);
    unvimage.setFont(new Font("name", Font.BOLD, 15));
    library = new JMenu("LIBRARY");
    library.setForeground(Color.white);
    library.setFont(new Font("name", Font.BOLD, 15));
    feestructure = new JMenu("FEE Structure");
    feestructure.setForeground(Color.red);
    feestructure.setFont(new Font("name", Font.BOLD, 15));
    abouts = new JMenu("UNIVERSITY");
    abouts.setForeground(Color.WHITE);
    abouts.setFont(new Font("name", Font.BOLD, 15));
    collegelist = new JMenu("College Lists");
    collegelist.setForeground(Color.red);
    collegelist.setFont(new Font("name", Font.BOLD, 15));
    event = new JMenu("EVENTS");
    event.setForeground(Color.lightGray);
    event.setFont(new Font("name", Font.BOLD, 15));
    dropbox = new JMenu("Drop Box");
    dropbox.setForeground(Color.cyan);
    dropbox.setFont(new Font("name", Font.BOLD, 15));
    utility = new JMenu("Utility");
    utility.setForeground(Color.blue);
    utility.setFont(new Font("name", Font.BOLD, 15));
    exit = new JMenu("Exit");
    exit.setForeground(Color.red);
    exit.setFont(new Font("name", Font.BOLD, 15));
    back = new JMenu("Back");
    back.setForeground(Color.red);
    back.setFont(new Font("name", Font.BOLD, 15));

    unvimagex = new JMenuItem("Images");
    unvimagex.setFont(new Font("name", Font.BOLD, 14));
    unvimagex.addActionListener(this);
    unvimage.add(unvimagex);

    libraryx = new JMenuItem("View Book");
    libraryx.setFont(new Font("name", Font.BOLD, 14));
    libraryx.addActionListener(this);
    library.add(libraryx);

    feestructurex = new JMenuItem("Fee Structure");
    feestructurex.setFont(new Font("name", Font.BOLD, 13));
    feestructurex.addActionListener(this);
    feestructure.add(feestructurex);

    collegelistx = new JMenuItem("College Lists");
    collegelistx.setFont(new Font("name", Font.BOLD, 13));
    collegelistx.addActionListener(this);
    collegelist.add(collegelistx);

    eventx = new JMenuItem("See Event Info");
    eventx.setFont(new Font("name", Font.BOLD, 13));
    eventx.addActionListener(this);
    event.add(eventx);

    dropboxx = new JMenuItem("Drop Box");
    dropboxx.setFont(new Font("name", Font.BOLD, 13));
    dropboxx.addActionListener(this);
    dropbox.add(dropboxx);

    notepad = new JMenuItem("Notepad");
    notepad.setFont(new Font("name", Font.BOLD, 13));
    notepad.addActionListener(this);

    calculator = new JMenuItem("Calculator");
    calculator.setFont(new Font("name", Font.BOLD, 13));
    calculator.addActionListener(this);

    browser = new JMenuItem("Web Browser");
    browser.setFont(new Font("name", Font.BOLD, 13));
    browser.addActionListener(this);
    utility.add(notepad);
    utility.add(calculator);
    utility.add(browser);

    aboutsx = new JMenuItem("University");
    aboutsx.setFont(new Font("name", Font.BOLD, 13));
    aboutsx.addActionListener(this);
    abouts.add(aboutsx);

    exitx = new JMenuItem("Exit");
    exitx.setFont(new Font("name", Font.BOLD, 13));
    exitx.addActionListener(this);
    exit.add(exitx);

    backx = new JMenuItem("<<<");
    backx.setFont(new Font("name", Font.BOLD, 13));
    backx.addActionListener(this);
    back.add(backx);

    menubar.add(abouts);
    menubar.add(unvimage);
    menubar.add(library);
    menubar.add(event);
    menubar.add(dropbox);
    menubar.add(exit);
    menubar.add(back);
    c.add(menubar);

    ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("Welcomeimage.jpg"));
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
      if (ae.getSource() == unvimagex) {
        new ViewImages();
      }
      if (ae.getSource() == feestructurex) {
        new FeeStructureForm(); // corroption
      }
      if (ae.getSource() == collegelistx) {
        JOptionPane.showMessageDialog(display,
            " LIST OF COLLEGE UNDER SAMBALPUR UNIVERSITY \n1>  Colleges in Sambalpur \n2>  Kuchinda College\n3>  Sambalpur Nursing College\n4>  Badriprasad Institute of Technology\n5>  Gayatri College Of Management Logo\n6>  Lajpat Rai Law College\n7>  Silicon Institute of Technology\n8>  Government Medical College and Hospital\n"
                + //
                "9>  Rourkela Law College\n10>  Badriprasad Institute of Technology\n11>  Naktideul Junior College.",
            "LISTS", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ae.getSource() == eventx) {
        new ViewEventsStudents();
      }
      if (ae.getSource() == libraryx) {
        new ViewLibraryStudent();
      }
      if (ae.getSource() == dropboxx) {
        new FeedBackPage(); // corroption
      }
      if (ae.getSource() == backx) {
        new WelcomePage();
      }
      if (ae.getSource() == exitx) {
        System.exit(0);
      }
      if (ae.getSource() == aboutsx) // project txt
      {
        JOptionPane.showMessageDialog(display,
            "University...  \nUiversity are not just places for acquiring knowledge and \ndegrees but also hubs for ideas, discoveries, and personal growth. \nThe significance of colleges and universities lies in their ability to advance society through research.\nResearchers at universities hold importance for reasons.",
            "UNIVERSITY", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ae.getSource() == libraryx) {
        try {
        } catch (Exception e) {
          e.printStackTrace();
        }
      }

      if (ae.getSource() == calculator) {
        try {
          Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
          System.out.println("an unexpected error occured");
        }
      }

      if (ae.getSource() == notepad) {
        try {
          Runtime.getRuntime().exec("notepad.exe");
        } catch (Exception e) {
          System.out.println("an unexpected error occured");
        }
      }
    } catch (Exception e) {
      JOptionPane.showMessageDialog(display, "             INVALID DETAILS :\nPLEASE ENTER VALID DETAILS ", "HELP",
          JOptionPane.INFORMATION_MESSAGE);
    }
  }

  public static void main(String[] args) {
    new StudentHomePage();
  }
}
//3