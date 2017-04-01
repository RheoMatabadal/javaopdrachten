package vb0307;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Vb0307 extends JFrame{

    public static void main(String[] args) {
       JFrame frame= new Vb0307();
       frame.setSize(400,200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Voorbeeld 0307");
       frame.setContentPane(new Optelpaneel());
       frame.setVisible(true);
    }
    
}
//paneel met 3 tekstvakken
class Optelpaneel extends JPanel {
    private JTextField invoervak1, invoervak2, resultaatvak;
    private JButton plusknop;
    
    public Optelpaneel(){
        invoervak1 = new JTextField(10);
        invoervak2= new JTextField(10);
        resultaatvak= new JTextField(10);
        plusknop = new JButton ("+");
        plusknop.addActionListener(new plusknopHandler() );
        
        add (invoervak1);
        add (invoervak2);
        add (plusknop);
        add (resultaatvak);
    } 
    //inwendige klasse
    class plusknopHandler implements ActionListener { 
        public void actionPerformed (ActionEvent e ){
            String invoerstring1 = invoervak1.getText();
            int getal1 = Integer.parseInt (invoerstring1);
            
            String invoerstring2 = invoervak2.getText();
            int getal2 = Integer.parseInt(invoerstring2);
            
            int resultaat = getal1 + getal2;
            
            resultaatvak.setText(""+resultaat);
            
        }
    }
        
}

