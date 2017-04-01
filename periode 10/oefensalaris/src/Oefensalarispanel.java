import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;



/**
 *
 * @author Rheo
 */
public class Oefensalarispanel extends JPanel {
 private JTextField txtmaandsal, txtaantmaand , txtjaar,txtvakantie, txtdagkoers;
 private JLabel lblmaandsal, lblaantmaand, lbljaar, lblvakantie, lbldagkoers;
 private JButton btnbereken, btnstaff, btnclear;

 String[] currencies = {"USD", "Euro"};
 JComboBox currencylist = new JComboBox(currencies);
 JLabel lblcurrency = new JLabel();
 
 
 
 
public Oefensalarispanel () {
     setLayout (null);
   
   /*  //combobox shit
     currencylist.setSelectedIndex(1);
     currencylist.addActionListener(staffhandler);
     add(currencylist);
     add(lblcurrency);
*/
     
    //textfield declaration
    txtmaandsal = new JTextField(10);
    txtaantmaand = new JTextField(2);
    txtjaar = new JTextField(10);
    txtvakantie = new JTextField (10);
    txtdagkoers= new JTextField (10);
    
    //label declaration
    lblmaandsal= new JLabel ("mandsalaris");
    lblaantmaand= new JLabel ("aantal maanden");
    lbljaar = new JLabel ("jaarsalaris");
    lblvakantie = new JLabel ("Vakantiegeld");
    lbldagkoers = new JLabel ("dagkoers");
    
    //knop declaration
    btnbereken = new JButton ("Bereken regular");
    btnbereken.addActionListener(new berekenhandler());
    btnstaff = new JButton ("Bereken staff");
    btnstaff.addActionListener(new staffhandler());
    btnclear = new JButton ("clear");
    btnclear.addActionListener(new clearhandler());
    
//    set bounds shit
lblmaandsal.setBounds(80,60,100,25);
txtmaandsal.setBounds (80,80,100,25);
lblaantmaand.setBounds(80,100,75,25);
txtaantmaand.setBounds(80,120,75,25);
lbljaar.setBounds(80,140,75,25);
txtjaar.setBounds(80,160,75,25);
lblvakantie.setBounds(80,180,75,25);
txtvakantie.setBounds(80,200,75,25);
lbldagkoers.setBounds(80,220,75,25);
txtdagkoers.setBounds(80,240,75,25);
btnbereken.setBounds(90,370,185,25);
btnstaff.setBounds(73,400,210,25);
btnclear.setBounds(20,20,75,25);
        
    //elementen op panel toevoegen
        add (lblmaandsal);   
        add (txtmaandsal);
        add (lblaantmaand);
        add (txtaantmaand);

        add (lbljaar);
        add (txtjaar);
        add (lblvakantie);
        add (txtvakantie);
        add (lbldagkoers);
        add (txtdagkoers);
        add (btnbereken);
        add (btnstaff);
        add (btnclear);
 }

class berekenhandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
        String invoersal = txtmaandsal.getText();
        double maand = Double.parseDouble(invoersal);
        String invoermaand = txtaantmaand.getText();
        int aantal = Integer.parseInt(invoermaand);
        double jaarsal = maand * aantal;
        txtjaar.setText (String.format("SRD"+"%8.2f",jaarsal));
        double vak_geld = jaarsal /100 *8;
        txtvakantie.setText (String.format("srd"+"%8.2f",vak_geld));
    }
} 
class staffhandler implements ActionListener {
    public void actionPerformed (ActionEvent e){
        String invoersal = txtmaandsal.getText();
        double maand = Double.parseDouble(invoersal);
        String invoermaand = txtaantmaand.getText();
        int aantal = Integer.parseInt(invoermaand);
        double jaarsal = maand * aantal;
        txtjaar.setText (String.format("SRD"+"%8.2f",jaarsal)); 
        String koers = txtdagkoers.getText();
        double dkoers = Double.parseDouble(koers);
        double vak_geld = jaarsal/100 * 15;
        double koers_geld = vak_geld/dkoers;
        txtvakantie.setText(String.format("%8.2f", koers_geld));
        
        //comboboxshit
        /*
        if (e.getSource()) == currencylist) {
       JComboBox cb = (JComboBox)e.getSource();
       String msg = (String)cb.getSelectedItem();
       switch (msg) {
           case "message 1": lblcurrency.setText("usd");
           break;
           case "message 2": lblcurrency.setText("euro");
           break;
           default: lblcurrency.setText("selecteer een currency idioot");
                   
       }
    }
*/
    }
}
class clearhandler implements ActionListener {
    public void actionPerformed (ActionEvent e){
        txtmaandsal.setText("");
                txtaantmaand.setText(""); 
                txtjaar.setText("");
                txtvakantie.setText("");
                txtdagkoers.setText("");
        
    }
}

}

         
    

