
package atm2;




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;


public class fastcash extends JFrame implements ActionListener{
    
        JButton deposit,withdraw,fastcash,mini,pinc,balancee,exit;
        String pinnumber;
        fastcash(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        JLabel l1=new JLabel("PLEASE SELECT YOUR TRANSACTION ");
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setBounds(500,80,600,50);
        add(l1);
        
        deposit=new JButton("Rs 100");
        deposit.setBounds(400,200,300,40);
        deposit.setFont(new Font("Arial",Font.BOLD,30));
        deposit.setBackground(Color.BLACK);
       deposit.setForeground(Color.white);
       deposit.addActionListener(this);
       
        add(deposit);
        
        withdraw=new JButton("Rs 500");
        withdraw.setBounds(800,200,300,40);
        withdraw.setFont(new Font("Arial",Font.BOLD,30));
        withdraw.setBackground(Color.BLACK);
       withdraw.setForeground(Color.white);
       withdraw.addActionListener(this);
       
        add(withdraw);
        
        
        fastcash=new JButton("Rs 1000");
        fastcash.setBounds(400,300,300,40);
        fastcash.setFont(new Font("Arial",Font.BOLD,30));
        fastcash.setBackground(Color.BLACK);
       fastcash.setForeground(Color.white);
       fastcash.addActionListener(this);
       
        add(fastcash);
        
        mini=new JButton("Rs 2000");
        mini.setBounds(800,300,300,40);
        mini.setFont(new Font("Arial",Font.BOLD,30));
        mini.setBackground(Color.BLACK);
       mini.setForeground(Color.white);
       mini.addActionListener(this);
        add(mini);
        
        pinc=new JButton("Rs 5000");
        pinc.setBounds(400,400,300,40);
        pinc.setFont(new Font("Arial",Font.BOLD,30));
        pinc.setBackground(Color.BLACK);
       pinc.setForeground(Color.white);
       pinc.addActionListener(this);
        add(pinc);
        
       balancee=new JButton("Rs 10000");
        balancee.setBounds(800,400,300,40);
        balancee.setFont(new Font("Arial",Font.BOLD,30));
        balancee.setBackground(Color.BLACK);
       balancee.setForeground(Color.white);
       balancee.addActionListener(this);
        add(balancee);
        
        exit=new JButton("Back");
        exit.setBounds(800,500,300,40);
        exit.setFont(new Font("Arial",Font.BOLD,30));
        exit.setBackground(Color.BLACK);
       exit.setForeground(Color.white);
       exit.addActionListener(this);
       
        add(exit);
        
        
        
        
     setLayout(null);
       setSize(300,300);
       setVisible(true);
       getContentPane().setBackground(Color.WHITE);
       setLocation(300,300);
       ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("Image/front.png"));
       Image b=a.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
       ImageIcon d = new ImageIcon(b);
       JLabel lab=new JLabel(d);
       lab.setBounds(700,20,100,50);
       add(lab);
  
    }
   
////JLabel adda,religion1,category1,income1,qua1,occ1,addhar1,pancard1,sz1,ea1;
    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource()==exit){
         setVisible(false);
         new transaction(pinnumber).setVisible(true);
     }else {
         String amount =((JButton)e.getSource()).getText().substring(3);
         Conn c=new Conn();
         try{
             ResultSet rs = c.s.executeQuery("select * from bank2 where pin='"+pinnumber+"'");
             int balance =0;
             while(rs.next()){
                 if(rs.getString("type1").equals("Deposit"))
                 {
                     balance +=Integer.parseInt(rs.getString("amount"));
                 }
                 else{
                     balance -=Integer.parseInt(rs.getString("amount"));
                 }
             }
             if(e.getSource()!=exit && balance<Integer.parseInt(amount)){
                 JOptionPane.showMessageDialog(null, "Insufficient Balance");
                 return;
             }
             else{
             String query="insert into bank2 values('"+pinnumber+"','Withdrawl','"+amount+"')";
             c.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+amount+"Debited Sucessfully");
             setVisible(false);
             new transaction(pinnumber).setVisible(true);
             }
         }
         catch(Exception n){
             System.out.println(n);
         }
     }
     
    }
    
    public static void main(String args[]) {
        new fastcash("");
        
    }
	

}