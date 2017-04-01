
import javax.swing.*;
/**
 *
 * @author Rheo
 */
public class Oefensalaris extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Oefensalaris();
        frame.setSize (400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("salaris");
        frame.setContentPane( new Oefensalarispanel ());
       
        frame.setVisible(true);
              
        
    }
    
}
