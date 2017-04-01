
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPanel;



/**
 *
 * @author Kay-G
 */
public class herpanel extends JPanel {
    
    private JTextField txthyp, txtuitkomst, txtuitkomstUsd;
    private JButton btnbereken;
    private JLabel lblhyp, lbluitkomst ;
    
    public herpanel () {
        
        
        txthyp = new JTextField(10);
        txtuitkomst = new JTextField(10);
        txtuitkomstUsd = new JTextField(10);

        
      lblhyp = new JLabel("Hypotheek");
      lbluitkomst = new JLabel("Uitkomst");
      
      lblhyp.setBounds(120, 50, 90, 20);
      txthyp.setBounds(180, 50, 90, 20);
      lbluitkomst.setBounds(120, 80, 90, 20);
      txtuitkomst.setBounds(180, 80, 90, 20);
      txtuitkomstUsd.setBounds(180, 110, 90, 20);
      btnbereken.setBounds(180, 140, 90, 20);
      
      add(btnbereken);
      add(txthyp);
      add(txtuitkomst);
      add(txtuitkomstUsd);
      add(lblhyp);
      add(lbluitkomst);
      
     btnbereken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double hypotheek = Double.parseDouble(txthyp.getText());
                double formule;
                double restant;
                double koers  = 7.62;
                if(hypotheek<= 1500){
                    formule = ((hypotheek) + (hypotheek* 0.20));
                    txtuitkomst.setText (String.format("%8.2f" , formule));
                    
                }
                else if (hypotheek>1500 && hypotheek <= 3000){
                    
                    restant = hypotheek - 1500;
                    formule = ((hypotheek) + (hypotheek* 0.30));
                    txtuitkomst.setText (String.format("%8.2f" , formule)); 
                    
                }
                
                else if (hypotheek >3000 && hypotheek <= 4500){
                    
                    restant = hypotheek - 3000;
                    formule = ((hypotheek) + (hypotheek* 0.5));
                    txtuitkomst.setText (String.format("%8.2f" , formule));
                    
                }
                else if (hypotheek > 4500 && hypotheek <=6000){
                    
                    restant = hypotheek - 4500;
                    formule = ((hypotheek) + (hypotheek* 0.75));
                    txtuitkomst.setText (String.format("%8.2f" , formule));
            }
                
                
            }
            
        });
}
}     
                
                
                
                
                
                
                
                
            
    
              



    
