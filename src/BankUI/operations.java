package BankUI;

import javax.swing.*;
import java.awt.*;



public class operations extends JFrame {


    public operations() {
        setTitle("Bank ATM");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        JButton depositButton = new JButton("Deposit");

        JButton withdrawalButton = new JButton("Withdrawal");


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(depositButton);
        panel.add(withdrawalButton);


        add(panel);
    }
}



