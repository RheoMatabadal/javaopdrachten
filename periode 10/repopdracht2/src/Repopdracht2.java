import javax.swing.*;



public class Repopdracht2 extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new Repopdracht2 ();
        frame.setSize (400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("firgos pennen");
        frame.setContentPane( new panel ());
       
        frame.setVisible(true);
    }
    
}
