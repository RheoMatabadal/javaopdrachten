
package opdrweek1;
//import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 


public class Opdrweek1 extends JFrame {

   
    public static void main(String[] args) {
        JFrame frame = new Opdrweek1();
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Opdracht week 1 ");
       JPanel paneel = new Paneel();
     frame.setContentPane(paneel);
        frame.setVisible(true);
    }
   }

 class Paneel extends JPanel {
    private JTextField getal1;
    private JTextField getal2;
    private JTextField somVak; 
    private JTextField verschilVak;
    private JTextField quotientVak;
    private JTextField productVak;
    private JButton knop;
    private JButton wissknop;
    
    public Paneel(){
        getal1 = new JTextField(10);
        getal2 = new JTextField (10);
        somVak = new JTextField(10);
        verschilVak = new JTextField (10);
        quotientVak = new JTextField (10);
        productVak = new JTextField (10);
        knop = new JButton("Bereken");
        knop.addActionListener(new InvoerVakHandler());
        
        add(getal1);
        add(getal2);
        add(somVak);
        add(verschilVak);
        add(quotientVak);
        add(productVak);
        add(knop);
     
        
    }
    
   class InvoerVakHandler implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
            String invoerstring1 = getal1.getText();
            double antwoord1 = Double.parseDouble(invoerstring1);
            
            String invoerstring2 = getal2.getText();
            double antwoord2 = Double.parseDouble(invoerstring2);
            
            double som = antwoord1 + antwoord2; 
            somVak.setText("" + som);
            
            double verschil = antwoord1 - antwoord2;
            verschilVak.setText(""+ verschil);
            
            double quotient = antwoord1/antwoord2;
            quotientVak.setText("" + quotient);
            
            double product = antwoord1 * antwoord2;
            productVak.setText("" + product); 
        }     
        
    }
    }

