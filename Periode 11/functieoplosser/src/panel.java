import javax.swing.*;
import java.awt.event.*;
public class panel extends JPanel {
    
    private JTextField txtA , txtB , txtC, txtX, txtXas, txtYas,txtDisc, txtParab  ;
    private JLabel lblA, lblB, lblC, lblX, lblXas, lblYas, lblDisc, lblParab;
    private JButton btnBereken, btnReset;
    
    public panel () {
   // setLayout (null);
   txtA = new JTextField(5);
   txtB = new JTextField(5);
   txtC = new JTextField(5);
   txtX = new JTextField (10);
   txtXas = new JTextField (10);
   txtYas = new JTextField (10);
   txtDisc = new JTextField (10);
   txtParab = new JTextField (10);
   
   lblA = new JLabel("Vul A in");
   lblB = new JLabel("vul B in");
   lblC = new JLabel ("vul C in");
   lblX = new JLabel ("Xwaarde");
   lblXas = new JLabel ("snijpunt X-as");
   lblYas = new JLabel ("snijpunt y-as");
   lblDisc = new JLabel ("De discriminant is");
   lblParab = new JLabel ("De parabool van deze vergelijking is");
   
   btnBereken = new JButton ("Bereken");
//   btnBereken.addActionListener(new berekenhandler());
   btnReset = new JButton ("Reset");
//   btnReset.addActionListener(new resethandler());
   
   //hier komt setbounds shit 
   
   
   
   
   
}
    

}