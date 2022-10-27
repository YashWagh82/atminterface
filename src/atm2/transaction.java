
package atm2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;



public class transaction extends JFrame implements ActionListener{
    
        JButton deposit,withdraw,fastcash,mini,pinc,balancee,exit;
        String pinnumber;
        transaction(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        JLabel l1=new JLabel("PLEASE SELECT YOUR TRANSACTION ");
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setBounds(500,80,600,50);
        add(l1);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(400,200,300,40);
        deposit.setFont(new Font("Arial",Font.BOLD,30));
        deposit.setBackground(Color.BLACK);
       deposit.setForeground(Color.white);
       deposit.addActionListener(this);
       
        add(deposit);
        
        withdraw=new JButton("Cash Withdrawl");
        withdraw.setBounds(800,200,300,40);
        withdraw.setFont(new Font("Arial",Font.BOLD,30));
        withdraw.setBackground(Color.BLACK);
       withdraw.setForeground(Color.white);
       withdraw.addActionListener(this);
       
        add(withdraw);
        
        
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(400,300,300,40);
        fastcash.setFont(new Font("Arial",Font.BOLD,30));
        fastcash.setBackground(Color.BLACK);
       fastcash.setForeground(Color.white);
       fastcash.addActionListener(this);
       
        add(fastcash);
        
        mini=new JButton("Mini Statement");
        mini.setBounds(800,300,300,40);
        mini.setFont(new Font("Arial",Font.BOLD,30));
        mini.setBackground(Color.BLACK);
       mini.setForeground(Color.white);
       mini.addActionListener(this);
        add(mini);
        
        pinc=new JButton("PIN Change");
        pinc.setBounds(400,400,300,40);
        pinc.setFont(new Font("Arial",Font.BOLD,30));
        pinc.setBackground(Color.BLACK);
       pinc.setForeground(Color.white);
       pinc.addActionListener(this);
        add(pinc);
        
       balancee=new JButton("Balance Enquiry");
        balancee.setBounds(800,400,300,40);
        balancee.setFont(new Font("Arial",Font.BOLD,30));
        balancee.setBackground(Color.BLACK);
       balancee.setForeground(Color.white);
       balancee.addActionListener(this);
        add(balancee);
        
        exit=new JButton("Exit");
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
         System.exit(0);
     }else if(e.getSource()==deposit){
         setVisible(false);
         new deposit(pinnumber).setVisible(true);
     }
     else if(e.getSource()== withdraw){
         setVisible(false);
         new withdrawl(pinnumber).setVisible(true);
     }else if(e.getSource() == fastcash){
         setVisible(false);
         new fastcash(pinnumber).setVisible(true);
     }
     else if(e.getSource() == pinc){
         setVisible(false);
         new pinchange(pinnumber).setVisible(true);
     }
      else if(e.getSource() == balancee){
         setVisible(false);
         new balanceenquiry(pinnumber).setVisible(true);
     }
      else if(e.getSource() == mini){
         setVisible(false);
         new ministatement(pinnumber).setVisible(true);
     }
    }
    
    public static void main(String args[]) {
        new transaction("");
        
    }
	

}