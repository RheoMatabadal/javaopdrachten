
package paneel;
import javax.swing.*;
public class Paneel extends JPanel {
    private JButton knop;
    private JTextField tekstvak; 
            
    public Paneel(){
knop = new JButton ("klik");
tekstvak = new JTextField(10);
add (knop);
add (tekstvak);
    }
    
}
