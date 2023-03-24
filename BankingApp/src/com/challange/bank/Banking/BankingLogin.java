package com.challange.bank.Banking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class BankingLogin {
	
	public BankingLogin() {
		JFrame f=new JFrame("Login Page");
		JLabel un=new JLabel("Username");
		un.setBounds(50, 30, 100, 50);
		
		JTextField unt=new JTextField();
		unt.setBounds(150, 40, 120, 30);
		
		JLabel pwd=new JLabel("Password");
		pwd.setBounds(50, 70, 100, 50);
		
		JPasswordField pf=new JPasswordField();
		pf.setBounds(150, 80, 120, 30);
		
		JButton login=new JButton("Login");
		login.setBounds(50,120,80,30);
		
		JButton reg=new JButton("Register");
		reg.setBounds(170,120,90,30);
		
		login.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username=unt.getText();
				String password=new String(pf.getPassword());
				System.out.println(username+"-"+password);
				System.out.println(username=="admin");
				System.out.println(password=="admin");
				if(username.equals("admin")&&password.equals("admin")) {
					System.out.println("Login");
					f.dispose();
					new HomePage();
				}
			}
		});
		
		f.add(un);
		f.add(unt);
		f.add(pwd);
		f.add(pf);
		f.add(login);
		f.add(reg);
		f.setSize(360, 200);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new BankingLogin();
	}
	
}
