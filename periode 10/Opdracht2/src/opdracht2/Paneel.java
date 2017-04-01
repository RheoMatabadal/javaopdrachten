package opdracht2;
import java.awt.event.*;
import javax.swing.*;

public class Paneel extends JPanel {
    private JButton berekenbtn;
    private JButton resetbtn;
    private JTextField honderdBox;
    private JTextField vijftigBox;
    private JTextField twintigBox;
    private JTextField tienBox;
    private JTextField vijfBox;
    private JTextField eenBox;
    private JTextField kwartjeBox;
    private JTextField tiencentBox;
    private JTextField eencentBox;
    private JTextField bedragBox;
    
public Paneel (){
   
    honderdBox = new JTextField(10);
    vijftigBox = new JTextField (10);
    twintigBox = new JTextField(10);
    tienBox = new JTextField(10);
    vijfBox = new JTextField(10);
    eenBox = new JTextField(10);
    kwartjeBox = new JTextField(10);
    tiencentBox = new JTextField (10);
    eencentBox = new JTextField(10);
    bedragBox = new JTextField (10);
    bedragBox.setEditable(false);
    berekenbtn = new JButton ("Bereken");
    berekenbtn.addActionListener(new knopHandler());
    resetbtn = new JButton ("reset");
  resetbtn.addActionListener(new wisHandler());
    
    add (honderdBox);
    add (vijftigBox);
    add (twintigBox);
    add (tienBox);
    add (vijfBox);
    add (eenBox);
    add (kwartjeBox);
    add (tiencentBox);
    add (eencentBox);
    add (bedragBox);
    add (berekenbtn);
    add (resetbtn);
    
 
    
    
    
    
}         
    
    
}    
    

