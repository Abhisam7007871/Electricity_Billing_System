package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class MeterInfo extends JFrame {


    Choice meterLocCho, meterTypCho, phaseCodeCho, buildTypCho;

    JButton submit ;
    MeterInfo(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(252,186,3));
        add(panel);

        JLabel heading = new JLabel("Meter Information");
        heading.setBounds(180,10,200,20);
        heading.setFont(new Font("Tahoma",Font.BOLD,20));
        panel.add(heading);

        JLabel meterNumber = new JLabel("Meter Number");
        meterNumber.setBounds(50,80,100,20);
        panel.add(meterNumber);

        JLabel meterNumText = new JLabel();
        meterNumText.setBounds(180,80,150,20);
        panel.add(meterNumText);

        JLabel meterLoc = new JLabel("Meter Location");
        meterLoc.setBounds(50,120,100,20);
        panel.add(meterLoc);

        meterLocCho = new Choice();
        meterLocCho.add("Outside");
        meterLocCho.add("Inside");
        meterLocCho.setBounds(180,120,150,20);
        panel.add(meterLocCho);

        JLabel meterTyp = new JLabel("Meter Type");
        meterTyp.setBounds(50,160,100,20);
        panel.add(meterTyp);

        meterTypCho = new Choice();
        meterTypCho.add("Electric Meter");
        meterTypCho.add("Solar Meter");
        meterTypCho.add("Smart Meter");
        meterTypCho.setBounds(180,160,150,20);
        panel.add(meterTypCho);


        JLabel phaseCode = new JLabel("Phase Code");
        phaseCode.setBounds(50,200,100,20);
        panel.add(phaseCode);

        phaseCodeCho = new Choice();
        phaseCodeCho.add("011");
        phaseCodeCho.add("022");
        phaseCodeCho.add("033");
        phaseCodeCho.add("055");
        phaseCodeCho.add("066");
        phaseCodeCho.add("077");
        phaseCodeCho.add("088");
        phaseCodeCho.add("099");
        phaseCodeCho.setBounds(180,200,150,20);
        panel.add(phaseCodeCho);

        JLabel buildTyp = new JLabel("Build Type");
        buildTyp.setBounds(50,240,100,20);
        panel.add(buildTyp);

        buildTypCho = new Choice();
        buildTypCho.add("Normal");
        buildTypCho.add("Industrial");
        buildTypCho.setBounds(180,240,150,20);
        panel.add(buildTypCho);

        JLabel day = new JLabel("30 Days Billing Time...");
        day.setBounds(50,280,200,20);
        panel.add(day);

        JLabel note = new JLabel("Note:-");
        note.setBounds(50,320,100,20);
        panel.add(note);

        JLabel note1 = new JLabel("By default bill is calculated 30 days only.");
        note1.setBounds(50,340,300,20);
        panel.add(note1);

        submit = new JButton("Submit");
        submit.setBounds(150,390,100,25);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        panel.add(submit);

        setLayout(new BorderLayout());
        add(panel,"Center");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/details.png"));
        Image i2 = i1.getImage().getScaledInstance(270,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imgLabel = new JLabel(i3);
        add(imgLabel,"East");



        setSize(700,500);
        setLocation(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MeterInfo();
    }
}
