package com.demo.register;

import java.awt.Frame;
import java.awt.*;

public class RegisterForm extends Frame{

    public RegisterForm(){
     
        Frame f=new Frame("Registration Form");
        Label firstname=new Label("First Name: ");
        firstname.setBounds(50, 100, 100, 30);
        TextField first_name=new TextField();
        first_name.setBounds(150, 100, 100, 30);
        f.add(first_name);
        
        Label lastname=new Label("Last Name: ");
        lastname.setBounds(50, 150, 100, 30);
        TextField last_name=new TextField();
        last_name.setBounds(150, 150, 100, 30);
        f.add(last_name);
        f.add(lastname);
        
        Label dob=new Label("Date of Birth: ");
        dob.setBounds(50, 200, 100, 30);
        f.add(dob);
        TextField dobf=new TextField();
        dobf.setBounds(150, 200, 100, 30);
        f.add(dobf);
        
        Label gen=new Label("Gender: ");
        gen.setBounds(50, 250, 100, 30);
        f.add(gen);
        
        CheckboxGroup c=new CheckboxGroup();
        Checkbox c1=new Checkbox("Male: ",false,c);
        c1.setBounds(150, 250, 50, 30);
        f.add(c1);
        
        Checkbox c2=new Checkbox("Female: ",false,c);
        c2.setBounds(200, 250, 80, 30);
        f.add(c2);
        
        
        Label loc=new Label("Place: ");
        loc.setBounds(50, 300, 50, 30);
        f.add(loc);
        TextField locf=new TextField();
        locf.setBounds(150, 300, 100, 30);
        f.add(locf);
        
        Label phno=new Label("Contact Number: ");
        phno.setBounds(50, 350, 100, 30);
        f.add(phno);
        TextField phnof=new TextField();
        phnof.setBounds(150, 350, 100, 30);
        f.add(phnof);
        
        Button bt=new Button("Submit");
        bt.setBounds(200, 400, 60, 30);
        f.add(bt);
        
        
        f.add(firstname);
        f.setLayout(null);
        f.setSize(500, 500);
        f.setVisible(true);
        
    }
    
    
    public static void main(String[] args) {
    	RegisterForm r=new RegisterForm();
    }
    
}
