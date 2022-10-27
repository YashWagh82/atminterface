
package atm2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
public class balanceenquiry extends JFrame implements ActionListener{
    String pinnumber;
    JButton exit;
    balanceenquiry(String pinnumber){
        this.pinnumber=pinnumber;
        
         Conn c=new Conn();
         int balance =0;
        try{
             ResultSet rs = c.s.executeQuery("select * from bank2 where pin='"+pinnumber+"'");
             
             while(rs.next()){
                 if(rs.getString("type1").equals("Deposit"))
                 {
                     balance +=Integer.parseInt(rs.getString("amount"));
                 }
                 else{
                     balance -=Integer.parseInt(rs.getString("amount"));
                 }
             }
 
    }catch(Exception l){
        System.out.println(l);
    }
        
        JLabel text=new JLabel("Your Current Account balance is Rs  : "+ balance);
        text.setBounds(300,300,800,50);
         text.setFont(new Font("Arial",Font.BOLD,30));
         add(text);
        
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
        @Override
    public void actionPerformed(ActionEvent e) {
            setVisible(false);
     new transaction(pinnumber).setVisible(true);
     
    }
       
    public static void main(String args[]){
        new balanceenquiry("");
    }
}
