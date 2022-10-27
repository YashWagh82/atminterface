
package atm2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.sql.*;
public class ministatement extends JFrame {
    String pinnumber;
    ministatement(String pinnumber){
        this.pinnumber=pinnumber;
           JLabel text=new JLabel("Mini Statement  ");
        text.setBounds(650,100,800,50);
         text.setFont(new Font("Arial",Font.BOLD,30));
         add(text);
          JLabel mini=new JLabel();
           mini.setFont(new Font("Arial",Font.BOLD,10));
          add(mini);
         JLabel bank = new JLabel("YW Bank");
         bank.setBounds(680,200,300,50);
         bank.setFont(new Font("Arial",Font.BOLD,30));
         add(bank);
         
         JLabel card=new JLabel();
         card.setBounds(600,300,900,20);

        card.setFont(new Font("Arial",Font.BOLD,20));
         add(card);
         
         
        

      
         
         try{
             Conn conn = new Conn();
             ResultSet rs = conn.s.executeQuery("select * from loginthree where pinnumber = '"+pinnumber+"'");
             while(rs.next()){
              card.setText("Card Number : "+ rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+rs.getString("cardnumber").substring(12));
             }
         }catch(Exception n){
             System.out.println(n);
         }
         try{
             Conn conn= new Conn();
             ResultSet rs=conn.s.executeQuery("select * from bank2 where pin = '"+pinnumber+"'");
             while(rs.next()){
              mini.setText (mini.getText()+ "<html>" + rs.getString("type1") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount") + "<br><br>" + "<html>");
             }
         }catch(Exception a){
             System.out.println(a);
         }
          mini.setBounds(600,350,900,400);
         
         
          setLayout(null);
       setSize(300,300);
       setVisible(true);
       getContentPane().setBackground(Color.WHITE);
       setLocation(30,30);
       ImageIcon a=new ImageIcon(ClassLoader.getSystemResource("Image/front.png"));
       Image b=a.getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT);
       ImageIcon d = new ImageIcon(b);
       JLabel lab=new JLabel(d);
       lab.setBounds(700,20,100,50);
       add(lab);
        
    }
    public static void main(String args[]){
        new ministatement("");
    }
}
