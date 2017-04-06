import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
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
        double Yas;
        
        // formaterign 
         DecimalFormat form = new DecimalFormat("###.#");
         
        //discriminant
        Disc = Math.pow(B,2)-4*A*C;
        txtDisc.setText(String.format("%8.0f",Disc));
       
        if (Disc >= 0 ) {
           double x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A);
        double x2 = (-B-Math.sqrt(B*B-4*A*C))/(2*A);
        txtX.setText(String.format("%8.1f",x1, "en", x2  ));  
         
        txtXas.setText("("    +  form.format (x1) + (",0)"));
        txtXas.setText("("    +  form.format (x2) + (",0)"));
        // die outputting hiervan nog checken moet string zijn want int gaat t optellen
        }
        else if (Disc == 0){
           double x1 = (-B+Math.sqrt(B*B-4*A*C))/(2*A); 
           txtX.setText(String.format("%8.1f", x1));  
            txtXas.setText("("    +  form.format (x1) + (",0)"));
        }
       
        else {
           txtX.setText("geen geldige wortel"); 
        }    
        
        
       // snijpunt y as
         Yas = A*Math.pow(0,2)+B*0+C;
           txtYas.setText("(0,"    +  form.format (Yas) + (")"));
    
           // parabool
       if ( A == 0){
               
               txtParab.setText ("geen parabool");
               
               
           }else if ( A < 0){
               txtParab.setText ("Berg Parabool");
               
               
           }else if (A > 0)     {
               
               txtParab.setText ("Dal Parabool");
               
           }
        
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

    

