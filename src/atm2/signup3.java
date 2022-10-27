
package atm2;



import java.awt.event.ActionEvent;







import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;





import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;             

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class signup3 extends JFrame implements ActionListener{
     JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;

    signup3(String formno){
        this.formno=formno;
            JLabel l1=new JLabel("PAGE NO 3: ACCOUNT DETAILS ");
        l1.setFont(new Font("Arial",Font.BOLD,30));
        l1.setBounds(500,80,600,50);
        add(l1);
        
        JLabel l2=new JLabel("Account Type ");
        l2.setFont(new Font("Arial",Font.BOLD,30));
        l2.setBounds(400,150,400,30);
        add(l2);
        
        r1=new JRadioButton("Saving Account");
        r1.setBounds(400,200,200,10);
        r1.setBackground(Color.white);
        add(r1);
        
        r2=new JRadioButton("Current Account");
        r2.setBounds(700,200,200,30);
        r2.setBackground(Color.white);
        add(r2);
        
        r3=new JRadioButton("Fixed Deposit Account");
        r3.setBounds(400,250,200,30);
        r3.setBackground(Color.white);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setBounds(700,250,200,30);
        r4.setBackground(Color.white);
        add(r4);
        
        ButtonGroup groupaccount =new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
       
       JLabel card=new JLabel("Card Number ");
        card.setFont(new Font("Arial",Font.BOLD,30));
        card.setBounds(400,300,400,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4123 ");
        number.setFont(new Font("Arial",Font.BOLD,30));
        number.setBounds(700,300,400,30);
        add( number);
        
        JLabel cardn=new JLabel("Your Card No ");
        cardn.setFont(new Font("Arial",Font.PLAIN,20));
        cardn.setBounds(400,350,400,30);
        add( cardn);
        
         JLabel pin=new JLabel("PIN Number ");
        pin.setFont(new Font("Arial",Font.BOLD,30));
        pin.setBounds(400,400,400,30);
        add(pin);
        
        JLabel pinnumber=new JLabel("XXXX ");
        pinnumber.setFont(new Font("Arial",Font.BOLD,30));
        pinnumber.setBounds(700,400,400,30);
        add( pinnumber);
        
        JLabel pinn=new JLabel("Your pin No ");
        pinn.setFont(new Font("Arial",Font.BOLD,20));
        pinn.setBounds(400,450,400,20);
        add( pinn);
        
        
        JLabel services=new JLabel("SERVICES REQURIED");
        services.setFont(new Font("Arial",Font.BOLD,30));
        services.setBounds(400,500,400,30);
        add(services);
        
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setBounds(400,550,200,20);
        add(c1);
        
        c2=new JCheckBox("Mobile Banking");
        c2.setBackground(Color.white);
        c2.setBounds(600,550,200,20);
        add(c2);
        
        c3=new JCheckBox("Email/SMS Alert");
        c3.setBackground(Color.white);
        c3.setBounds(400,600,200,20);
        add(c3);
        
        c4=new JCheckBox("Cheque Book");
        c4.setBackground(Color.white);
        c4.setBounds(600,600,200,20);
        add(c4);
        
        c5=new JCheckBox("E statement");
        c5.setBackground(Color.white);
        c5.setBounds(400,650,200,20);
        add(c5);
        
        c6=new JCheckBox("Internet Banking");
        c6.setBackground(Color.white);
        c6.setBounds(600,650,200,20);
        add(c6);
        
        c7=new JCheckBox("I hereby delcared that above details are correct.");
        c7.setBackground(Color.white);
        c7.setBounds(400,700,500,20);
        add(c7);
        
        
        submit=new JButton("Submit");
        submit.setBounds(400, 750,100,30);
       submit.setBackground(Color.BLACK);
       submit.setForeground(Color.white);
       submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(600, 750,100,30);
       cancel.setBackground(Color.BLACK);
       cancel.setForeground(Color.white);
       cancel.addActionListener(this);
        add(cancel);
        

    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
          if(e.getSource()==submit){
            String l2=null;
            if(r1.isSelected()){
                l2 ="Saving Account";
            }
            else if(r2.isSelected()){
            l2="Current Account";  
        }else if(r3.isSelected()){
            l2="Fixed Deposit Account";
        }
        else if(r4.isSelected()){
            l2="Recurring Deposit Account";
            
        }
            Random random=new Random();
            String cardnumber=""+ Math.abs((random.nextLong()%90000000L) +8040937000000000L);
            String pinnumber =""+Math.abs((random.nextLong()%9000L)+1000L);
            
            String facility="";
            if(c1.isSelected()){
                facility =facility + "ATM CARD";
            }
            else if(c3.isSelected()){
                facility =facility + "Email/SMS Alert";
            }else if(c2.isSelected()){
                facility =facility + "Mobile Banking";
            }
            else if(c4.isSelected()){
                facility =facility + "Cheque Book";
            }
            else if(c5.isSelected()){
                facility =facility + "E statement";
            }
             else if(c6.isSelected()){
                facility =facility + "Internet Banking";
            }
            try{
               if(l2.equals("")) {
                   JOptionPane.showMessageDialog(null,"Account type needed");
               }else{
                   Conn conn=new Conn();
                   String q2 = "insert into signupthree values('"+formno+"','"+l2+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String q3 = "insert into loginthree values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                   conn.s.executeUpdate(q2);
                   conn.s.executeUpdate(q3);
                   JOptionPane.showMessageDialog(null, "card Number : "+cardnumber+"\n Pin Number:"+pinnumber);
                   
                   
                   setVisible(false);
                   new deposit(pinnumber).setVisible(true);
                  
                         
                   
               }
            }catch(Exception ae){
                System.out.println(ae);
            }
        }
        else if(e.getSource()==cancel){
            new Login().setVisible(true);
        }
        
        
        
    }
    
     public static void main(String args[]) {
     new signup3("");
        
        
    }

	

}
