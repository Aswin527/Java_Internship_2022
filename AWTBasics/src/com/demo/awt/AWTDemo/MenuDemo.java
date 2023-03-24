package com.demo.awt.AWTDemo;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuDemo implements MouseListener,ActionListener{
	
	
	PopupMenu pm;
	Frame f;
	Dialog d;
	public MenuDemo() {
		
		f= new Frame("NotePad");
		MenuBar mb=new MenuBar();
		
		Menu m1=new Menu("File");
		
		d=new Dialog(f, "Confirmation",true);
		d.setLayout(new FlowLayout());
		Button b1=new Button("Ok");
		Button b2=new Button("Cancel");
		
		d.add(new Label("Are you sure, do you want to quit?"));
		
		d.add(b1);
		d.add(b2);
		d.setSize(400,400);
		
		MenuItem mi1=new MenuItem("New");
		MenuItem mi2=new MenuItem("Open");
		MenuItem mi3=new MenuItem("Save");
		MenuItem mi4=new MenuItem("Save As");
		MenuItem mi5=new MenuItem("Exit");
		
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		
		Menu m2=new Menu("Edit");
		
		MenuItem mi6=new MenuItem("Undo");
		MenuItem mi7=new MenuItem("Cut");
		MenuItem mi8=new MenuItem("Copy");
		MenuItem mi9=new MenuItem("Paste");
		MenuItem mi10=new MenuItem("Delete");
		MenuItem mi11=new MenuItem("Select All");
		
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		m2.add(mi9);
		m2.add(mi10);
		m2.add(mi11);
		
		Menu m3=new Menu("View");
		Menu subm1=new Menu("Zoom");
		
		MenuItem mi12=new MenuItem("Status Bar");
		MenuItem sm1=new MenuItem("Zoom In");
		MenuItem sm2=new MenuItem("Zoom Out");		
		
		subm1.add(sm1);
		subm1.add(sm2);
		m3.add(mi12);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		m3.add(subm1);
		
		pm=new PopupMenu();
		
		MenuItem pi1=new MenuItem("Undo");
		pi1.setActionCommand("Undo");
		MenuItem pi2=new MenuItem("Cut");
		MenuItem pi3=new MenuItem("Copy");
		MenuItem pi4=new MenuItem("Paste");
		MenuItem pi5=new MenuItem("Delete");
		MenuItem pi6=new MenuItem("Select All");
		
		pm.add(pi1);
		pm.add(pi2);
		pm.add(pi3);
		pm.add(pi4);
		pm.add(pi5);
		pm.add(pi6);
		
		f.addMouseListener(this);
		
		f.add(pm);
		f.setMenuBar(mb);
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MenuDemo();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pm.show(f, e.getX(), e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		d.setVisible(false);
	}
}
