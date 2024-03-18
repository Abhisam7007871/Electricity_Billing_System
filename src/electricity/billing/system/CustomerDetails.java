package electricity.billing.system;

import javax.swing.*;

public class CustomerDetails extends JFrame {


    CustomerDetails(){
        super("Customer Details");
        setSize(700,500);
        setLocation(400,200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerDetails();
    }
}
