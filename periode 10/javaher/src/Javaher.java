import javax.swing.*;


/**
 *
 * @author Kay-G
 */
public class Javaher extends JFrame {

   
    public static void main(String[] args) {
       JFrame frame = new Javaher ();
       frame.setSize (300, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("BankApp");
       frame.setContentPane(new herpanel ());
       frame.setVisible(true); 
    }
  
}
