package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Signup extends JFrame {


    Choice loginAsCho;
    TextField meterText, EmployerText, userNameText, nameText, passwordText;


    Signup() {

        super("Signup Page");

        JLabel createAs = new JLabel("Create Account AS");
        createAs.setBounds(30,50,125,20);
        add(createAs);

        loginAsCho = new Choice();
        loginAsCho.add("Admin");
        loginAsCho.add("Customer");
        loginAsCho.setBounds(170,50,125,20);
        add(loginAsCho);

        JLabel meterNo = new JLabel("Meter Number");
        meterNo.setBounds(30,100,125,20);
        meterNo.setVisible(false);
        add(meterNo);

        meterText = new TextField();
        meterText.setBounds(170,100,125,20);
        meterText.setVisible(false);
        add(meterText);

        JLabel Employer = new JLabel("Employer ID");
        Employer.setBounds(30,100,125,20);
        Employer.setVisible(true);
        add(Employer);

        EmployerText = new TextField();
        EmployerText.setBounds(170,100,125,20);
        EmployerText.setVisible(true);
        add(EmployerText);

        JLabel userName = new JLabel("UserName");
        userName.setBounds(30,140,125,20);
        add(userName);

        userNameText = new TextField();
        userNameText.setBounds(170,140,125,20);
        add(userNameText);

        JLabel name = new JLabel("Name");
        name.setBounds(30,180,125,20);
        add(name);

        nameText = new TextField();
        nameText.setBounds(170,180,125,20);
        add(nameText);

        JLabel password = new JLabel("Password");
        password.setBounds(30,220,125,20);
        add(password);

        passwordText = new TextField();
        passwordText.setBounds(170,220,125,20);
        add(passwordText);



        loginAsCho.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

            }
        });



        setSize(600,380);
        setLocation(500,200);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        ;
        new Signup();
    }
}
