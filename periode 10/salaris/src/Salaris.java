import javax.swing.*;

/**
 *
 * @author matabadalrheo
 */
public class Salaris extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new Salaris ();
       frame.setSize (300, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Jaarekening");
       frame.setContentPane(new salarispanel ());
       frame.setVisible(true);    
    }
    
}


