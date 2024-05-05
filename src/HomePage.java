import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage implements ActionListener {
  JFrame display;
  Container c;
  JLabel background, usernmtxt, pswdtxt, adminlogintxt;
  JMenuBar menubar;
  JMenu newinformtn, viewdtls, aplyleave, leavedtls, exmintn, feedtls, utility, about, exit, back, fedback, vwfdbk,
      studentpage, library, event;
  JMenuItem nwfacultyinfo, nwstdntinfo, vwfacultydtls, vwstdntdtls, facultyleave, facultylvdtls, stdntleave,
      stdntlvdtls, bck, examark, examresult, feestruct, feestdnt, notpad, calcultor, webrowser, adminsocialprofile,
      exitt, aboutproject, updtFdtls, updtStdtls, feedback, viewfdbk, studentpagex, libraryx, vwbook, eventx, vwevent,
      updtevnt;

  public HomePage() {
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

    newinformtn = new JMenu("New Information");
    newinformtn.setForeground(Color.blue);
    newinformtn.setFont(new Font("name", Font.BOLD, 15));
    viewdtls = new JMenu("View Details");
    viewdtls.setForeground(Color.red);
    viewdtls.setFont(new Font("name", Font.BOLD, 15));
    aplyleave = new JMenu("Apply Leave");
    aplyleave.setForeground(Color.blue);
    aplyleave.setFont(new Font("name", Font.BOLD, 15));
    leavedtls = new JMenu("Leave Details");
    leavedtls.setForeground(Color.red);
    leavedtls.setFont(new Font("name", Font.BOLD, 15));
    exmintn = new JMenu("Examinations");
    exmintn.setForeground(Color.blue);
    exmintn.setFont(new Font("name", Font.BOLD, 15));
    feedtls = new JMenu("Fee Details");
    feedtls.setForeground(Color.red);
    feedtls.setFont(new Font("name", Font.BOLD, 15));
    utility = new JMenu("Utility");
    utility.setForeground(Color.blue);
    utility.setFont(new Font("name", Font.BOLD, 15));
    about = new JMenu("UNIVERSITY");
    about.setForeground(Color.DARK_GRAY);
    about.setFont(new Font("name", Font.BOLD, 17));
    exit = new JMenu("Exit");
    exit.setForeground(Color.red);
    exit.setFont(new Font("name", Font.BOLD, 15));
    back = new JMenu("Back");
    back.setForeground(Color.red);
    back.setFont(new Font("name", Font.BOLD, 15));
    fedback = new JMenu("FeedBack");
    fedback.setForeground(Color.blue);
    fedback.setFont(new Font("name", Font.BOLD, 15));
    vwfdbk = new JMenu("View Feedback");
    vwfdbk.setFont(new Font("name", Font.BOLD, 15));
    vwfdbk.setForeground(Color.blue);
    studentpage = new JMenu("Student Page");
    studentpage.setFont(new Font("name", Font.BOLD, 15));
    studentpage.setForeground(Color.LIGHT_GRAY);
    library = new JMenu("Library");
    library.setFont(new Font("name", Font.BOLD, 15));
    library.setForeground(Color.blue);
    event = new JMenu("Events");
    event.setFont(new Font("name", Font.BOLD, 15));
    event.setForeground(Color.magenta);

    nwfacultyinfo = new JMenuItem("New Faculity Information");
    nwfacultyinfo.setBackground(Color.cyan);
    nwfacultyinfo.addActionListener(this);
    nwstdntinfo = new JMenuItem("New Student Information");
    nwstdntinfo.addActionListener(this);
    newinformtn.add(nwfacultyinfo);
    newinformtn.add(nwstdntinfo);

    vwfacultydtls = new JMenuItem("View Faculity Information");
    vwfacultydtls.setBackground(Color.lightGray);
    vwfacultydtls.addActionListener(this);
    updtFdtls = new JMenuItem("Update Faculity Information");
    updtFdtls.setBackground(Color.lightGray);
    updtFdtls.addActionListener(this);
    vwstdntdtls = new JMenuItem("View Student Information");
    vwstdntdtls.addActionListener(this);
    updtStdtls = new JMenuItem("Update Student Information");
    updtStdtls.addActionListener(this);
    viewdtls.add(vwfacultydtls);
    viewdtls.add(vwstdntdtls);
    viewdtls.add(updtFdtls);
    viewdtls.add(updtStdtls);

    facultyleave = new JMenuItem("Apply Faculity Leave");
    facultyleave.addActionListener(this);
    stdntleave = new JMenuItem("Apply Student Leave");
    stdntleave.addActionListener(this);
    aplyleave.add(facultyleave);
    aplyleave.add(stdntleave);

    facultylvdtls = new JMenuItem("View Faculity Leave Details");
    facultylvdtls.addActionListener(this);
    stdntlvdtls = new JMenuItem("View Student Leave Details");
    stdntlvdtls.addActionListener(this);
    leavedtls.add(facultylvdtls);
    leavedtls.add(stdntlvdtls);

    examark = new JMenuItem("Examination Marks");
    examark.addActionListener(this);
    examresult = new JMenuItem("Examination Result");
    examresult.addActionListener(this);
    exmintn.add(examark);
    exmintn.add(examresult);

    feestruct = new JMenuItem("Fee Structures");
    feestruct.addActionListener(this);
    feestdnt = new JMenuItem("Student Fee");
    feestdnt.addActionListener(this);
    feedtls.add(feestruct);
    feedtls.add(feestdnt);

    notpad = new JMenuItem("Notepad");
    notpad.addActionListener(this);
    calcultor = new JMenuItem("Calculator");
    calcultor.addActionListener(this);
    webrowser = new JMenuItem("Web Browser");
    webrowser.addActionListener(this);
    utility.add(notpad);
    utility.add(calcultor);

    adminsocialprofile = new JMenuItem("Social Profiles");
    adminsocialprofile.addActionListener(this);
    aboutproject = new JMenuItem("University");
    aboutproject.setFont(new Font("name", Font.BOLD, 15));
    aboutproject.addActionListener(this);
    about.add(aboutproject);

    exitt = new JMenuItem("Exit");
    exitt.addActionListener(this);
    exit.add(exitt);

    bck = new JMenuItem("<<<");
    bck.addActionListener(this);
    back.add(bck);

    feedback = new JMenuItem("Add FeedBack");
    feedback.addActionListener(this);
    fedback.add(feedback);
    viewfdbk = new JMenuItem("View FeedBack");
    viewfdbk.addActionListener(this);
    fedback.add(viewfdbk);

    studentpagex = new JMenuItem("Student Ppge");
    studentpagex.addActionListener(this);
    studentpage.add(studentpagex);

    libraryx = new JMenuItem("Add Book ");
    libraryx.addActionListener(this);
    library.add(libraryx);
    vwbook = new JMenuItem("View Book ");
    vwbook.addActionListener(this);
    library.add(vwbook);

    eventx = new JMenuItem("Add Event ");
    eventx.addActionListener(this);
    event.add(eventx);
    vwevent = new JMenuItem("View Event ");
    vwevent.addActionListener(this);
    event.add(vwevent);
    updtevnt = new JMenuItem("Update Event ");
    updtevnt.addActionListener(this);
    event.add(updtevnt);

    menubar.add(about);
    menubar.add(newinformtn);
    menubar.add(viewdtls);
    menubar.add(aplyleave);
    menubar.add(leavedtls);
    menubar.add(exmintn);
    menubar.add(feedtls);
    menubar.add(library);
    menubar.add(event);
    menubar.add(utility);
    menubar.add(fedback);
    menubar.add(exit);
    menubar.add(back);
    menubar.add(studentpage);
    c.add(menubar);

    ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("UniversityHomeframe.jpg"));
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
      if (ae.getSource() == nwfacultyinfo) {
        new NewFaculityInformationPage(); // New faculity information page
      }
      if (ae.getSource() == updtFdtls) {
        new UpdateFaculityInformationPage(); // Update faculity information page
      }
      if (ae.getSource() == vwfacultydtls) {
        new ViewFaculityDetsilsForm(); // view faculity information page
      }
      if (ae.getSource() == stdntlvdtls) {
        new ViewStudentLeaveForm(); // View Student Leave details page
      }
      if (ae.getSource() == facultyleave) {
        new ApplyTeacherLeaveForm(); // Apply faculity(teacher) leave page
      }

      if (ae.getSource() == nwstdntinfo) {
        new NewStudentInformationpage(); // New Student information page
      }
      if (ae.getSource() == updtStdtls) {
        new UpdateStudentInformationPage(); // Update Student information page
      }
      if (ae.getSource() == vwstdntdtls) {
        new ViewStudentDetailsForm(); // view Student information page
      }
      if (ae.getSource() == facultylvdtls) {
        new ViewFaculityLeaveForm(); // view faculity details page
      }
      if (ae.getSource() == stdntleave) {
        new ApplyStudentLeaveForm(); // Apply Student leave page
      }
      if (ae.getSource() == examark) {
        new EnterStudentMarkForm(); // Student mark pages
      }
      if (ae.getSource() == examresult) {
        new ExaminationResultForm(); // Examination result page
      }
      if (ae.getSource() == feestdnt) {
        new StudentFeeForm(); // Student fee page
      }
      if (ae.getSource() == feestruct) {
        new FeeStructureForm(); // Fee structure page
      }

      if (ae.getSource() == feedback) {
        new FeedBackPage(); // FeedBack Page
      }
      if (ae.getSource() == viewfdbk) {
        new ViewFeedbacks();
      }
      if (ae.getSource() == studentpagex) {
        new StudentHomePage(); // view student page
      }
      if (ae.getSource() == libraryx) {
        new LibraryPageAdmin(); // Library admin page
      }
      if (ae.getSource() == vwbook) {
        new ViewLibraryStudent();
      }
      if (ae.getSource() == eventx) {
        new EventPageAdmin(); // Event page
      }
      if (ae.getSource() == vwevent) {
        new ViewEventsStudents();
      }
      if (ae.getSource() == updtevnt) {
        new UpdateEventPage();
      }
      if (ae.getSource() == aboutproject) // project txt
      {
        JOptionPane.showMessageDialog(display,
            "University...  \nUiversity are not just places for acquiring knowledge and \ndegrees but also hubs for ideas, discoveries, and personal growth. \nThe significance of colleges and universities lies in their ability to advance society through research.\nResearchers at universities hold importance for reasons.",
            "UNIVERSITY", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(display,
            "Name :-Sarbeswar Rout\n Gmail :- routsarbeswar29@gmail.com\n Contact :- 9178Xxxxxx\n Github :- Editor_x_sarbE .",
            "ADMIN SOCIAL PROFILE", JOptionPane.INFORMATION_MESSAGE);
      }
      if (ae.getSource() == exitt) {
        System.exit(0); // SYSTEM EXIT.
      }
      if (ae.getSource() == bck) {
        new WelcomePage(); // >>>
      }
      if (ae.getSource() == calcultor) {
        try {
          Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
          System.out.println("an unexpected error occured");
        }
      }
      if (ae.getSource() == notpad) {
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
    new HomePage();
  }
}
//2