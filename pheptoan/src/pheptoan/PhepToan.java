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

