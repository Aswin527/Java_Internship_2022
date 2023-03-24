package com.calc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements ActionListener, WindowListener {
	
	Frame f;
	TextArea ta;
	Button clr,div,mul,sub,plus,eq,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bpl,bdot,mod,ce;
	Label l;
	double num1,num2,operation;
	
	public Calculator() {
		f=new Frame("Calculator");
		l=new Label();
		l.setBounds(20, 30, 340, 80);
		l.setBackground(Color.GRAY);
		f.add(l);
		
		Font result_font=new Font("Serif", Font.BOLD, 20);
		l.setFont(result_font);
		l.setForeground(Color.WHITE);
		
		ce=new Button("CE");
		ce.setBounds(20, 130, 80, 50);
		f.add(ce);
		clr=new Button("Back");
		clr.setBounds(100, 130, 80, 50);
		f.add(clr);
		
		div=new Button("/");
		div.setBounds(260, 130, 100, 50);
		f.add(div);
		mul=new Button("*");
		mul.setBounds(260, 180, 100, 50);
		f.add(mul);
		sub=new Button("-");
		sub.setBounds(260, 230, 100, 50);
		f.add(sub);
		plus=new Button("+");
		plus.setBounds(260, 280, 100, 50);
		f.add(plus);
		eq=new Button("=");
		eq.setBounds(260, 330, 100, 50);
		f.add(eq);
		mod=new Button("%");
		mod.setBounds(180, 130, 80, 50);
		f.add(mod);
		
		//Row 1
		b7=new Button("7");
		b7.setBounds(20, 180, 80, 50);
		f.add(b7);
		b8=new Button("8");
		b8.setBounds(100, 180, 80, 50);
		f.add(b8);
		b9=new Button("9");
		b9.setBounds(180, 180, 80, 50);
		f.add(b9);
		
		//Row2
		b4=new Button("4");
		b4.setBounds(20, 230, 80, 50);
		f.add(b4);
		b5=new Button("5");
		b5.setBounds(100, 230, 80, 50);
		f.add(b5);
		b6=new Button("6");
		b6.setBounds(180, 230, 80, 50);
		f.add(b6);
		
		//Row3
		b1=new Button("1");
		b1.setBounds(20, 280, 80, 50);
		f.add(b1);
		b2=new Button("2");
		b2.setBounds(100, 280, 80, 50);
		f.add(b2);
		b3=new Button("3");
		b3.setBounds(180, 280, 80, 50);
		f.add(b3);
		
		//Row4
		bpl=new Button("+/-");
		bpl.setBounds(20, 330, 80, 50);
		f.add(bpl);
		b0=new Button("0");
		b0.setBounds(100, 330, 80, 50);
		f.add(b0);
		bdot=new Button(".");
		bdot.setBounds(180, 330, 80, 50);
		f.add(bdot);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		bpl.addActionListener(this);
		bdot.addActionListener(this);
		div.addActionListener(this);
		plus.addActionListener(this);
		sub.addActionListener(this);
		eq.addActionListener(this);
		mul.addActionListener(this);
		
		clr.addActionListener(this);
		ce.addActionListener(this);
		
		f.addWindowListener(this);
		
		f.setLayout(null);
		f.setSize(380, 420);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		e.getSource();
		String p_button,btn_temp;
		//System.out.println(e.getSource()==b0);
		
		if(e.getSource()==b0) {
			btn_temp=l.getText();
			p_button=btn_temp+"0";
			l.setText(p_button);
		}
		
		if(e.getSource()==b1) {
			btn_temp=l.getText();
			p_button=btn_temp+"1";
			l.setText(p_button);
		}
		
		if(e.getSource()==b2) {
			btn_temp=l.getText();
			p_button=btn_temp+"2";
			l.setText(p_button);
		}
		
		if(e.getSource()==b3) {
			btn_temp=l.getText();
			p_button=btn_temp+"3";
			l.setText(p_button);
		}
		
		if(e.getSource()==b4) {
			btn_temp=l.getText();
			p_button=btn_temp+"4";
			l.setText(p_button);
		}
		
		if(e.getSource()==b5) {
			btn_temp=l.getText();
			p_button=btn_temp+"5";
			l.setText(p_button);
		}
		
		if(e.getSource()==b6) {
			btn_temp=l.getText();
			p_button=btn_temp+"6";
			l.setText(p_button);
		}
		
		if(e.getSource()==b7) {
			btn_temp=l.getText();
			p_button=btn_temp+"7";
			l.setText(p_button);
		}
		
		if(e.getSource()==b8) {
			btn_temp=l.getText();
			p_button=btn_temp+"8";
			l.setText(p_button);
		}
		
		if(e.getSource()==b9) {
			btn_temp=l.getText();
			p_button=btn_temp+"9";
			l.setText(p_button);
		}
		
		//Back Button
		if(e.getSource()==clr) {
			btn_temp=l.getText();
			p_button=btn_temp.substring(0,btn_temp.length()-1);
			
			l.setText(p_button);
		}
		
		//CE Button
		if(e.getSource()==ce) {
			l.setText("");
		}
		
		//Getting Operations
		if(e.getSource()==plus) {
			num1=Double.parseDouble(l.getText());
			l.setText("");
			operation=1;
		}
		if(e.getSource()==mul) {
			num1=Double.parseDouble(l.getText());
			l.setText("");
			operation=2;
		}
		
		if(e.getSource()==sub) {
			num1=Double.parseDouble(l.getText());
			l.setText("");
			operation=3;
		}
		
		if(e.getSource()==mod) {
			num1=Double.parseDouble(l.getText());
			l.setText("");
			operation=4;
		}
		
		if(e.getSource()==div) {
			num1=Double.parseDouble(l.getText());
			l.setText("");
			operation=5;
		}
		
		//Calcutation
		if(e.getSource()==eq) {
			num2=Double.parseDouble(l.getText());
			
			if(operation==1) {
				l.setText(String.valueOf(num1+num2));
			}
			
			if(operation==2) {
				l.setText(String.valueOf(num1*num2));
			}
			
			if(operation==3) {
				l.setText(String.valueOf(num1-num2));
			}
			
			if(operation==4) {
				l.setText(String.valueOf(num1%num2));
			}
			
			if(operation==5) {
				l.setText(String.valueOf(num1/num2));
			}
		}
		
			
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
