import javax.swing.*;


/**
 *
 * @author Rheo
 */
public class Kwartaal extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new Kwartaal ();
       frame.setSize (425, 400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("Kwartaal bereken ding");
       frame.setContentPane(new Kwartaalpanel ());
       frame.setVisible(true);  
    }
    
}
