/*public class Matches 
{

    public static void main(String[] args) 
    {
        String phoneNumber = "1234567890"; // Replace this with the phone number you want to validate
        
        if (isValidMobileNumber(phoneNumber)) 
        {
            System.out.println("Valid mobile number");
        } 
        else 
        {
            System.out.println("Invalid mobile number");
        }
    }

    public static boolean isValidMobileNumber(String phoneNumber) 
    {
        // Define a regular expression for a basic mobile number pattern
        String regex = "^[1-9]\\d{9}$";

        // Use the matches method to check if the phoneNumber matches the pattern
        return phoneNumber.matches(regex);
    }
}*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Matches extends JFrame 
{

    private JTextField phoneNumberTextField;

    public Matches() 
    {
        setTitle("Phone Number Validator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initUI();

        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void initUI() 
    {
        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));

        // Add components to the panel
        JLabel phoneNumberLabel = new JLabel("Enter Phone Number:");
        phoneNumberTextField = new JTextField();

        JButton validateButton = new JButton("Validate");

        validateButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                validatePhoneNumber();
            }
        });

        panel.add(phoneNumberLabel);
        panel.add(phoneNumberTextField);
        panel.add(validateButton);

        // Add panel to the frame
        add(panel);
    }

    private void validatePhoneNumber() 
    {
        String phoneNumber = phoneNumberTextField.getText();

        // Define a regular expression for a simple phone number format (10 digits)
        String phoneNumberRegex = "\\d{10}";

        // Check if the entered phone number matches the regular expression
        if (phoneNumber.matches(phoneNumberRegex)) 
        {
            JOptionPane.showMessageDialog(this, "Valid Phone Number!");
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Invalid Phone Number! Please enter 10 digits.");
        }
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new Matches();
            }
        });
    }
}

