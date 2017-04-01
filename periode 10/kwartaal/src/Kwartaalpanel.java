import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Rheo
 */
public class Kwartaalpanel extends JPanel {
    private JTextField kw1, kw2, kw3, kw4, jaar,gemid;
    private JButton bereken, clear;
    private JLabel lbl1, lbl2, lbl3, lbl4, lbljaar, lblgemid;
    
    public Kwartaalpanel () {
        //label declarations
        lbl1 = new JLabel();
        lbl1.setText("1e Kwartaal");
        lbl2 = new JLabel();
        lbl2.setText("2e kwartaal");
        lbl3 = new JLabel();
        lbl3.setText("3e kwartaal");
        lbl4 = new JLabel();
        lbl4.setText("4e kwartaal");
        lbljaar = new JLabel();
        lbljaar.setText("Jaar omzet");
        lblgemid = new JLabel ();
        lblgemid.setText("gemiddelde kwartaal omzet");
        
        //textfield declarations
        kw1 = new JTextField(20);
        kw2 = new JTextField(20);
        kw3 = new JTextField(20);
        kw4 = new JTextField(20);
        jaar = new JTextField(20);
        gemid = new JTextField(20);
       
        // button declaration + actionlistener
        bereken = new JButton ("Bereken");
        bereken.addActionListener(new berekenhandler());
        clear = new JButton ("wissen");
        clear.addActionListener(new wishandler());
        
        // elementen toevoegen
        add (lbl1);
        add (kw1);
        add (lbl2);
        add (kw2);
        add (lbl3);
        add (kw3);
        add (lbl4);
        add (kw4);
        add (bereken);
        add (lbljaar);
        add (jaar);
        add (lblgemid);
        add (gemid);
        add (clear);
              
    } 
    class berekenhandler implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String str1 = kw1.getText();
            int kw1 = Integer.parseInt(str1);
            String str2 = kw2.getText();
            int kw2 = Integer.parseInt(str2);
            String str3 = kw3.getText();
            int kw3 = Integer.parseInt(str3);
            String str4 = kw4.getText();
            int kw4 = Integer.parseInt(str4);
            double jaaromzet = kw1 + kw2 + kw3 + kw4;
            jaar.setText(String.format("srd" + "%.0f",jaaromzet));
            
            double kwartomzet = jaaromzet /4 ;
            gemid.setText(String.format("srd"+ "%.0f", kwartomzet));
            
        }
          
    }
    class wishandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
         kw1.setText("");
         kw2.setText("");
         kw3.setText("");
         kw4.setText("");
         jaar.setText("");
         gemid.setText("");
        }
    }
    
}
