
package oefentest;

import javax.swing.*;



public class Oefentest extends JFrame {

 
    public static void main(String[] args) {
        // hier gaan we die frame bouwen 
        JFrame frame = new Oefentest();
        frame.setSize (600 , 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("oefenframe");
        
        JPanel Paneel = new Paneel ();
        frame.setContentPane(Paneel);
        frame.setVisible (true);
        
    }
    
}
