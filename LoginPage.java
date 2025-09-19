import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage extends JFrame implements ActionListener {
    private JTextField userTextField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel statusLabel;

    public LoginPage() {
        setTitle("Login Page");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 1));
        userTextField = new JTextField();
        passField = new JPasswordField();
        loginButton = new JButton("Login");
        statusLabel = new JLabel("", SwingConstants.CENTER);

        panel.add(new JLabel("Username:"));
        panel.add(userTextField);
        panel.add(new JLabel("Password:"));
        panel.add(passField);

        add(panel, BorderLayout.CENTER);
        add(loginButton, BorderLayout.SOUTH);
        add(statusLabel, BorderLayout.NORTH);

        loginButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userTextField.getText();
        String password = new String(passField.getPassword());
        if ("admin".equals(username) && "password".equals(password)) {
            statusLabel.setText("Login Successful!");
        }
