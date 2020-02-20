package swing_work;

import javax.swing.*;    
import java.awt.event.*;    

class GUI3 extends JFrame implements ActionListener{ 
	
JRadioButton r1,r2;    
JButton b;    
GUI3(){
	
JFrame f = new JFrame("Main page");
r1=new JRadioButton("Employee");    
r1.setBounds(100,50,100,30);      
r2=new JRadioButton("Manager");    
r2.setBounds(100,100,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
f.add(r1);f.add(r2);f.add(b);    
f.setSize(300,300);    
f.setLayout(null);    
f.setVisible(true);    
}

GUI3(String a){
	//Name, Title, Age, Years of Experience 
	//Highest Degree Earned, Salary, and Promotion Bonus
	JFrame f1= new JFrame("Manager");
	JButton b1; 
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;  
    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
    l1=new JLabel("Name");  
    l1.setBounds(50,50, 200,100);  
    l2=new JLabel("Title");  
    l2.setBounds(50,100, 200,100);  
    l3=new JLabel("Age");  
    l3.setBounds(50,150, 200,100);  
    l4=new JLabel("Years of Experience");  
    l4.setBounds(50,200, 200,100); 
    l5=new JLabel("Highest Degree Earned");  
    l5.setBounds(50,250, 200,100);  
    l6=new JLabel("Salary");  
    l6.setBounds(50,300, 200,100); 
    l7=new JLabel("Promotion Bonus");  
    l7.setBounds(50,350, 200,100);  
    l8=new JLabel("Percentage raise in salary");  
    l8.setBounds(50,400, 200,100); 
    tf1=new JTextField();  
    tf1.setBounds(250,90,150,25);  
    tf2=new JTextField();  
    tf2.setBounds(250,140,150,25);  
    tf3=new JTextField();  
    tf3.setBounds(250,190,150,25);  
    tf4=new JTextField();  
    tf4.setBounds(250,240,150,25);  
    tf5=new JTextField();  
    tf5.setBounds(250,290,150,25);  
    tf6=new JTextField();  
    tf6.setBounds(250,340,150,25); 
    tf7=new JTextField();  
    tf7.setBounds(250,390,150,25); 
    tf8=new JTextField();  
    tf8.setBounds(250,440,150,25); 
    f1.add(l1); f1.add(l2);f1.add(l3); f1.add(l4);f1.add(l5); f1.add(l6);f1.add(l7);f1.add(l8);
    f1.add(tf1); f1.add(tf2);f1.add(tf3); f1.add(tf4);f1.add(tf5); f1.add(tf6);f1.add(tf7);f1.add(tf8);
    b=new JButton("Submit");  
    b.setBounds(50,490,100,30);  
    b.addActionListener(new ActionListener() {
        @Override 
        public void actionPerformed(ActionEvent e)
             {        	
        	 String s1=tf1.getText();  
             String s2=tf2.getText();
             String s3=tf3.getText();  
             String s4=tf4.getText();
             String s5=tf5.getText(); 
             String s6=tf6.getText();  
             String s7=tf7.getText();
             String s8=tf8.getText();
             JOptionPane.showMessageDialog(f1,"submitted");
             System.out.println("your details are "+s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8);
        	} 
        
        }
    );
    b1=new JButton("calculate");  
    b1.setBounds(200,490,100,30);  
    b1.addActionListener(new ActionListener() {
        @Override 
        public void actionPerformed(ActionEvent e)
             { 
        	double mySalary = Double.parseDouble(tf6.getText());
        	double percent = Double.parseDouble(tf8.getText());
        	mySalary = mySalary + 0.93 * percent * 0.01 * mySalary;  
        	System.out.println(mySalary);
        	JOptionPane.showMessageDialog(f1,"New salary is "+Double.toString(mySalary));
             } 
        }
    );
    f1.add(b);f1.add(b1);
    f1.setSize(500,600);  
    f1.setLayout(null);  
    f1.setVisible(true);  
}
public void actionPerformed(ActionEvent e){    
if(r1.isSelected()){    
	JOptionPane.showMessageDialog(this,"You are Employee.");       
}    
if(r2.isSelected()){    
	new GUI3("manager");
}    
}

public static void main(String args[]){    
new GUI3();    
}}   
