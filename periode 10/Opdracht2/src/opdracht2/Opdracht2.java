package opdracht2;
import javax.swing.*;


public class Opdracht2 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new Opdracht2();
        frame.setSize (800 , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Opdracht2");
       
        JPanel Paneel = new Paneel ();
        frame.setContentPane(Paneel);
        frame.setVisible (true);
    }
    
}
