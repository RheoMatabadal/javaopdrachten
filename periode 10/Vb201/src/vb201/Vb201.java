
package vb201;
import javax.swing.*;

public class Vb201 extends JFrame{

    public static void main(String[] args) {
     JFrame frame = new Vb201();
     frame.setSize(400,200);
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setTitle("Eerste applicatie in java");
     JPanel paneel = new Paneel();
     frame.setContentPane(paneel);
     frame.setVisible(true);
    }
}
class Paneel extends JPanel
{
    private JButton knop;
    private JTextField tekstvak;
    public Paneel () 
    {
    knop= new JButton ("klik");
    tekstvak = new JTextField(10);
    add (knop);
    add(tekstvak);
}
}

