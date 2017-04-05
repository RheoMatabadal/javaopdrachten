import javax.swing.*;
import java.awt.event.*;
public class panel extends JPanel {
    
    private JTextField txtA , txtB , txtC, txtX, txtXas, txtYas,txtDisc, txtParab  ;
    private JLabel lblA, lblB, lblC, lblX, lblXas, lblYas, lblDisc, lblParab, lblVerg;
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
   lblVerg = new JLabel();
   
   btnBereken = new JButton ("Bereken");
   btnBereken.addActionListener(new berekenhandler());
   btnReset = new JButton ("Reset");
  btnReset.addActionListener(new resethandler());
   
   //hier komt setbounds shit 
   add (lblA);
   add (txtA);
   add (lblB);
   add (txtB);
   add (lblC);
   add (txtC);
   add (lblX);
   add (txtX);
   add (lblXas);
   add (txtXas);
   add (lblYas);
   add (txtYas);
   add (lblDisc);
   add (txtDisc);
   add (lblParab);
   add (txtParab);
   add (btnBereken);
   add (btnReset);
   add (lblVerg);
    }
  
class berekenhandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
        
        String getA = txtA.getText();
        double A = Double.parseDouble(getA);
        String getB = txtB.getText();
        double B = Double.parseDouble(getB);
        String getC = txtC.getText();
        double C = Double.parseDouble(getC);
        double Disc ;
        
        Disc = Math.pow(B,2)-4*A*C;
        if (Disc >= 0 ) {
            
        }
            
            
        double x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
        double x2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
        lblVerg.setText(String.format("%8.1f", x2));
        txtX.setText(String.format("%8.1f", x1));
        
        
        
    }
}

class resethandler implements ActionListener {
    public void actionPerformed (ActionEvent e) {
      txtA.setText("");
      txtB.setText("");
      txtC.setText("");
      txtX.setText("");
      txtXas.setText("");
      txtYas.setText("");
      txtDisc.setText("");
      txtParab.setText("");
      lblVerg.setText("");
              
        
}
    
}
}

    

