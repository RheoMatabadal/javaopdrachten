import javax.swing.*;



public class Oefening66 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new Oefening66 ();
        frame.setSize (500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("oefening 6.6");
        frame.setContentPane( new Panel ());
       
        frame.setVisible(true);
    }
    
}