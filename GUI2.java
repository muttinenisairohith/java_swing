package swing_work;

import javax.swing.*;    
import java.awt.event.*;    

class GUI2 extends JFrame implements ActionListener{    
JRadioButton r1,r2;    
JButton b;    
GUI2(){      
r1=new JRadioButton("Employee");    
r1.setBounds(100,50,100,30);      
r2=new JRadioButton("Manager");    
r2.setBounds(100,100,100,30);    
ButtonGroup bg=new ButtonGroup();    
bg.add(r1);bg.add(r2);    
b=new JButton("click");    
b.setBounds(100,150,80,30);    
b.addActionListener(this);    
add(r1);add(r2);add(b);    
setSize(300,300);    
setLayout(null);    
setVisible(true);    
}

public void actionPerformed(ActionEvent e){    
if(r1.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Employee.");    
}    
if(r2.isSelected()){    
JOptionPane.showMessageDialog(this,"You are Manager.");    
}    
}

public static void main(String args[]){    
new GUI2();    
}}   
