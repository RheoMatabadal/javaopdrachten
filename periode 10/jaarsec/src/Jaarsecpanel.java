

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Rheo
 */
public class Jaarsecpanel extends JPanel {
    private JTextField jaar;
    private JLabel lblresult;
    private JButton calculate, clear;
    
public Jaarsecpanel(){
    jaar = new JTextField(4);
    calculate = new JButton ("calculate");
    calculate.addActionListener(new berekenhandler());
    lblresult = new JLabel();
    clear = new JButton ("wissen");
    clear.addActionListener(new wishandler());
    
    
    add (jaar);
    add (calculate);
    add (clear);
    add (lblresult);
    
    
}
    
}

class berekenhandler implements ActionListener {
    public void actionPerformed (ActionEvent e){
        String jaarinvoer = jaar.getText();
        int jaar = Integer.parseInt(jaarinvoer);
        
        if ((jaar % 400 == 0)||((jaar %4 == 0)&&(jaar % 100 !=0)))
            lblresult.setText("31 622 400 seconds");
        
        else
            lblresult.setText("31 556 926 seconds");
        
    }
}

class wishandler implements ActionListener {
        public void actionPerformed (ActionEvent e) {
         jaar.setText("");
         lblresult.setText("");
        }
    }
