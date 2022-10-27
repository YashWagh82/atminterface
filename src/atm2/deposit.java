
package atm2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
public class deposit extends JFrame implements ActionListener {
       JTextField textf;
     JButton deposit,back;
     String pinnumber;
     JLabel text;
    deposit(String pinnumber){
        
        this.pinnumber=pinnumber;
         text=new JLabel("Enter the amount you want to deposit");
        text.setFont(new Font("Arial",Font.BOLD,30));
        text.setBounds(500,200,600,50);
        add( text);
        
        
        textf=new JTextField();
        textf.setBounds(500,300,550,30);
        textf.setFont(new Font("Arial",Font.BOLD,10));
        add(textf);
        
        deposit=new JButton("Deposit");
       deposit.setBounds(950, 500,100,30);
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.white);
        deposit.addActionListener(this);
        
       add(deposit);
       
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
     if (e.getSource()== deposit ){
         String number =textf.getText();
         if(number.equals("")){
             JOptionPane.showMessageDialog(null, "Please enter amount");
         }else{
             try{
             Conn conn =new Conn();
             String query ="insert into bank2 values('"+pinnumber+"','Deposit','"+number+"')";
             conn.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "Rs"+number+"Deposited Successfully");
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
     new deposit("");
        
        
    }

}
