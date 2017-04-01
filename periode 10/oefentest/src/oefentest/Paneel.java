
package oefentest;
import java.awt.event.*;
import javax.swing.*;


public class Paneel extends JPanel{
    private JButton knop;
    private JButton wisknop;
    private JTextField getal1;
    private JTextField getal2;
    private JTextField somBox;
    private JTextField verschilBox;
    private JTextField productBox;
    private JTextField quotientBox;
    
 public Paneel () {
     
     knop = new JButton("klik");
     knop.addActionListener(new InvoerVakHandler());
     wisknop= new JButton ("wissen");
     wisknop.addActionListener(new WisHandler());
     getal1 = new JTextField (10);
     getal2 = new JTextField(10);
     somBox = new JTextField(10);
     somBox.setEditable(false);
     verschilBox = new JTextField(10);
     verschilBox.setEditable(false);
     productBox = new JTextField(10);
     productBox.setEditable(false);
     quotientBox = new JTextField(10);
     quotientBox.setEditable(false);

             
     add (knop);
     add (wisknop);
     add (getal1);
     add (getal2);
     add (somBox);
     add (verschilBox);
     add (productBox);
     add (quotientBox);
 }
 
 class InvoerVakHandler implements ActionListener   {
     public void actionPerformed( ActionEvent e ) { 
         String invoer1 = getal1.getText();
         Integer ant1 = Integer.parseInt(invoer1);
         
         String invoer2 = getal2.getText();
         Integer ant2 = Integer.parseInt(invoer2);
         
         int som = ant1+ ant2; 
            somBox.setText(""+som);
            
           int verschil = ant1-ant2;
            verschilBox.setText(""+verschil);
            
            int quotient = ant1/ant2;
            quotientBox.setText(""+quotient);
            
            int product = ant1*ant2;
            productBox.setText(""+product);  
         } 
     
 }  ;
 class WisHandler implements ActionListener {
     public void actionPerformed (ActionEvent e){
         getal1.setText("");
         getal2.setText("");
         somBox.setText("");
         verschilBox.setText("");
         quotientBox.setText("");
         productBox.setText("");
     }
 }
   
}
