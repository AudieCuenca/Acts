import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener  {

    JLabel userLabel, passLabel;
    JTextField userField, passField;
    JButton loginButton;

    Login() {
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        add(userLabel);
        userLabel.setFont(new Font("Times New Roman", Font.BOLD,15));

        userField = new JTextField();
        userField.setBounds(100, 20, 160, 25);
        add(userField);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 50, 80, 25);
        add(passLabel);
        passLabel.setFont(new Font("Times New Roman", Font.BOLD,15));

        passField = new JTextField();
        passField.setBounds(100, 50, 160, 25);
        add(passField);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 80, 80, 25);
        add(loginButton);
        loginButton.addActionListener(this);

        setVisible(true);
        
        ImageIcon image = new ImageIcon("Burger_King_logo_(1999).svg.png");
        setTitle("BURGER KING");
		setResizable(false);
		setIconImage(image.getImage());
		getContentPane().setBackground(new Color(242,169, 0));
		setLocationRelativeTo(null);
		
		
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = userField.getText();
            String password = passField.getText();

            // check if the username and password match the correct credentials
            if (username.equals("admin") && password.equals("password")) {
                // login successful
                new Restaurant(); // open the main JFrame of your application
                setVisible(false); // close the login JFrame
            } else {
                // login failed
                // display an error message
                System.out.println("Invalid username or password");
            }
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}