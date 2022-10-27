
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


public class signuptwo extends JFrame implements ActionListener{
      JLabel adda,religion1,category1,income1,qua1,occ1,addhar1,pancard1,sz1,ea1;
      JTextField addhar,pancard;
      JButton next;
      long random;
      JRadioButton male,female,married,unmarried,yese,noe,yesz,noz;
      JComboBox   religion,category,income,qualification,occupation;
     String formno;
    signuptwo(String formno){
        this.formno=formno;
        setLayout(null);
        

        adda=new JLabel("Page 2 : ADDITIONAL DETAILS" );
        adda.setFont(new Font("Arial",Font.BOLD,30));
        adda.setBounds(500,80,600,50);
        add(adda);
        
     
        religion1=new JLabel("Religion ");
        religion1.setFont(new Font("Arial",Font.BOLD,20));
        religion1.setBounds(300,200,600,30);
        add(religion1);
        
        String valrel[]={"HINDU","MUSLIM","CHRISTIAN","SIKH","OTHER"};
        religion= new JComboBox(valrel);
        religion.setBounds(500,200,500,30);
        religion.setBackground(Color.white);
        add(religion);

        category1=new JLabel("Category");
        category1.setFont(new Font("Arial",Font.BOLD,20));
        category1.setBounds(300,250,600,30);
        add(category1);
        
        String valcat[]={"GENERAL","OBC","SC","ST","OTHER"};
        category= new JComboBox(valcat);
        category.setBounds(500,250,500,30);
        category.setBackground(Color.white);
        add(category);

       


        income1=new JLabel("Income ");
        income1.setFont(new Font("Arial",Font.BOLD,20));
        income1.setBounds(300,300,600,30);
        add( income1);
        
        String valin[]={"NULL","<1,00,000","<5,00,000","<10,00,000",">10,00,000"};
        income= new JComboBox(valin);
        income.setBounds(500,300,500,30);
        income.setBackground(Color.white);
        add(income);

        
        
       

        qua1=new JLabel("Qualification ");
        qua1.setFont(new Font("Arial",Font.BOLD,20));
        qua1.setBounds(300,350,600,30);
        add( qua1);
        
        String valq[]={"MBBS","BTECH","MBA","BCS","BPHARM","AGRI","BCA"};
        qualification= new JComboBox(valq);
        qualification.setBounds(500,350,500,30);
        qualification.setBackground(Color.white);
        add(qualification);
        
        

        occ1=new JLabel("Occupation ");
        occ1.setFont(new Font("Arial",Font.BOLD,20));
        occ1.setBounds(300,400,600,30);
        add( occ1);
        
        String valo[]={"selfemployeed","Doctor","Engineer","Business","HouseWife","Farmer"};
        occupation = new JComboBox(valo);
        occupation.setBounds(500,400,500,30);
        occupation.setBackground(Color.white);
        add(occupation);
        
        addhar1=new JLabel("Addhar No ");
        addhar1.setFont(new Font("Arial",Font.BOLD,20));
        addhar1.setBounds(300,450,600,30);
        add( addhar1);

        addhar=new JTextField();
        addhar.setBounds(500,450,500,30);
        add(addhar);
        
        pancard1=new JLabel("Pan Card No");
        pancard1.setFont(new Font("Arial",Font.BOLD,20));
        pancard1.setBounds(300,500,600,30);
        add( pancard1);

        pancard=new JTextField();
        pancard.setBounds(500,500,500,30);
        add(pancard);

     
        sz1=new JLabel("Senior Citizen ");
        sz1.setFont(new Font("Arial",Font.BOLD,20));
        sz1.setBounds(300,550,600,30);
        add( sz1);
        
        yesz=new JRadioButton("YES");
        yesz.setBounds(600,550,100,30);
        add(yesz);
        
        noz=new JRadioButton("NO");
        noz.setBounds(800,550,100,30);
        add(noz);
       
        ButtonGroup z =new ButtonGroup();
        z.add(yesz);
        z.add(noz);

        
       
        ea1=new JLabel("Existing Account ");
        ea1.setFont(new Font("Arial",Font.BOLD,20));
        ea1.setBounds(300,600,600,30);
        add( ea1);
        
        yese=new JRadioButton("Married");
        yese.setBounds(600,600,100,30);
        add(yese);
        
        noe=new JRadioButton("unmarried");
        noe.setBounds(800,600,100,30);
        add(noe);
       
        ButtonGroup n =new ButtonGroup();
        n.add(yese);
        n.add(noe);
        next=new JButton("NEXT");
        next.setBounds(900, 650,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.addActionListener( this);
        
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
   
////JLabel adda,religion1,category1,income1,qua1,occ1,addhar1,pancard1,sz1,ea1;
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno=""+ random;
         
        String religion1= (String)religion.getSelectedItem();
        String category1= (String)category.getSelectedItem();
        String income1= (String)income.getSelectedItem();
        String qua1 = (String)qualification.getSelectedItem();
        String occ1 = (String)occupation.getSelectedItem();
        String addhar1 =addhar.getText();
        String pancard1=pancard.getText();
        
        String sz1 =null;
        if(yesz.isSelected()){
            sz1="YES";
        } 
        else if(noz.isSelected()){
            sz1="NO";
        }
        String ea1=null;
        if(yese.isSelected()){
            ea1="YES";
        }
        else if(noe.isSelected()){
            ea1="NO";
        }
        
        try {
            if(religion1.equals(" ")){
                JOptionPane.showMessageDialog(null, "Religion is Requried" );
        
            }//JLabel adda,religion1,category1,income1,qua1,occ1,addhar1,pancard1,sz1,ea1;
            else{
                Conn c= new Conn();
                String query ="insert into signuptwo values('"+religion1+"','"+category1+"','"+income1+"','"+qua1+"','"+occ1+"','"+addhar1+"','"+pancard1+"','"+sz1+"','"+ea1+"')" ;
                c.s.executeUpdate(query);
                setVisible(false);
                new signup3(formno).setVisible(true);
                
            }
        }
        catch(Exception ae){
            System.out.println(ae);
        }
        
        
    }
    
     public static void main(String args[]) {
     new signuptwo("");
        
        
    }

	

}
