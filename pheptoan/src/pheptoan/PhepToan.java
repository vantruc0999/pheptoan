package pheptoan;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 
public class PhepToan extends JFrame implements ActionListener{
       private JButton btn1, btn2, btn3, btn4;
       private JTextField tf1, tf2, tf3;
       private double result;
       private Container container;
       private JPanel panel1, panel2;
 
       public PhepToan(String s) { 
    	   super(s);
           container = this.getContentPane(); 
           JLabel num1 = new JLabel("Số thứ nhất: ");
           tf1 = new JTextField();
           JLabel num2 = new JLabel("Số Thứ hai: ");
           tf2 = new JTextField();
           JLabel resultl = new JLabel("Kết quả là: ");
           tf3 = new JTextField();
           tf3.setEditable(false);

           panel1 = new JPanel(); 
           panel1.setLayout(new GridLayout(3,2));
       
           panel1.add(num1); 
           panel1.add(tf1); 
           panel1.add(num2); 
           panel1.add(tf2);
           panel1.add(resultl);
           panel1.add(tf3);    
       }
 
       //Thuc hien phep cong
       public void Add() 
       { 
    	   
       }
       //Thuc hien phep tru
       public void Minus() 
       { 
            
       } 
       //Thuc hien phep nhan
       public void Mult() 
       { 
            
       }
       //Thuc hien phep chia
       public void Divide() 
       { 
           
       }

       public void actionPerformed(ActionEvent e) 
       { 
            if (e.getActionCommand()=="+") {
                
            }
               
            if (e.getActionCommand()=="-") {
               
            }
            
            if (e.getActionCommand()=="*") {
                
            }
            
            if (e.getActionCommand()=="/") {
                
            }  
       }
       
    public static void main(String[] args) {
        PhepToan cal = new PhepToan("SimpleCalculator");
       cal.setLocationRelativeTo(null);
    }  
}

