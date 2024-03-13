package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Main_Class extends JFrame {

    Main_Class(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/ebs.png"));
        Image image = imageIcon.getImage().getScaledInstance(1530,830,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(image);
        JLabel imageLabel = new JLabel(imageIcon2);
        add(imageLabel);

        JMenuBar menuBar =  new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(menu);

        JMenuItem newcustomer = new JMenuItem("New Customer");
        newcustomer.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerImg = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.png"));
        Image customerImage = customerImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        newcustomer.setIcon(new ImageIcon(customerImage));
        menu.add(newcustomer);


        JMenuItem customerDetails = new JMenuItem("Customer Details");
        customerDetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon customerDetailsImg = new ImageIcon(ClassLoader.getSystemResource("icons/customerDetails.png"));
        Image customerDetailsImage = customerDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        customerDetails.setIcon(new ImageIcon(customerDetailsImage));
        menu.add(customerDetails);

        JMenuItem depositDetails = new JMenuItem("Deposit Details");
        depositDetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon depositDetailsImg = new ImageIcon(ClassLoader.getSystemResource("icons/depositdetails.png"));
        Image depositDetailsImage = depositDetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        depositDetails.setIcon(new ImageIcon(depositDetailsImage));
        menu.add(depositDetails);

        JMenuItem calculateBill = new JMenuItem("Calculator Bills");
        calculateBill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculateBillImg = new ImageIcon(ClassLoader.getSystemResource("icons/calculatorbills.png"));
        Image calculateBillImage = calculateBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculateBill.setIcon(new ImageIcon(calculateBillImage));
        menu.add(calculateBill);


        JMenu info = new JMenu("Information");
        info.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(info);

        JMenuItem upinfo = new JMenuItem("Update Information");
        upinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon upinfoImg = new ImageIcon(ClassLoader.getSystemResource("icons/refresh.png"));
        Image upinfoImage = upinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        upinfo.setIcon(new ImageIcon(upinfoImage));
        info.add(upinfo);

        JMenuItem viewinfo = new JMenuItem("View Information");
        viewinfo.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon viewinfoImg = new ImageIcon(ClassLoader.getSystemResource("icons/information.png"));
        Image viewinfoImage = viewinfoImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        viewinfo.setIcon(new ImageIcon(viewinfoImage));
        info.add(viewinfo);


        JMenu user = new JMenu("User");
        user.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(user);

        JMenuItem paybill = new JMenuItem("Pay Bills");
        paybill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon paybillImg = new ImageIcon(ClassLoader.getSystemResource("icons/pay.png"));
        Image paybillImage = paybillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        paybill.setIcon(new ImageIcon(paybillImage));
        user.add(paybill);

        JMenuItem billdetails = new JMenuItem("Bill Details");
        billdetails.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon billdetailsImg = new ImageIcon(ClassLoader.getSystemResource("icons/details.png"));
        Image billdetailsImage = billdetailsImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        billdetails.setIcon(new ImageIcon(billdetailsImage));
        user.add(billdetails);



        JMenu bill = new JMenu("Bill");
        bill.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(bill);

        JMenuItem genBill = new JMenuItem("Generate Bill");
        genBill.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon genBillImg = new ImageIcon(ClassLoader.getSystemResource("icons/bill.png"));
        Image genBillImage = genBillImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        genBill.setIcon(new ImageIcon(genBillImage));
        bill.add(genBill);

        JMenu utility = new JMenu("Utility");
        utility.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(utility);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon notepadImg = new ImageIcon(ClassLoader.getSystemResource("icons/notepad.png"));
        Image notepadImage = notepadImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        notepad.setIcon(new ImageIcon(notepadImage));
        utility.add(notepad);

        JMenuItem calculator = new JMenuItem("Calculator");
        calculator.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon calculatorImg = new ImageIcon(ClassLoader.getSystemResource("icons/calculator.png"));
        Image calculatorImage = calculatorImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        calculator.setIcon(new ImageIcon(calculatorImage));
        //calculator.setBackground(Color.green);
        utility.add(calculator);

        JMenu exit = new JMenu("Exit");
        exit.setFont(new Font("serif",Font.PLAIN,15));
        menuBar.add(exit);

        JMenuItem eexit = new JMenuItem("Exit");
        eexit.setFont(new Font("monospaced",Font.PLAIN,14));
        ImageIcon eexitImg = new ImageIcon(ClassLoader.getSystemResource("icons/exit.png"));
        Image eexitImage = eexitImg.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
        eexit.setIcon(new ImageIcon(eexitImage));
        //calculator.setBackground(Color.green);
        exit.add(eexit);




        setLayout(new FlowLayout());

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main_Class();
    }
}
