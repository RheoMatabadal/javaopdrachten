import javax.swing.*;

 


/**
 *
 * @author Rheo
 */
public class Jaarsec extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new Jaarsec ();
       frame.setSize (400, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Jaar to seconds");
       frame.setContentPane(new Jaarsecpanel ());
       frame.setVisible(true);
    }
    
}
