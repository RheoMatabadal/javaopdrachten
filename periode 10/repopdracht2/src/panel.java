import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;


/**
 *
 * @author Rheo
 */
public class panel extends JPanel {
    
    private JTextField txtaantal, txtdagkoers, txtsrd, txteuro;
    private JLabel lblaantal, lbldagkoers, lblsrd, lbleuro;
    private JButton btnbereken, btnclear;
       
    
    public panel (){
       setLayout (null);
       txtaantal = new JTextField(10);
       txtdagkoers = new JTextField(5);
       txtsrd = new JTextField(10);
       txteuro = new JTextField(10);
       
       lblaantal = new JLabel("aantal");
       lbldagkoers = new JLabel("dagkoers");
       lblsrd = new JLabel ("bedrag in srd");
       lbleuro = new JLabel ("bedrag in euro");
       
    btnbereken = new JButton ("Bereken");
    btnbereken.addActionListener(new berekenhandler());
    btnclear = new JButton ("clear");
    btnclear.addActionListener(new wisshandler ());
   
    lblaantal.setBounds(80,60,100,25);
txtaantal.setBounds (80,80,100,25);
lbldagkoers.setBounds(80,100,75,25);
txtdagkoers.setBounds(80,120,75,25);
lbleuro.setBounds(80,140,100,25);
txteuro.setBounds(80,160,100,25);
lblsrd.setBounds(80,180,100,25);
txtsrd.setBounds(80,200,100,25);

btnbereken.setBounds(90,370,185,25);

btnclear.setBounds(20,20,75,25);
    add (lblaantal);
    add (txtaantal);
    add (lbldagkoers);
    add(txtdagkoers);
    add (lbleuro);
    add (txteuro);
    add (lblsrd);
    add (txtsrd);
    add (btnbereken);
    add (btnclear);
    }
    class berekenhandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
        String getaantal = txtaantal.getText();
        int aantal = Integer.parseInt(getaantal);
        String getdagkoers = txtdagkoers.getText();
        double dagkoers = Double.parseDouble(getdagkoers);
        
        
        if (aantal < 10){
            double euro = aantal *2.00;
            txteuro.setText(String.format("Euro"+"%8.2f",euro));
            double srd = euro * dagkoers;
            txtsrd.setText(String.format("SRD"+"%8.2f",srd));
           
} 
       else if ( aantal >= 10 && aantal < 50 )  {
         double euro1 = aantal* 1.50;
            txteuro.setText(String.format("Euro"+"%8.2f",euro1));
            double srd1 = euro1 * dagkoers;     
            txtsrd.setText(String.format("SRD"+"%8.2f",srd1));
    }
       else if ( aantal >= 50 && aantal <100) {
        double euro = aantal* 1.25;
            txteuro.setText(String.format("Euro"+"%8.2f",euro));
            
            double srd = euro * dagkoers;     
            txtsrd.setText(String.format("SRD"+"%8.2f",srd));
    }
       else if (aantal >= 100){
        double euro = aantal* 1.10;
            txteuro.setText(String.format("Euro"+"%8.2f",euro));
            double srd = euro* dagkoers;     
            txtsrd.setText(String.format("SRD"+"%8.2f",srd));
    }
     
        
        
    }
}
    class wisshandler implements ActionListener {
    public void actionPerformed (ActionEvent e){
        txtaantal.setText("");
                txtsrd.setText(""); 
                txteuro.setText("");
                txtdagkoers.setText("");
                
    }
    }
}
    
            
       
       
       
       
       
       
    
    

