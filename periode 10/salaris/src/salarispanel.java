import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author matabadalrheo
 */
public class salarispanel extends JPanel {
    private JTextField invoervak, maandvak, uitvoervak, vakantievak, dagkoers;
    private JButton knop, clear,staff;
    private JLabel maandlbl, jaarlbl,lblaantal, vakantielbl, dagkoerslbl;
   
    public salarispanel () {
      // setLayout (null);
       maandlbl = new JLabel();
        maandlbl.setText("Maandsalaris");
        jaarlbl = new JLabel ();    
        jaarlbl.setText("Jaarsalaris");
        lblaantal= new JLabel();
        lblaantal.setText("aantal maanden gewerkt");
        vakantielbl= new JLabel ();
        vakantielbl.setText("Vakantiegeld");
        dagkoerslbl = new JLabel();
        dagkoerslbl.setText("dagkoers");

        
        invoervak = new JTextField(10);
        maandvak = new JTextField(3);
        uitvoervak = new JTextField(10);
        vakantievak = new JTextField (10);
        dagkoers = new JTextField (4);
        knop = new JButton ("BEREKEN regular");
        knop.addActionListener(new knophandler());
        clear = new JButton ("wissen");
        clear.addActionListener(new wishandler());
        staff = new JButton ("staff money");
        staff.addActionListener (new staffhandler());

        add (invoervak);
        add (maandlbl);
        add (maandvak);
        add (lblaantal);
        add (knop);
        add (staff);
        add (dagkoers);
        add (dagkoerslbl);
        add (uitvoervak);
        add (jaarlbl);
        add (vakantievak);
        add (vakantielbl);
        add (clear);
    
    }
    class knophandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
         String invoerstring = invoervak.getText();
         double maand = Double.parseDouble(invoerstring);
         String maandstring = maandvak.getText();
         double maantal  = Double.parseDouble(maandstring);
         double jaar = maantal * maand;
         uitvoervak.setText (String.format("SRD"+"%8.2f", jaar)); 
         double vak_geld = jaar /100 * 8;
         vakantievak.setText (String.format("srd" + "%8.2f", vak_geld));
     
        }
    }
    class staffhandler implements ActionListener {
        public void actionPerformed (ActionEvent e){
            String invoerstring = invoervak.getText();
         double maand = Double.parseDouble(invoerstring);
         String maandstring = maandvak.getText();
         double maantal  = Double.parseDouble(maandstring);
         double jaar = maantal * maand;
         uitvoervak.setText (String.format("SRD"+"%8.2f", jaar));    
         String koersinvoer = dagkoers.getText();
         double koers = Double.parseDouble(koersinvoer);
         double vak_geld = jaar/100 * 15;
         double koers_geld = vak_geld/koers;
         vakantievak.setText (String.format( "%8.2f", koers_geld));
        }
    }
  
    class wishandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
         invoervak.setText("");
         maandvak.setText("");
         uitvoervak.setText("");
         vakantievak.setText("");
        }
    }
    } 



