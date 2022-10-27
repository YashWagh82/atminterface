package atm2;



import javax.swing.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    JButton login,clear,signup;
    JTextField cardnof;
    JPasswordField pinf;
  
   
    Login(){
        setLayout(null);
        setSize(300,300);
        setVisible(true);
        setLocation(500,300);
        ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("Image/front.png"));
        Image b=a.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon c=new ImageIcon(b);
        JLabel label= new JLabel(c);
        label.setBounds(700,50,200,100);
        Component add = add(label);

        JLabel text=new JLabel("A T M");
        text.setBounds(755,50,300,300);
        text.setFont(new Font("Buffalo.",Font.BOLD,30));
        add(text);

        JLabel cardno=new JLabel("ENTER YOUR CARD NUMBER");
        cardno.setBounds(650,200,300,300);
        cardno.setFont(new Font("Serif",Font.BOLD,20));
        add(cardno);

        cardnof=new JTextField();
        cardnof.setBounds(640,380,310,25);
        cardnof.setFont(new Font("Arial",Font.BOLD,10));
        add(cardnof);

        JLabel pin=new JLabel("ENTER YOUR PIN");
        pin.setBounds(700,300,300,300);
        pin.setFont(new Font("Serif",Font.BOLD,20));
        add(pin);

        pinf=new JPasswordField();
        pinf.setBounds(640,480,310,25);
        pinf.setFont(new Font("Arial",Font.BOLD,10));
        add(pinf);

        login=new JButton("SIGN IN");
        login.setBounds(640,530,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);

        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(850,530,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);


        add(clear);

        signup=new JButton("SIGN UP");
        signup.setBounds(640,600,310,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);


        add(signup);


        getContentPane().setBackground(Color.WHITE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==clear){
        cardnof.setText("");
        pinf.setText("");

        }
        else if(e.getSource()==login){
           Conn conn= new Conn();
           String cardnumber=cardnof.getText();
           String pinnumber=pinf.getText();
           String query ="Select * from loginthree where cardnumber= '"+cardnumber+"' and pinnumber ='"+pinnumber+"' ";
           try{
               ResultSet rs = conn.s.executeQuery(query);
               if (rs.next()){
                   setVisible(false);
                   new transaction(pinnumber).setVisible(true);
               }
               else{
                   JOptionPane.showMessageDialog(null, "Incorrect Card Number or pin");
               }
           } catch(HeadlessException | SQLException b){
               System.out.println(b);
           }
        }
        else if(e.getSource() == signup)
        {
            setVisible(false);
            new signupone().setVisible(true);

        }
        
    }
    public static void main(String args[]) {
        new Login();
        
    }
  
 
    
    
}


