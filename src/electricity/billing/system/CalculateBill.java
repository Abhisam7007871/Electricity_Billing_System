package electricity.billing.system;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class CalculateBill extends JFrame {

    JLabel meternum, nameText, addressText ;

    Choice meterNumCho ;

    TextField a ;
    CalculateBill(){

        super("Calculate Bill");

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(214,195,247));
        add(panel);

        JLabel heading = new JLabel("Calculate Electricity Bill");
        heading.setBounds(70,10,300,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(heading);

        meternum = new JLabel("Meter Number");
        meternum.setBounds(50,80,100,20);
        panel.add(meternum);

        meterNumCho = new Choice();
        try{

            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select * from New_Customer");
            while (resultSet.next()){
                meterNumCho.add(resultSet.getString("meterno"));

            }
        }catch (Exception E){
            E.printStackTrace();
        }

        meterNumCho.setBounds(180,80,100,20);
        panel.add(meterNumCho);

        JLabel name = new JLabel("Name");
        name.setBounds(50,120,100,20);
        panel.add(name);

        nameText = new JLabel("");
        nameText.setBounds(180,120,150,20);
        panel.add(nameText);

        JLabel address = new JLabel("Address");
        address.setBounds(50,160,100,20);
        panel.add(address);

        addressText = new JLabel("");
        addressText.setBounds(180,160,150,20);
        panel.add(addressText);

        try{
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select * from New_Customer where meterno = '"+meterNumCho.getSelectedItem()+"'");

            while(resultSet.next()){
                nameText.setText(resultSet.getString("name"));
                addressText.setText(resultSet.getString("address"));
            }
        }catch (Exception E){
            E.printStackTrace();
        }










        setSize(650,400);
        setLocation(400,200);
        setVisible(true);

    }

    public static void main(String[] args) {
        new CalculateBill();
    }
}
