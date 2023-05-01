package BillingProject;

import javax.swing.*;
import java.awt.*;

class Menu extends JFrame {
  JLabel Pizza, Hamburger, Hotdog, MilkShake, Nuggets, Fries, Coke;
  ImageIcon pIcon, HamIcon, hIcon, mIcon, nImageIcon, fIcon, cIcon;
  ButtonGroup group;

  Menu() {
    pIcon = new ImageIcon("BillingProject/src/pizzaicons.png");
    HamIcon = new ImageIcon("BillingProject/src/BurgerImage.png");
    hIcon = new ImageIcon("BillingProject/src/Hotdog.png");
    mIcon = new ImageIcon("BillingProject/src/milkshake.png");
    nImageIcon = new ImageIcon("BillingProject/src/nuggets.png");
    fIcon = new ImageIcon("BillingProject/src/fries.png");
    cIcon = new ImageIcon("BillingProject/src/Coke.png");

    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    this.setLayout(new GridLayout(4, 2, 5, 5));
    Pizza = new JLabel("Pizza Rs199");
    Pizza.setFont(new Font("MV Colli", Font.BOLD, 25));
    Pizza.setForeground(Color.WHITE);
    Hamburger = new JLabel("Burger Rs99");
    Hamburger.setFont(new Font("MV Colli", Font.BOLD, 25));
    Hamburger.setForeground(Color.WHITE);
    Hotdog = new JLabel("Hotdog Rs149");
    Hotdog.setFont(new Font("MV Colli", Font.BOLD, 25));
    Hotdog.setForeground(Color.WHITE);
    MilkShake = new JLabel("MilkShake Rs99");
    MilkShake.setFont(new Font("MV Colli", Font.BOLD, 25));
    MilkShake.setForeground(Color.WHITE);
    Nuggets = new JLabel("Nuggets Rs120");
    Nuggets.setFont(new Font("MV Colli", Font.BOLD, 25));
    Nuggets.setForeground(Color.WHITE);
    Fries = new JLabel("Fries Rs79");
    Fries.setFont(new Font("MV Colli", Font.BOLD, 25));
    Fries.setForeground(Color.WHITE);
    Coke = new JLabel("Coke Rs20");
    Coke.setFont(new Font("MV Colli", Font.BOLD, 25));
    Coke.setForeground(Color.WHITE);
    Pizza.setIcon(pIcon);
    Hamburger.setIcon(HamIcon);
    Hotdog.setIcon(hIcon);
    MilkShake.setIcon(mIcon);
    Nuggets.setIcon(nImageIcon);
    Fries.setIcon(fIcon);
    Coke.setIcon(cIcon);

    this.add(Pizza);
    this.add(Hamburger);
    this.add(Hotdog);
    this.add(MilkShake);
    this.add(Nuggets);
    this.add(Fries);
    this.add(Coke);
    this.setSize(750, 750);
    this.setResizable(false);
    this.setVisible(true);
    this.getContentPane().setBackground(new Color(81, 46, 0));
    ;
  }

}
