package electricity.billing.system;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class CustomerDetails extends JFrame {


    JLabel searchMeter, searchName ;
    Choice searchMeterCho, searchNameCho ;
    JTable table ;
    CustomerDetails(){
        super("Customer Details");
        getContentPane().setBackground(new Color(114, 181, 183));
        setSize(700,500);
        setLocation(400,200);
        setLayout(null);

        searchMeter = new JLabel("Search By Meter Number");
        searchMeter.setBounds(20,20,150,20);
        add(searchMeter);

        searchMeterCho = new Choice();
        searchMeterCho.setBounds(180,20,150,20);
        add(searchMeterCho);

        try{
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select * from New_Customer");
            while (resultSet.next()){
                searchMeterCho.add(resultSet.getString("meterno"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        searchName = new JLabel("Search By Name");
        searchName.setBounds(400,20,100,20);
        add(searchName);

        searchNameCho = new Choice();
        searchNameCho.setBounds(520,20,150,20);
        add(searchNameCho);

        try {
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select * from New_Customer");
            while (resultSet.next()){
                searchNameCho.add(resultSet.getString("name"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        table = new JTable();
        try{
            database c = new database();
            ResultSet resultSet = c.statement.executeQuery("select * from New_Customer");
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0,100,700,500);
        scrollPane.setBackground(new Color(137, 202, 229));
        add(scrollPane);



        setVisible(true);







    }

    public static void main(String[] args) {
        new CustomerDetails();
    }
}
