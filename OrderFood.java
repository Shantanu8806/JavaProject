package BillingProject;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

class OrderFood extends JFrame implements ActionListener {
    int finalprice;
    JComboBox  pm;
    JPanel pmp, prp, billPanel;

    JLabel  pmtmethod, price, billLabel;
    JButton gbill, ext;
    // LinkedList<Order> od;

    OrderFood(int P) {
        // od = new LinkedList<Order>();
        this.finalprice=P;
        String paymeth[] = { "Cash", "Credit card", "Debit card", "Gift voucher", "UPI" };
        ext = new JButton("Exit");
        ext.setFocusable(false);
        ext.setFont(new Font("Arial Black", Font.PLAIN, 10));
        ext.addActionListener(this);
        ext.setPreferredSize(new Dimension(100, 35));
        ext.setFont(new Font("MV Bolli", Font.BOLD, 20));

        
        pm = new JComboBox(paymeth);
        pm.setFocusable(false);
     
        price = new JLabel("Get your Bill");
        billLabel = new JLabel();
        billLabel.setFont(new Font("MV Bolli", Font.BOLD, 25));
        price.setFont(new Font("MV Bolli", Font.BOLD, 20));
        pmtmethod = new JLabel("Payment Method!");
       
        pmtmethod.setFont(new Font("MV Bolli", Font.BOLD, 20));

        pmp = new JPanel();
        prp = new JPanel();
        billPanel = new JPanel();

        gbill = new JButton("Get Bill");
        gbill.setFocusable(false);
        gbill.setFont(new Font("Arial Black", Font.PLAIN, 20));
        gbill.addActionListener(this);
        gbill.setPreferredSize(new Dimension(150, 35));


      
        pmp.add(pmtmethod);
        pmp.add(pm);
        prp.add(price);
        prp.add(gbill);
        billPanel.add(billLabel);
        billPanel.add(ext);
        pmp.setBackground(new Color(239, 208, 56));
        prp.setBackground(new Color(239, 208, 56));
        billPanel.setBackground(new Color(239, 208, 56));
        this.add(pmp);
        this.add(prp);
        this.add(billPanel);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLayout(new GridLayout(3, 1, 0, 0));
        this.setResizable(false);
        this.setSize(500, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b=(JButton)e.getSource();
        if (b==gbill) {
            billLabel.setText("Total Bill:Rs"+finalprice);
        }
        if (b==ext) {
            System.exit(ABORT);
        }
    }
}
