import javax.swing.*;



public class Functieoplosser extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new Functieoplosser ();
        frame.setSize (500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("2e graads functie oplosser");
        frame.setContentPane( new panel ());
       
        frame.setVisible(true);
    }
    
}
