
package atm2;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;             
import java.awt.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
public class signupone extends JFrame implements ActionListener{
      JLabel formno,personaldetails,name,fathername,dateofbirth,gender,email,status,address,city,pincode,state;
      JTextField namet,fathernamet,emailt,addresst,cityt,pincodet,statet;
      JButton next;
      long random;
      JDateChooser c;
      JRadioButton male,female,married,unmarried;
    
    signupone(){
        setLayout(null);
        Random ran=new Random();
        
        random=Math.abs((ran.nextLong()%9000L)+1000L);

        formno=new JLabel("APPLICATION FORM NO . "+random);
        formno.setFont(new Font("Arial",Font.BOLD,30));
        formno.setBounds(500,80,600,50);
        add(formno);
        
        personaldetails=new JLabel("Page 1 : Personal Details ");
        personaldetails.setFont(new Font("Arial",Font.BOLD,20));
        personaldetails.setBounds(600,140,600,30);
        add(personaldetails);

        name=new JLabel("Name: ");
        name.setFont(new Font("Arial",Font.BOLD,20));
        name.setBounds(300,200,600,30);
        add(name);

        namet=new JTextField();
        namet.setBounds(500,200,500,30);
        add(namet);

        fathername=new JLabel("Father's Name:");
        fathername.setFont(new Font("Arial",Font.BOLD,20));
        fathername.setBounds(300,250,600,30);
        add(fathername);

        fathernamet=new JTextField();
        fathernamet.setBounds(500,250,500,30);
        add(fathernamet);

      



        gender=new JLabel("Gender: ");
        gender.setFont(new Font("Arial",Font.BOLD,20));
        gender.setBounds(300,300,600,30);
        add( gender);

        male=new JRadioButton("Male");
        male.setBounds(600,300,100,30);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(800,300,100,30);
        add(female);
        
        ButtonGroup gendergroup =new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        status=new JLabel("Marital Status: ");
        status.setFont(new Font("Arial",Font.BOLD,20));
        status.setBounds(300,350,600,30);
        add( status);
        
        married=new JRadioButton("Married");
        married.setBounds(600,350,100,30);
        add(married);
        
        unmarried=new JRadioButton("unmarried");
        unmarried.setBounds(800,350,100,30);
        add(unmarried);
        
        ButtonGroup gendergroupt =new ButtonGroup();
        gendergroupt.add(married);
        gendergroupt.add(unmarried);

        address=new JLabel("Address: ");
        address.setFont(new Font("Arial",Font.BOLD,20));
        address.setBounds(300,400,600,30);
        add( address);

        addresst=new JTextField();
        addresst.setBounds(500,400,500,30);
        add(addresst);

        city=new JLabel("City: ");
        city.setFont(new Font("Arial",Font.BOLD,20));
        city.setBounds(300,450,600,30);
        add( city);

        cityt=new JTextField();
        cityt.setBounds(500,450,500,30);
        add(cityt);

       

        state=new JLabel("State: ");
        state.setFont(new Font("Arial",Font.BOLD,20));
        state.setBounds(300,500,600,30);
        add( state);

        statet=new JTextField();
        statet.setBounds(500,500,500,30);
        add(statet);
       
        next=new JButton("NEXT");
        next.setBounds(900, 550,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener(this);
        
        add(next);
       
      

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
         String formno=""+ random;
        String name=namet.getText();
        String fathername=fathernamet.getText();
        
        String address=addresst.getText();
        String city=cityt.getText();
        String state=statet.getText();
        String gender =null;
        if(male.isSelected()){
            gender="Male";
        } 
        else if(female.isSelected()){
            gender="Female";
        }
        String status=null;
        if(married.isSelected()){
            status="Married";
        }
        else if(unmarried.isSelected()){
            status="unmarried";
        }
        
        try {
            if(name.equals(" ")){
                JOptionPane.showMessageDialog(null, "Name is Requried" );
        
            }
            else{
                Conn c = new Conn();
                String q1="insert into signupone values('"+formno+"','"+name+"','"+fathername+"','"+gender+"','"+status+"','"+address+"','"+city+"','"+state+"')";
                c.s.executeUpdate(q1);
                setVisible(false);
                new signuptwo(formno).setVisible(true);
                
               
            }
        }
        catch(Exception ae){
            System.out.println(ae);
        }
        
        
    }
    
     public static void main(String args[]) {
     new signupone();
        
        
    }

   

   
	
}
