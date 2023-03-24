package com.challange.bank.Banking;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class HomePage {
	public HomePage() {
		JFrame f=new JFrame("Homepage");
		JMenuBar mb=new JMenuBar();
		JMenu m1=new JMenu("FIle");
		JMenuItem mi1=new JMenuItem("Open New Account");
		JMenuItem mi2=new JMenuItem("Print Customer Balance");
		JMenuItem mi3=new JMenuItem("Quit Bank System");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		JMenu m2=new JMenu("Edit");
		mi1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CreateAccount();
			}
		});
		
		mi2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ViewCustomerBalance();
				
			}
		});
		
		f.setJMenuBar(mb);
		mb.add(m1);
		mb.add(m2);
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
