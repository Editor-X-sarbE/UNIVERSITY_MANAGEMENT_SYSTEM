import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MouseInputListener;
import javax.swing.text.View;

//import org.w3c.dom.events.MouseEvent;
import java.awt.*;
import java.awt.event.MouseListener.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Notepad //implements MouseListener
{
    JFrame screen;
    JMenuBar mbr;
    JMenu file, edit,format,view,help;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,
               i21,i22,i23,i24,i25,i26,i27,i28,i29,i30;


    public Notepad()
    {
        //addMouseListener(this);
        screen = new JFrame();
        screen.setTitle("Notepadx");
        screen.setBounds(300, 100, 600, 400);
        screen.setLayout(null);
        screen.setResizable(true);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mbr = new JMenuBar();
        mbr.setBounds(0, 1, screen.getWidth(), 30);
        //mbr.addMouseListener(this);


        file = new JMenu("File");
        edit = new JMenu("Edit");
        format=new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");

        //file = new JMenu("File");
        i1 = new JMenuItem("New");
        i2 = new JMenuItem("New window");
        i3 = new JMenuItem("Open");
        i4 = new JMenuItem("Save");
        i5=new JMenuItem("Save As");
        i6=new JMenuItem("Page Setup");
        i7=new JMenuItem("Print");
        i8=new JMenuItem("Exit..");
        file.add(i1);
        file.add(i2);
        file.add(i3);
        file.add(i4);
        file.add(i5);
        file.add(i6);
        file.add(i7);
        file.add(i8);
        //file.addMouseListener(this);

        // edit = new JMenu("Edit");
        i9 = new JMenuItem("Undo");
        edit.add(i9);
        i10 = new JMenuItem("Cut");
        edit.add(i10);
        i11=new JMenuItem("Copy");
        i12=new JMenuItem("Paste");
        i13=new JMenuItem("Delete");
        i14=new JMenuItem("Search with being");
        i15=new JMenuItem("Find");
        i16=new JMenuItem("Find Next");
        i17=new JMenuItem("Find Previoud");
        i18=new JMenuItem("Replace");
        i19=new JMenuItem("Go To");
        i20=new JMenuItem("Select All");
        i21=new JMenuItem("Time/Date");
        edit.add(i11);
        edit.add(i12);
        edit.add(i13);
        edit.add(i14);
        edit.add(i15);
        edit.add(i16);
        edit.add(i17);
        edit.add(i18);
        edit.add(i19);
        edit.add(i20);
        edit.add(i21);
        //edit.addMouseListener(this);
        
        i22=new JMenuItem("Word Wrap");
        i23=new JMenuItem("Font...");
        format.add(i22);
        format.add(i23);
        //format.addMouseListener(this);

        i24=new JMenuItem("Zoom    >");
        i25=new JMenuItem("Status Bar");
        view.add(i24);
        view.add(i25);
        //view.addMouseListener(this);

        i26 =new JMenuItem("View Help");
        i27 =new JMenuItem("Send FeedBack");
        i28=new JMenuItem("About Notepad");
        help.add(i26);
        help.add(i27);
        help.add(i28);
        //help.addMouseListener(this);

        mbr.add(file);
        mbr.add(edit);
        mbr.add(format);
        mbr.add(view);
        mbr.add(help);

        screen.add(mbr);
        screen.setVisible(true);
    }

    public void mouseClicked(MouseEvent e)
    {}

    public void MouseEntered(MouseEvent e)
    {
        //mbr.setText("mouse entered");
    }

    public void MouseExited(MouseEvent e)
    {
      // mbr.setText("mouse exited");
    }

    public void MousePressed(MouseEvent e)
    {
       // mbr.setText("mouse pressed");
    }

    public static void main(String[] args) 
    {
        new Notepad();
    }
    
}
// newinformtn,viewdtls,aplyleave,leavedtls,exmintn,feedtls,utility,about,exit;
