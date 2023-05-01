package BillingProject;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class WelcomePage extends JFrame implements ActionListener {
    JFrame frame;
    JPanel p, p1, p2;
    JLabel mlabel, mlabel2, m1, m2;
    JButton oButton, mButton;

    WelcomePage() {
        ImageIcon icon = new ImageIcon("BillingProject/src/CollegeCafe-logos.png");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(2, 2, 5, 5));
        this.setSize(600, 500);
        this.getContentPane().setBackground(new Color(21, 32, 88));
        p = new JPanel(new GridLayout());
        p.setOpaque(true);
        p1 = new JPanel();
        p2 = new JPanel();
        p.setBackground(new Color(21, 32, 88));

        mlabel = new JLabel("Welcome!");
        mlabel.setIcon(icon);
        m1 = new JLabel("Explore Menu");
        m2 = new JLabel("Order your food");
        m1.setBackground(Color.BLACK);
        m2.setBackground(Color.BLACK);
        mlabel.setSize(50, 200);
        mlabel.setFont(new Font("MV Bolli", Font.BOLD, 25));
        p1.setBackground(Color.BLACK);
        m1.setForeground(Color.white);
        mlabel.setForeground(Color.WHITE);
        mlabel.setHorizontalTextPosition(JButton.CENTER);
        mlabel.setVerticalTextPosition(JButton.TOP);
        oButton = new JButton("Order food");
        mButton = new JButton("Menu!");
        oButton.addActionListener(this);
        mButton.addActionListener(this);
        oButton.setPreferredSize(new Dimension(150, 30));
        oButton.setLocation(150, 200);
        oButton.setHorizontalAlignment(JButton.CENTER);
        oButton.setVerticalAlignment(JButton.TOP);
        mButton.setPreferredSize(new Dimension(150, 30));

        oButton.setFocusable(false);
        mButton.setFocusable(false);

        p.add(mlabel);
        p1.add(m1);
        p2.add(m2);
        p1.add(mButton);
        p2.add(oButton);
        this.setResizable(false);
        this.add(p1);
        this.add(p2);
        this.add(p);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        if (b == mButton) {
            Menu menu = new Menu();
        }
        if (b == oButton) {
         SelectPage selectPage = new SelectPage();
        }
    }
}

class Welcomepage {
    public static void main(String[] args) {
        int p=5;
        WelcomePage welcomePage = new WelcomePage();
    }
}

