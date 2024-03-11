package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField userText, passText;
    Choice loginChoice;

    JButton loginButton, cancelButton, signupButton;
    Login(){

        super("Logic");
        getContentPane().setBackground(Color.lightGray);
        JLabel username = new JLabel("UserName");
        username.setBounds(300,60,100,20);
        add(username);

        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("Password");
        password.setBounds(300,100,100,20);
        add(password);

        passText = new JTextField();
        passText.setBounds(400,100,150,20);
        add(passText);

        JLabel login = new JLabel("Login in As");
        login.setBounds(300,140,100,20);
        add(login);

        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400,140,150,20);
        add(loginChoice);

        loginButton = new JButton("Login");
        loginButton.setBounds(330,180,100,20);
        loginButton.addActionListener(this);
        add(loginButton);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(450,180,100,20);
        cancelButton.addActionListener(this);
        add(cancelButton);

        signupButton = new JButton("Signup");
        signupButton.setBounds(390,210,100,20);
        signupButton.addActionListener(this);
        add(signupButton);

        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("icons/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTwo);
        JLabel profileLabel = new JLabel(fprofileOne);
        profileLabel.setBounds(10,7,250,250);
        add(profileLabel);



        setSize(640,300);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            
            // write code here //
             
        } else if (e.getSource()==cancelButton) {
            setVisible(false);
            
        } else if (e.getSource()==signupButton) {
            setVisible(false);
            new Signup();

        }

    }

    public static void main(String[] args) {
        new Login();
    }
}
