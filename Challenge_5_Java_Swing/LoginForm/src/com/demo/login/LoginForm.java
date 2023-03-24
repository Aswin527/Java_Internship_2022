package com.demo.login;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class LoginForm {

  private JFrame frame;
  private JTextField txtUsername;
  private JPasswordField txtPassword;

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          LoginForm window = new LoginForm();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public LoginForm() {
    initialize();
  }

  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JLabel lblUsername = new JLabel("Username");
    lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
    lblUsername.setBounds(76, 86, 77, 14);
    frame.getContentPane().add(lblUsername);

    JLabel lblPassword = new JLabel("Password");
    lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
    lblPassword.setBounds(76, 140, 77, 14);
    frame.getContentPane().add(lblPassword);

    txtUsername = new JTextField();
    txtUsername.setBounds(163, 83, 153, 20);
    frame.getContentPane().add(txtUsername);
    txtUsername.setColumns(10);

    txtPassword = new JPasswordField();
    txtPassword.setBounds(163, 137, 153, 20);
    frame.getContentPane().add(txtPassword);

    JButton btnLogin = new JButton("Login");
    btnLogin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String username = txtUsername.getText();
        char[] password = txtPassword.getPassword();

        // Code to verify the username and password goes here

        // Clear the text fields
        txtUsername.setText("");
        txtPassword.setText("");
      }
    });
    btnLogin.setBounds(163, 191, 89, 23);
    frame.getContentPane().add(btnLogin);
  }
}
