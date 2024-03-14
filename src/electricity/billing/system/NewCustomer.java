package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class NewCustomer extends JFrame {

    JLabel heading, customerName,meterNum, address,city, state, email, phone ;
    TextField nameText, meterText, addressText, cityText, stateText, emailText, phoneText ;

    JButton next, cancel;
    NewCustomer(){

        super("New Customer");
        setSize(700,500);
        setLocation(400,200);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252,185,3));
        add(panel);

        heading = new JLabel("New Customer");
        heading.setBounds(180,10,200,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(heading);

        customerName = new JLabel("New Customer");
        customerName.setBounds(50,80,100,20);
        panel.add(customerName);

        nameText = new TextField();
        nameText.setBounds(180,80,150,20);
        panel.add(nameText);

        meterNum = new JLabel("Meter Nubmer");
        meterNum.setBounds(50,120,100,20);
        panel.add(meterNum);

        meterText = new TextField("");
        meterText.setBounds(180,120,150,20);
        panel.add(meterText);

        Random ran = new Random();
        long number = ran.nextLong() %1000000;
        meterText.setText(""+Math.abs(number));

        address = new JLabel("Address ");
        address.setBounds(50,160,100,20);
        panel.add(address);

        addressText = new TextField();
        addressText.setBounds(180,160,150,20);
        panel.add(addressText);

        city = new JLabel("City ");
        city.setBounds(50,200,100,20);
        panel.add(city);

        cityText = new TextField();
        cityText.setBounds(180,200,150,20);
        panel.add(cityText);

        state = new JLabel("State ");
        state.setBounds(50,240,100,20);
        panel.add(state);

        stateText = new TextField();
        stateText.setBounds(180,240,150,20);
        panel.add(stateText);

        email = new JLabel("Email ");
        email.setBounds(50,280,100,20);
        panel.add(email);

        emailText = new TextField();
        emailText.setBounds(180,280,150,20);
        panel.add(emailText);

        phone = new JLabel("Phone ");
        phone.setBounds(50,320,100,20);
        panel.add(phone);

        phoneText = new TextField();
        phoneText.setBounds(180,320,150,20);
        panel.add(phoneText);

        next = new JButton("Next");
        next.setBounds(70,390,100,25);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        panel.add(next);

        cancel = new JButton("Cancel");
        cancel.setBounds(210,390,100,25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.white);
        panel.add(cancel);



        setLayout(new BorderLayout());
        add(panel,"Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/boy.png"));
        Image i2 = i1.getImage().getScaledInstance(230,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLabel = new JLabel(i3);
        add(imgLabel,"West");

        setVisible(true);
    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
