package Oefensalaris;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Rheo
 */
public class Oefensalarispanel extends JPanel {
 private JTextField txtmaandsal, txtaantmaand , txtjaar,txtvakantie, txtdagkoers;
 private JLabel lblmaandsal, lblaantmaand, lbljaar, lblvakantie, lbldagkoers;
 private JButton btnbereken, btnstaff, btnclear;
 
public Oefensalarispanel () {
    // setLayout (null);
   
    //textfield declaration
    txtmaandsal = new JTextField(100);
    txtaantmaand = new JTextField(2);
    txtjaar = new JTextField(100);
    txtvakantie = new JTextField (100);
    txtdagkoers= new JTextField (100);
    
    //label declaration
    lblmaandsal= new JLabel ("maandsalaris");
 //   lblmaandsal.setText("Maandsalaris");
    
            
    
 }
         
    
}
