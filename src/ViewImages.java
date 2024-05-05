import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewImages implements ActionListener
{
    JFrame display;
    Container c;
    JLabel background;
    JButton back;

    public ViewImages()
    {
        display = new JFrame();
        display.setBounds(-5, 0, 1377, 775);
        display.setTitle("UNIVERSITY_💢💢💢💢🏛️");
        display.setLayout(null);
        display.setResizable(true);
        display.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = display.getContentPane();

        back= new JButton();
        back.setBounds(1280, 02, 85, 35);
        back.setText("<<<");
        back.setFont(new Font("null",Font.BOLD,15));
        back.setBackground(Color.cyan);
        back.setForeground(Color.WHITE);
        back.setOpaque(false);
        back.addActionListener(this);
        c.add(back);

        ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("1img.jpg"));
        background = new JLabel();
        background.setBounds(0, 0, 1370, 770);
        Image ig = ic.getImage();
        Image ig2 = ig.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic2 = new ImageIcon(ig2);
        background.setIcon(ic2);
        c.add(background);

        display.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        try {
            if (ae.getSource()==back) {
                new StudentHomePage();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(display,"An Unexpected Error Occured .","HELP",JOptionPane.WARNING_MESSAGE);
        }
    }
    public static void main(String[] args) 
    {
        new ViewImages();
    }
}
