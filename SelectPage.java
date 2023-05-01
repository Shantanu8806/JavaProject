package BillingProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class SelectPage extends JFrame implements ActionListener {
         JPanel Pz,Hb,Hd,Ms,Ng,Fr,Ck,Bp;
         JLabel Pzl,Hbl,Hdl,Msl,Ngl,Frl,Ckl,Bpl;
         JComboBox Pzb,Hbb,Hdb,Msb,Ngb,Frb,Ckb;
         JButton pButton;
         Integer quantity[]={0,1,2,3,4,5};
         ImageIcon blogo;
         int pizzaCost=199,burgerCost=99,hotDogcost=149,milkShakecost=99,Nuggetscost=120,Friescost=79,Cokecost=20;
         SelectPage()
         {
            blogo = new ImageIcon("BillingProject/src/CollegeCafe-logos_white.png");
           Pz = new JPanel();
           Pz.setBackground(new Color(203, 3, 3));
           Pz.setOpaque(true);
           Hb = new JPanel();
           Hb.setBackground(new Color(203, 3, 3));
           Hb.setOpaque(true);
           Hd = new JPanel();
           Hd.setBackground(new Color(203, 3, 3));
           Hd.setOpaque(true);
           Ms = new JPanel();
           Ms.setBackground(new Color(203, 3, 3));
           Ms.setOpaque(true);
           Ng = new JPanel();
           Ng.setBackground(new Color(203, 3, 3));
           Ng.setOpaque(true);
           Fr = new JPanel();
           Fr.setBackground(new Color(203, 3, 3));
           Fr.setOpaque(true);
           Ck = new JPanel();
           Ck.setBackground(new Color(203, 3, 3));
           Ck.setOpaque(true);
           Bp=new JPanel();
           Bp.setBackground(new Color(203, 3, 3));
           Bp.setOpaque(true);
           Pzl= new JLabel("Pizza");
           Pzl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Pzl.setForeground(new Color(255, 204, 0));
           Hbl= new JLabel("Hamburger");
           Hbl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Hbl.setForeground(new Color(255, 204, 0));
           Hdl= new JLabel("HotDog");
           Hdl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Hdl.setForeground(new Color(255, 204, 0));
           Msl= new JLabel("MilkShake");
           Msl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Msl.setForeground(new Color(255, 204, 0));
           Ngl= new JLabel("Nuggets");
           Ngl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Ngl.setForeground(new Color(255, 204, 0));
           Frl= new JLabel("Fries");
           Frl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Frl.setForeground(new Color(255, 204, 0));
           Ckl= new JLabel("Coke");
           Ckl.setFont(new Font("MV Bolli", Font.BOLD, 20));
           Ckl.setForeground(new Color(255, 204, 0));
           
           Bpl = new JLabel();
           Pzb = new JComboBox<>(quantity);
           Pzb.setFocusable(false);
           Pzb.setEditable(true);
           Hbb = new JComboBox<>(quantity);
           Hbb.setFocusable(false);
           Hbb.setEditable(true);
           Hdb = new JComboBox<>(quantity);
           Hdb.setFocusable(false);
           Hdb.setEditable(true);
           Msb = new JComboBox<>(quantity);
           Msb.setFocusable(false);
           Msb.setEditable(true);
           Ngb = new JComboBox<>(quantity);
           Ngb.setFocusable(false);
           Ngb.setEditable(true);
           Frb = new JComboBox<>(quantity);
           Frb.setFocusable(false);
           Frb.setEditable(true);
           Ckb = new JComboBox<>(quantity);
           Ckb.setFocusable(false);
           Ckb.setEditable(true);
           pButton = new JButton("Proceed to checkout");
           pButton.setFocusable(false);
           pButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
           pButton.addActionListener(this);
           pButton.setPreferredSize(new Dimension(250, 35));
           Pzb.addActionListener(this);
           Hbb.addActionListener(this);
           Hdb.addActionListener(this);
           Msb.addActionListener(this);
           Ngb.addActionListener(this);
           Frb.addActionListener(this);
           Ckb.addActionListener(this);

           Bpl.setIcon(blogo);
           Pz.add(Pzl);
           Pz.add(Pzb);
           Hb.add(Hbl);
           Hb.add(Hbb);
           Hd.add(Hdl);
           Hd.add(Hdb);
           Ms.add(Msl);
           Ms.add(Msb);
           Ng.add(Ngl);
           Ng.add(Ngb);
           Fr.add(Frl);
           Fr.add(Frb);
           Ck.add(Ckl);
           Ck.add(Ckb);
           Bp.add(pButton);
           Bp.add(Bpl);
           this.add(Pz);
           this.add(Hb);
           this.add(Hd);
           this.add(Ms);
           this.add(Ng);
           this.add(Fr);
           this.add(Ck);
           this.add(Bp);
           this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           this.setSize(750,750);
           this.setResizable(false);
           this.setLayout(new GridLayout(4,2,0,0));
           this.setVisible(true);
         }
         @Override
         public void actionPerformed(ActionEvent e)
         {
           if (e.getSource()==pButton) {
            int pizza=(Integer)Pzb.getSelectedItem()*pizzaCost;
            int Hamburger=(Integer)Hbb.getSelectedItem()*burgerCost;
            int HotDog=(Integer)Hdb.getSelectedItem()*hotDogcost;
            int MilkShake=(Integer)Msb.getSelectedItem()*milkShakecost;
            int Nuggets=(Integer)Ngb.getSelectedItem()*Nuggetscost;
            int Fries=(Integer)Frb.getSelectedItem()*Friescost;
            int Coke=(Integer)Ckb.getSelectedItem()*Cokecost;
            int totprice=pizza+Hamburger+HotDog+MilkShake+Nuggets+Fries+Coke;
            OrderFood order=new OrderFood(totprice);
           }
         }
}
