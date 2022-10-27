
package atm2;




import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;

import atm2.Conn;
import atm2.transaction;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class withdrawl extends JFrame implements ActionListener {
       JTextField textf;
     JButton withdrawl,back;
     String pinnumber;
     JLabel text;
    withdrawl(String pinnumber){
        
        this.pinnumber=pinnumber;
         text=new JLabel("Enter the amount you want to deposit");
        text.setFont(new Font("Arial",Font.BOLD,30));
        text.setBounds(500,200,600,50);
        add( text);
        
        
        textf=new JTextField();
        textf.setBounds(500,300,550,30);
        textf.setFont(new Font("Arial",Font.BOLD,10));
        add(textf);
        
        withdrawl=new JButton("withdrawl");
      withdrawl.setBounds(950, 500,100,30);
        withdrawl.setBackground(Color.BLACK);
        withdrawl.setForeground(Color.white);
        withdrawl.addActionListener(this);
        
       add(withdrawl);
       
       back=new JButton("Back");
       back.setBounds(500, 500,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.white);
        back.addActionListener(this);
       add(back);


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
      @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource()== withdrawl ){
         String number =textf.getText();
         if(number.equals("")){
             JOptionPane.showMessageDialog(null, "Please enter amount you want to withdrawl ");
         }else{
             try{
             Conn conn =new Conn();
             String query ="insert into bank2 values('"+pinnumber+"','Withdrawl','"+number+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+number+"withdraw Successfully");
                setVisible(false);
             new transaction(pinnumber).setVisible(true);
             }
             catch(Exception b){
                 System.out.println(b);
             }
         }
     }else if(e.getSource() == back){
         setVisible(false);
         new transaction(pinnumber).setVisible(true);
     }
    }
    public static void main(String args[]) {
     new withdrawl("");
        
        
    }

}
