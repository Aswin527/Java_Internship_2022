package com.challange.bank.Banking;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CreateAccount {
	public CreateAccount() {
		JFrame f=new JFrame("Create Account");
		
		JLabel ca=new JLabel("Create Account");
		ca.setBounds(280, 30, 700, 50);
		ca.setForeground(Color.red);
		ca.setFont(new Font("Arial", Font.BOLD, 16));
		
		JPanel canvas=new JPanel();
		canvas.setLayout(null);
		canvas.setBounds(0, 70, 700, 300);
		canvas.setBackground(Color.GRAY);
		
		
		
		JLabel acc_no=new JLabel("Account Number:",SwingConstants.CENTER);
		acc_no.setForeground(Color.red);
		acc_no.setFont(new Font("Arial", Font.BOLD, 13));
		acc_no.setBounds(20, 100, 150, 30);
		canvas.add(acc_no);
		
		JTextField acc_not=new JTextField(20);
		acc_not.setBounds(170, 100, 150, 30);
		canvas.add(acc_not);
		
		
		JLabel per_name=new JLabel("Person Name:");
		per_name.setForeground(Color.red);
		per_name.setFont(new Font("Arial", Font.BOLD, 13));
		per_name.setBounds(20, 140, 150, 30);
		canvas.add(per_name);
		
		JTextField per_namet=new JTextField(20);
		per_namet.setBounds(170, 140, 150, 30);
		canvas.add(per_namet);
		
		JLabel deposit_amt=new JLabel("Deposit Amount:");
		deposit_amt.setForeground(Color.red);
		deposit_amt.setFont(new Font("Arial", Font.BOLD, 13));
		deposit_amt.setBounds(20, 200, 150, 30);
		canvas.add(deposit_amt);
		
		JTextField deposit_amtt=new JTextField(20);
		deposit_amtt.setBounds(170, 200, 150, 30);
		canvas.add(deposit_amtt);
	
		
		JLabel dep_date=new JLabel("Deposit Date:");
		dep_date.setForeground(Color.red);
		dep_date.setFont(new Font("Arial", Font.BOLD, 13));
		dep_date.setBounds(20, 250, 150, 30);
		canvas.add(dep_date);
		
		
		
		
		
		f.add(ca);
		f.add(canvas);
		f.setSize(700, 700);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new CreateAccount();
	}
}
